package com.zohocrm.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Billing;

public interface BillingRepositries extends JpaRepository<Billing,Long> {

}
