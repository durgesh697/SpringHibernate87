package com.jlcindia.spring.mvc;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jlcindia.spring.service.ContactService;
import com.jlcindia.spring.to.ContactTo;

@Controller
public class ContactController {
	
	@Autowired
	ContactService cs;

	@RequestMapping(value = {"/showaddcontact.jlc"})
	protected String showContacPage(Map<String,Object> map) throws Exception {
		System.out.println("showContactPage");
		ContactCommand c = new ContactCommand();
		map.put("ct", c);
		return "contact";
	}

	@RequestMapping(value = {"/addcontact"}, method = RequestMethod.POST)
	protected String addContact(@ModelAttribute(value = "ct") ContactCommand ct, HttpServletRequest req)
			throws Exception {
		System.out.println("addContact");
		ContactTo cto=new ContactTo(ct.getCname(),ct.getCemail(),ct.getCphone());
		boolean added = cs.addContact(cto);
		if (added) {
			req.setAttribute("MSG","Contact added Successfully");
		} else {
			req.setAttribute("MSG","Error while adding Contact");
		}
		/*List<ContactTo> clist = contactService.getAllContacts();
		if (clist != null && clist.size() > 0)
			req.setAttribute("CLIST", clist);
		contact.setCname("");
		contact.setCemail("");
		contact.setCphone("");*/
		return "contact";
	}

}
