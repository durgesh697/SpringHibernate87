package com.dt.spring.hibernate;

import javax.persistence.*;

@Entity // To save the Persistance data in the DB
@Table(name = "contacts")
public class Contact {

	static {
		System.out.println("contactClass");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int cid;

	@Column(name = "cname")
	private String cname;
	@Column(name = "cemail")
	private String cemail;
	@Column(name = "cphone")
	private String cphone;

	public Contact() {
	}

	public Contact(String cname, String cemail, String cphone) {
		this.cname = cname;
		this.cemail = cemail;
		this.cphone = cphone;
	}

	public Contact(int cid, String cname, String cemail, String cphone) {
		super();
		this.cid = cid;
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

}
