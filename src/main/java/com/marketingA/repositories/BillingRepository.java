package com.marketingA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingA.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
