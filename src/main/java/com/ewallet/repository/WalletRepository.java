package com.ewallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ewallet.model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

}
