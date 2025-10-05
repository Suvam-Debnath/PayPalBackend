package com.paypal.transaction_serivce.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypal.transaction_serivce.entity.Transaction;
import com.paypal.transaction_serivce.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository repository;
    private final ObjectMapper objectMapper;

    @Override
    public Transaction createTransaction(Transaction request) {
        request.setTimestamp(LocalDateTime.now());
        request.setStatus("SUCCESS");
        return repository.save(request);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }
}
