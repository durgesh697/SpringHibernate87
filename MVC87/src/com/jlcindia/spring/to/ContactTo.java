package com.jlcindia.spring.to;

public class ContactTo {

	private int cid;
	private String cname;
	private String cemail;
	private String cphone;
	
	public ContactTo(String cname, String cemail, String cphone) {
		this.cname = cname;
		this.cemail = cemail;
		this.cphone = cphone;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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

	// @Override
	// public String toString() {
	// return "ContactTo [contactId=" + contactId + ", contactName=" + contactName +
	// ", contactEmail=" + contactEmail
	// + ", contactPhone=" + contactPhone + "]";
	// }

}
