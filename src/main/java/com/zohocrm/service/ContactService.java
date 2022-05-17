package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entites.Contact;

public interface ContactService {
	
	public void saveContact(Contact contact);

	public List<Contact> findAllLeads();
	
	public Contact getContact(long id);

	public void deletebyid(long id);
}
