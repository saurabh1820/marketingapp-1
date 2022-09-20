package com.marketingA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingA.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
