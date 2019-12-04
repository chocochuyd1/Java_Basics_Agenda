package com.softtek.java.academy.Agenda;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.contactType;
import com.softtek.java.academy.service.contactServiceData;
import com.softtek.java.academy.service.contactServiceDataMemoryImp;

public class PlaceHolderContact {

	private Contact contact;
	private Contact friend;
	private Contact friend2;

	public static void main(String[] args) {
		PlaceHolderContact p = new PlaceHolderContact();
		p.crearContactos();

		contactServiceData csd = new contactServiceDataMemoryImp();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		Contact myOtherFriendContact = csd.createContact(p.friend2);
		Contact[] contacts = csd.findByContactType(contactType.FRIEND);
		if (contacts != null) {
			for (Contact c : contacts) {
				System.out.println(c);
			}
		} else {
			System.out.println("No se encontraron resultados del tipo " + contactType.FRIEND);
		}
		Contact[] contactsWork = csd.findByContactType(contactType.WORK);
		if (contactsWork != null) {
			for (Contact c : contactsWork) {
				System.out.println(c);
			}
		} else {
			System.out.println("No se encontraron resultados del tipo " + contactType.WORK);
		}
	}

	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("John");
		contact.setLastName("Doe");
		contact.setMotherName("Chaser");
		contact.setEmail("java-academy@softtek.com");
		contact.setPhoneNumber("0123456789");

		friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102",
				contactType.FRIEND);
		friend2 = new Contact("2", "Jess", "Alvar", "Aia", "yuid1@hotmail.com", "8114565102", contactType.WORK);
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.FAMILIAR );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.FAMILIAR );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.WORK );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.WORK );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.WORK );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.FAMILIAR );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.WORK );
//        friend = new Contact("1", "Jesus", "Alvarado", "Alicia", "chuyd1@hotmail.com", "8116535102", contactType.FRIEND );

	}

}
