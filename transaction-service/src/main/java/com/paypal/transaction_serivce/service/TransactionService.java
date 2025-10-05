package com.paypal.transaction_serivce.service;

import com.paypal.transaction_serivce.entity.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
}
