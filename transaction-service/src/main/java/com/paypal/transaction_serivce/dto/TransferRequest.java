package com.paypal.transaction_serivce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferRequest {

    private Long senderId;
    private Long receiverId;
    private Double amount;

}
