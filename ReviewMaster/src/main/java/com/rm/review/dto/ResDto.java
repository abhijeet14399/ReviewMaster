package com.rm.review.dto;

public class ResDto {

	private int id;

	private String Name;

	private String Address;

	private String Owner;

	private String Specialization;

	public ResDto(int id, String name, String address, String owner, String specialization) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		Owner = owner;
		Specialization = specialization;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	@Override
	public String toString() {
		return "ResDto [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Owner=" + Owner + ", Specialization="
				+ Specialization + "]";
	}
	
	
	
}
