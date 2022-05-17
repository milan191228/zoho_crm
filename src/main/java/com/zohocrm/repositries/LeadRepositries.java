package com.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Lead;

public interface LeadRepositries extends JpaRepository<Lead, Long> {

}
