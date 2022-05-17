package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entites.Lead;


public interface LeadService {
	
	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();
	
	public Lead getlead(long id);

	public void deletebyid(long id);
}
