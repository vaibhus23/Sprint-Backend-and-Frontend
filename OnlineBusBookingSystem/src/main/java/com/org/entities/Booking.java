package com.org.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue
	private Integer bookingId;

	@Column(name = "username")
	private String username;
	
	@Column(name = "phoneNumber", nullable = false)
	private String phoneNumber;



	@Column(name = "numberofseats", nullable = false)
	private int numberOfSeats;

	@Column(name = "amountpaid", nullable = false)
	private int amountPaid;

	@Column(name = "bdate")
	private LocalDate date;
	
	@Column(name = "busnumber")
	private String busNumber;

//
//	@Column(name = "journeystarttime")
//	private LocalDateTime journeyStartTime;
//
//	@Column(name = "journeyendtime")
//	private LocalDateTime journeyEndTime;

	@Column(name = "source", nullable = false)
	private String source;

	@Column(name = "destination", nullable = false)
	private String destination;
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Passenger.class)
	private List<Passenger> passengersInfo;

	public String getUsername() {
		return username;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

//	public LocalDate getDate() {
//		return date;
//	}
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//
//	public LocalDateTime getJourneyStartTime() {
//		return journeyStartTime;
//	}
//
//	public void setJourneyStartTime(LocalDateTime journeyStartTime) {
//		this.journeyStartTime = journeyStartTime;
//	}
//
//	public LocalDateTime getJourneyEndTime() {
//		return journeyEndTime;
//	}
//
//	public void setJourneyEndTime(LocalDateTime journeyEndTime) {
//		this.journeyEndTime = journeyEndTime;
//	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Passenger> getPassengersInfo() {
		return passengersInfo;
	}

	public void setPassengersInfo(List<Passenger> passengersInfo) {
		this.passengersInfo = passengersInfo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	

}