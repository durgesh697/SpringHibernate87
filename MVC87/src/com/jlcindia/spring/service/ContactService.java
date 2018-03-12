package com.jlcindia.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jlcindia.spring.dao.ContactDAO;
import com.jlcindia.spring.to.ContactTo;

@Service
public class ContactService {

	@Autowired
	ContactDAO cdao;

	public boolean addContact(ContactTo cto) {
		return cdao.addContact(cto);

	}
/*
	@Override
	public List<ContactTo> getAllContacts() {
		// TODO Auto-generated method stub
		return contactDAO.getAllContacts();
	}
*/
}
