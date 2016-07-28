package com.rsmsapp;

public class User{
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private boolean deleted;
	private boolean active;
	private int id;
	private int assignedRetailers;
	private String role;

	public enum roles{retailerManager, admin, superAdmin}
	public enum permissions{read, write, full}

	User(){
		username = "";
		password = "";
		firstName = "";
		lastName = "";
		phone = "";
		assignedRetailers = 0;
	}

	User(int id, String username, String password, String firstName, String lastName, String phone, int assignedRetailers){
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.assignedRetailers = assignedRetailers;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setName(String firstName, String lastName){
		setFirstname(firstName);
		setLastname(lastName);
	}

	public String getName(){
		return firstName + " " + lastName;
	}

	public void setFirstname(String firstName){
		this.firstName = firstName;
	}

	public String getFirstname(){
		return firstName;
	}

	public void setLastname(String lastName){
		this.lastName = lastName;
	}

	public String getLastname(){
		return lastName;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setDeleted(boolean deleted){
		this.deleted = deleted;
	}

	public boolean getDeleted(){
		return deleted;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean getActive(){
		return active;
	}

	public void  setAssignedRetailers(int assignedRetailers){
		this.assignedRetailers = assignedRetailers;
	}

	public int getAssignedRetailers(){
		return assignedRetailers;
	}

	public void setRole(roles role){
		switch(role){
			case retailerManager:
				role = "Retailer Manager";
				break;
			case admin:
				role = "Admin";
				break;
			case superAdmin:
				role = "Super Admin";
				break;
			default:
				role = null;
		}
	}

	public String getRole(){
		return role;
	}

}