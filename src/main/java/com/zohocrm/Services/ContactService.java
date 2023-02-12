package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllcontacts();

	public Contact getContactById(long id);

}
