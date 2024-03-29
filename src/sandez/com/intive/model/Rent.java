package sandez.com.intive.model;

import java.time.LocalDateTime;

import sandez.com.intive.rents.RentType;

public class Rent {
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String rentId;
	private String userId;
	private RentType rentType;
	private double price;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public RentType getRentType() {
		return rentType;
	}

	public void setRentType(RentType rentType) {
		this.rentType = rentType;
	}

	public String getRentId() {
		return rentId;
	}

	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

}
