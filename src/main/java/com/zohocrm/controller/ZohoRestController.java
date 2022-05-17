package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entites.Lead;
import com.zohocrm.repositries.LeadRepositries;

@RestController
@RequestMapping("/zoho/api")
public class ZohoRestController {
	
	@Autowired
	LeadRepositries leadRepo;

	@GetMapping
	public List<Lead> getLead(){
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}
	
	@PostMapping
	public void savelead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	

	
}
