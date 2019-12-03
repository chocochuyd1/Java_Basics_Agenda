package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.contactType;

public interface contactServiceData {
	
	public Contact createContact(Contact contact);
	public Contact updateContact(String id, Contact contact);
	public boolean deleteContact(String id);
	public Contact[] findAll();
	public Contact findBydId(String id);
	public Contact findByEmail(String id);
	public Contact[] findByContactType(contactType ContactType);

}
