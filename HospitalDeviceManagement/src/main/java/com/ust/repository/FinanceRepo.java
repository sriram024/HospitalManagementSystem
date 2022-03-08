package com.ust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Finance;

@Repository
public interface FinanceRepo extends JpaRepository<Finance,Integer> {

}

