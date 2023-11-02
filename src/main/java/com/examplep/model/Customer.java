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
	@Column(name="CName")
	private String CName;
	@Column(name="CMail")
    private String CMail;
	@Column(name="CPhno")
    private String CPhno;
	@Column(name="Location")
	private String Location;
	@Column(name="Guide")
	private String Guide;
	@Column(name="Food_Type")
	private String Food_Type;
	@Column (name="FeedBack")
	private String FeedBack;
	public Long getCId() {
		return CId;
	}
	public void setCId(Long cId) {
		CId = cId;
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
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getGuide() {
		return Guide;
	}
	public void setGuide(String guide) {
		Guide = guide;
	}
	public String getFood_Type() {
		return Food_Type;
	}
	public void setFood_Type(String food_Type) {
		Food_Type = food_Type;
	}
	public String getFeedBack() {
		return FeedBack;
	}
	public void setFeedBack(String feedBack) {
		FeedBack = feedBack;
	}
	public Customer(Long cId, String cName, String cMail, String cPhno, String location, String guide, String food_Type,
			String feedBack) {
		super();
		CId = cId;
		CName = cName;
		CMail = cMail;
		CPhno = cPhno;
		Location = location;
		Guide = guide;
		Food_Type = food_Type;
		FeedBack = feedBack;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
