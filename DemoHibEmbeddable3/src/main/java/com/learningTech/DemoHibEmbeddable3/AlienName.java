package com.learningTech.DemoHibEmbeddable3;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {
	private String firstname;
	private String lastname;
	private String middlename;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

}
