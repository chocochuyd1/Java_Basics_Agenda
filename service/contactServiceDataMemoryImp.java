package com.softtek.java.academy.service;

import java.util.Scanner;

import com.softtek.java.academy.Util.Util;
import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.contactType;

public class contactServiceDataMemoryImp implements contactServiceData {
	
	private Contact[] contacts;
	private int currentIndex;
	private Util util;
	
	public contactServiceDataMemoryImp() {
		contacts = new Contact[100];
		currentIndex = 0;
		util = new Util();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(
				util.generateId(),
				contact.getFirstName(),
				contact.getLastName(),
				contact.getMotherName(),
				contact.getEmail(),
				contact.getPhoneNumber(),
				contact.getContactType()
				);
		
		contacts[currentIndex] = newContact;
		currentIndex++;

		return newContact;
	}
	@Override
	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteContact(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Contact findBydId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Contact findByEmail(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Contact [] findByContactType(contactType ContactType) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Contact[] findAll() {
		Contact[] storeContacts = new Contact[currentIndex];
		
		for (int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];
			if (c != null) {
				storeContacts[i] = c;
			}else {
				break;
			}
			
		}
		return storeContacts;
	}

}
