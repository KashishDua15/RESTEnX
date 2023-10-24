package com.fil.entitiy;

public class Owner {
	private String name;
	private String contactno;
	private int ownerId;
	private String emailId;
	private String restaurantName;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Owner(String name, String contactno, int ownerId, String emailId, String restaurantName, String password) {
		super();
		this.name = name;
		this.contactno = contactno;
		this.ownerId = ownerId;
		this.emailId = emailId;
		this.restaurantName = restaurantName;
		this.password = password;
	}
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + ", contactno=" + contactno + ", ownerId=" + ownerId + ", emailId=" + emailId
				+ ", restaurantName=" + restaurantName + ", password=" + password + "]";
	}
}
