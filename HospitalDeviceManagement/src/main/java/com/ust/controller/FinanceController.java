package com.ust.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.Finance;
import com.ust.service.FinanceService;

@RestController
@RequestMapping("/finance")
public class FinanceController {
	@Autowired
	FinanceService finserObj;

	@PostMapping("/add")
	public ResponseEntity<String> addFinance(@RequestBody Finance fin){
		int iobj=finserObj.addFinance(fin);
		String mg= "Finance Id "+iobj+" Record Inserted Successfully ";
		return new ResponseEntity<String>(mg,HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateFinance(@RequestBody Finance fin){
		String mg;
		boolean bobj=finserObj.isPresent(fin.getFId());
		if(bobj) {
			finserObj.updateFinance(fin);
			mg= "Finance Record updated  Successfully ";
			return new ResponseEntity<String>(mg,HttpStatus.OK);
		}else {		
			mg= "No DataFound Based on Finance Id ";
			return new ResponseEntity<String>(mg,HttpStatus.OK);
		}	
	}
	@GetMapping("/search/{id}")
	public Optional<Finance> searchFinanceById(@PathVariable int id){
		Optional<Finance> eobj=finserObj.getFinanceById(id);
		return eobj;
	}


	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteFinanceById(@PathVariable int id){
		String mg;
		boolean bobj=finserObj.isPresent(id);
		if(bobj) {
			finserObj.deleteById(id);
			mg= "Finance Record Deleted  Successfully ";
			return new ResponseEntity<String>(mg,HttpStatus.OK);
		}else {		
			mg= "No DataFound Based on Finance Id "+id;
			return new ResponseEntity<String>(mg,HttpStatus.OK);
		}	
	}

	@GetMapping("/list")
	public List<Finance> getAllfinRecords(){
		return finserObj.listAllFinance();
	}



}



