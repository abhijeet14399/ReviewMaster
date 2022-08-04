package com.rm.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_review")
public class Resreview {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "res_id")
	private int res_id;
	@Column(name = "review")
	private String review;
	public Resreview(int id, String userName, int resid, String review) {
		super();
		this.id = id;
		this.user_name = userName;
		this.res_id = resid;
		this.review = review;
	}
	public Resreview() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String userName) {
		this.user_name = userName;
	}
	public int getResid() {
		return res_id;
	}
	public void setResid(int resid) {
		this.res_id = resid;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Resreview [id=" + id + ", userName=" + user_name + ", resid=" + res_id + ", review=" + review + "]";
	}
	
	
}
