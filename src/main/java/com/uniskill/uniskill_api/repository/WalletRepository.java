package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletRepository extends JpaRepository<Wallet, UUID> {
}
