package com.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Contact;

public interface ContactRepositries extends JpaRepository<Contact,Long> {

}
