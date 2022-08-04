package com.rm.review.dto;

public class RevDto {

	private int id;
	private String userName;
	private int resid;    //Restaurent ID
	private String review;
	public RevDto(int id, String userName, int resid, String review) {
		super();
		this.id = id;
		this.userName = userName;
		this.resid = resid;
		this.review = review;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getResid() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "RevDto [id=" + id + ", userName=" + userName + ", resid=" + resid + ", review=" + review + "]";
	}
	
	
}
