package com.example.SpringBoot.Dto;

import lombok.Data;

@Data
public class UserLocationDTO {

	private long userId;
	private String place;
	private String email;
	private double longitude;
	private double latitude;
	
	
	public UserLocationDTO(String place, String email, double longitude, double latitude) {
		super();
		this.place = place;
		this.email = email;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public UserLocationDTO() {
		
	}
}
