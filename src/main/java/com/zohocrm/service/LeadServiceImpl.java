package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Lead;
import com.zohocrm.repositries.LeadRepositries;

@Service
public class LeadServiceImpl implements LeadService{

	@Autowired
	private LeadRepositries leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
	leadRepo.save(lead);
	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

	@Override
	public Lead getlead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deletebyid(long id) {
		leadRepo.deleteById(id);
	}

	

}
