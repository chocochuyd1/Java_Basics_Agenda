package com.softtek.java.academy.entities;

import com.softtek.java.academy.entities.contactType;

public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String MotherName;
    private String email;
    private String phoneNumber;
    private contactType ContactType;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
        this.ContactType = contactType.UNKNOWN;
    }

    public Contact(String id, String firstName, String lastName, String motherName, String email, String phoneNumber,
			contactType contactType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.MotherName = motherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.ContactType = contactType;
	}

	public contactType getContactType() {
        return ContactType;
    }

    public void setContactType(contactType contactType) {
        this.ContactType = contactType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact ID: " + this.getId() + "\n");
        sb.append("Contact First Name: " + this.getFirstName() + "\n");
        sb.append("Contact Last Name: " + this.getLastName() + "\n");
        sb.append("Contact Mother Name: " + this.getMotherName() + "\n");
        sb.append("Contact eMail: " + this.getEmail() + "\n");
        sb.append("Contact Phone Number: " + this.getPhoneNumber() + "\n");
        sb.append("Contact Type: " + this.getContactType() + "\n");

        return sb.toString();
    }

}
