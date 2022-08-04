package com.rm.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_res")
public class Restaurent {
	
	@Id
	@Column(name = "res_id")
	private int resID;
	@Column(name = "res_name")
	private String resName;
	@Column(name = "res_address")
	private String resAddress;
	@Column(name = "res_owner")
	private String resOwner;
	@Column(name = "res_specialization")
	private String resSpecialization;
	public Restaurent(int resID, String resName, String resAddress, String resOwner, String resSpecialization) {
		super();
		this.resID = resID;
		this.resName = resName;
		this.resAddress = resAddress;
		this.resOwner = resOwner;
		this.resSpecialization = resSpecialization;
	}
	public Restaurent() {
		// TODO Auto-generated constructor stub
	}
	public int getResID() {
		return resID;
	}
	public void setResID(int resID) {
		this.resID = resID;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResAddress() {
		return resAddress;
	}
	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}
	public String getResOwner() {
		return resOwner;
	}
	public void setResOwner(String resOwner) {
		this.resOwner = resOwner;
	}
	public String getResSpecialization() {
		return resSpecialization;
	}
	public void setResSpecialization(String resSpecialization) {
		this.resSpecialization = resSpecialization;
	}
	@Override
	public String toString() {
		return "Restaurent [resID=" + resID + ", resName=" + resName + ", resAddress=" + resAddress + ", resOwner="
				+ resOwner + ", resSpecialization=" + resSpecialization + "]";
	}
	
	
	
}
