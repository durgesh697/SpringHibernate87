package com.dt.spring.mvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dt.spring.hibernate.Contact;
import com.dt.spring.service.ContactService;
import com.dt.spring.to.ContactTo;

@Controller
public class ContactController {

	@Autowired
	ContactService cs;

	@RequestMapping(value = { "/showaddcontact.dt" })
	// To maps HTTP requests to handler methods of MVC and REST controllers.
	protected String showContacPage(Map<String, Object> map) throws Exception {
		System.out.println("showContactPage");
		ContactCommand c = new ContactCommand();
		map.put("ct", c);
		return "contact";
	}

	@RequestMapping(value = { "/addcontact" }, method = RequestMethod.POST)
	protected String addContact(@ModelAttribute(value = "ct") ContactCommand ct, HttpServletRequest req)
			throws Exception {
		// Spring MVC supply this object to a Controller method by using the
		// @ModelAttribute annotation:
		System.out.println("addContact");
		// ContactTo cto = new ContactTo(ct.getCname(), ct.getCemail(),
		// ct.getCphone());
		ContactTo cto = new ContactTo();

		boolean added = cs.addContact(cto);
		if (added) {
			req.setAttribute("MSG", "Contact added Successfully");
		} else {
			req.setAttribute("MSG", "Error while adding Contact");
		}
		List<ContactTo> clist = cs.getAllContacts();
		if (clist != null && clist.size() > 0)
			req.setAttribute("CLIST", clist);
		ct.setCname("");
		ct.setCemail("");
		ct.setCphone("");
		return "contact";
	}

}
