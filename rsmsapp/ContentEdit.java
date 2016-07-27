package com.rsmsapp;

public class ContentEdit{
	
	private static String username;
	private static int rm_factor;
	public enum Page {dashboard, lmcs, retailers, notification}
	private static String page;

	 public ContentEdit(){
		username = "paul";
		rm_factor = 10;
		page = "dashboard";
	}

	public ContentEdit(String username, String page, int rm_factor) {
		setUsername(username);
		setRmFactor(rm_factor);
		setPage(page);
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setRmFactor(int rm_factor){
		this.rm_factor = rm_factor;
	}

	public String getUsername(){
		return username;
	}

	public int getRmFactor(){
		return rm_factor;
	}

	private void setPage(String page) {
		this.page = page;
	}

	public String getPage() {
		return page;
	}

	public void setPage(Page thePage) {
		switch(thePage) {
		/*	case dashboard:
				setPage("dashboard");
				break; */
			case lmcs:
				setPage("lmcs");
				break;
			case retailers:
				setPage("retailers");
				break;
			case notification:
				setPage("notification");
				break;
			default:
				setPage("dashboard");
				break;
		}
	}	
}