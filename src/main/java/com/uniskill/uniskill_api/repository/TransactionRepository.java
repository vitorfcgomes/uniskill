package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
