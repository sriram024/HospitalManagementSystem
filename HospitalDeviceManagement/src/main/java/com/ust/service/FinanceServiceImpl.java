package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.model.Finance;
import com.ust.repository.FinanceRepo;

@Service
public class FinanceServiceImpl implements  FinanceService{
	
	
	@Autowired
	FinanceRepo fdao;

	@Override
	public Integer addFinance(Finance f) {
		fdao.save(f); //this is Jpa repository method to store in the database.
		return f.getFId();
	}

	@Override
	public void updateFinance(Finance f) {
		fdao.save(f);
		
	}

	@Override
	public boolean isPresent(int id) {
		return fdao.existsById(id);
	}

	@Override
	public Optional<Finance> getFinanceById(int id) {
		return fdao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		fdao.deleteById(id);
		
	}

	@Override
	public List<Finance> listAllFinance() {
		return fdao.findAll();
	}

}
