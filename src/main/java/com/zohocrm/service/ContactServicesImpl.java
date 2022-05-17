package com.zohocrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entites.Contact;
import com.zohocrm.repositries.ContactRepositries;

@Service
public class ContactServicesImpl implements ContactService{

	@Autowired
	private ContactRepositries contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> findAllLeads() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contact getContact(long id) {
		Contact contact = contactRepo.getById(id);
		return contact;
	}

	@Override
	public void deletebyid(long id) {
		// TODO Auto-generated method stub
		
	}


	
}
