package com.rsmsapp

public class Retailer{
	private String organization;
	private String lmc_id;
	private String region;
	private String district;
	private String phone;
	private boolean deleted;
	private boolean active;
	private int id;
	private int sales;
	private int deposit;

	Retailer(){
		organization = "";
		lmc_id = "";
		region = "";
		district = "";
		phone = "";
		deleted = null;
		active = null;
		id = null;
		sales = 0;
		deposit = 0;
	}

	Retailer(int id, String organization, String lmc_id, String region, String district, String phone, boolean deleted, boolean active, int sales, int deposit){
		this.id = id;
		this.organization = organization;
		this.lmc_id = lmc_id;
		this.region = region;
		this.district = district;
		this.phone = phone;
		this.deleted = deleted;
		this.active = active;
		this.sales = sales;
		this.deposit = deposit;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String organization){
		this.organization;
	}

	public String getName(){
		return organization;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setDistrict(String district){
		this.district = district;
	}

	public String getDistrict(){
		return district;
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
		return deleted
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean getActive(){
		return active;
	}

	public void setSales(int sales){
		this.sales = sales;
	}

	public int getSales(){
		return sales;
	}

	public void setDeposit(int deposit){
		this.deposit = deposit;	
	}

	public int getDeposit(){
		return deposit;
	}
}