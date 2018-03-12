package com.jlcindia.spring.dao;

import com.jlcindia.spring.to.ContactTo;

public interface ContactDAO {
	public boolean addContact(ContactTo cto);
	
	//public List<ContactTo> getAllContacts();
}
