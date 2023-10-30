package com.examplep.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CId")
	private Long CId;
	@Column(name="Cname")
	private String CName;
	@Column(name="Cmail")
    private String CMail;
	@Column(name="CPhno")
    private String CPhno;
	public Long getCId() {
		return CId;
	}
	public void setCId(Long id) {
		CId = (long) id;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCMail() {
		return CMail;
	}
	public void setCMail(String cMail) {
		CMail = cMail;
	}
	public String getCPhno() {
		return CPhno;
	}
	public void setCPhno(String cPhno) {
		CPhno = cPhno;
	}
	
	public Customer(Long cId, String cName, String cMail, String cPhno) {
		super();
		CId = cId;
		CName = cName;
		CMail = cMail;
		CPhno = cPhno;
	}

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
