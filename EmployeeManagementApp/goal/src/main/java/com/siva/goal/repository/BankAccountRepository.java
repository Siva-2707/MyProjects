package com.siva.goal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.goal.model.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
