package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Billing;
import com.zohocrm.repositries.BillingRepositries;

@Service
public class BillingServiceImpl implements BillingService{

	@Autowired
	private BillingRepositries billingRepo;
	
	@Override
	public void grnerateOneBill(Billing bill) {
		billingRepo.save(bill);
	}

}
