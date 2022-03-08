package com.ust.service;

import java.util.List;
import java.util.Optional;

import com.ust.model.Finance;

public interface FinanceService {

	public Integer addFinance(Finance e);
	public void updateFinance(Finance e);
	public boolean isPresent(int id);
	public Optional<Finance> getFinanceById(int id);
	public void deleteById(int id);
	public List<Finance> listAllFinance();

}


