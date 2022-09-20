package com.marketingA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingA.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
