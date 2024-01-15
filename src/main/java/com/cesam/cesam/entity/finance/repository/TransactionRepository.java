package com.cesam.cesam.entity.finance.repository;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.finance.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
