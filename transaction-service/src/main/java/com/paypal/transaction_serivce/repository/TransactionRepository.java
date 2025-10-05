package com.paypal.transaction_serivce.repository;

import com.paypal.transaction_serivce.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
