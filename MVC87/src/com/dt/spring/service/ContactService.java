package com.dt.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dt.spring.dao.ContactDAO;
import com.dt.spring.to.ContactTo;

@Service
public class ContactService {

	@Autowired
	ContactDAO cdao;

	public boolean addContact(ContactTo cto) {
		return cdao.addContact(cto);

	}

	public List<ContactTo> getAllContacts() {
		// TODO Auto-generated method stub
		return cdao.getAllContacts();
	}

}
