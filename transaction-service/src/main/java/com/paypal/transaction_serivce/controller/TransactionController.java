package com.paypal.transaction_serivce.controller;

import com.paypal.transaction_serivce.entity.Transaction;
import com.paypal.transaction_serivce.service.TransactionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions/")
@AllArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody Transaction transaction) {

        Transaction created = service.createTransaction(transaction);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/all")
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }

}
