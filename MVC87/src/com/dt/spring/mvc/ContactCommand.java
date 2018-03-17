package com.dt.spring.mvc;

public class ContactCommand {
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	private String cname;
	private String cemail;
	private String cphone;

	// @Override
	// public String toString() {
	// return "ContactCommand [contactName=" + contactName + ", contactEmail=" +
	// contactEmail + ", contactPhone="
	// + contactPhone + "]";
	// }

}
