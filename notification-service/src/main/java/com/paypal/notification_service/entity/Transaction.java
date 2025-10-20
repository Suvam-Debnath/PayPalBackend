package com.paypal.notification_service.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "transaction")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long senderId;

    @Column(nullable = false)
    private Long receiverId;


    @Column(nullable = false)
    @Positive(message = "Amount must be positive")
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private String status;

    @PrePersist
    public void prePersist() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
        if (status == null) {
            status = "PENDING";
        }
    }
}
