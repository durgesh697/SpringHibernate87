package com.jlcindia.spring.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.jlcindia.spring.hibernate.Contact;
import com.jlcindia.spring.to.ContactTo;

@Repository("cdao")
@Transactional
public class ContactDAOImpl implements ContactDAO {
	@Autowired
	HibernateTemplate hTemp;

	@Transactional
	public boolean addContact(ContactTo cto) {
		Contact contact = new Contact(cto.getCname(),cto.getCemail(),cto.getCphone()) ;
		hTemp.save(contact);
		return true;
	}

	/*@Override
	public List<ContactTo> getAllContacts() {
		List<ContactTo> cList = null;
		List<Contact> list = (List<Contact>) hTemp.find("from Conatct c");
		if (list.size() > 0) {
			cList = new ArrayList<ContactTo>();
			for (Contact c : list) {
				ContactTo cto = new ContactTo();
				cto.setCid(c.getContactId());
				cto.setCname(c.getContactName());
				cto.setCemail(c.getContactEmail());
				cto.setCphone(c.getContactPhone());
				cList.add(cto);
			}
		}

		return cList;
	}*/

}
