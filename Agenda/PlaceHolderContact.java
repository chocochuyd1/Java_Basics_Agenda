package com.softtek.java.academy.Agenda;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.contactType;
import com.softtek.java.academy.service.contactServiceData;
import com.softtek.java.academy.service.contactServiceDataMemoryImp;

public class PlaceHolderContact {
	
	private Contact contact;
	private Contact friend;
	
	public static void main(String[] args) {
		PlaceHolderContact p = new PlaceHolderContact();
		p.crearContactos();
		
		contactServiceData csd = new contactServiceDataMemoryImp();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		
		Contact[] contacts = csd.findAll();
		
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
	}
	
    public void crearContactos() {
        contact = new Contact();
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setMotherName("Chaser");
        contact.setEmail("java-academy@softtek.com");
        contact.setPhoneNumber("0123456789");

        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.FRIEND );

    }

}
