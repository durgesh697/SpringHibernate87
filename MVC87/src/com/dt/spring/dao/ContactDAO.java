package com.dt.spring.dao;

import java.util.List;

import com.dt.spring.to.ContactTo;

public interface ContactDAO {
	public boolean addContact(ContactTo cto);

	 public List<ContactTo> getAllContacts();


}
