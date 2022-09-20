package com.marketingA.services;

import java.util.List;

import com.marketingA.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);
	
	public List<Contact> listContacts();

	public Contact getOneContactById(long id);

	public void deleteOneContact(long id);
}
