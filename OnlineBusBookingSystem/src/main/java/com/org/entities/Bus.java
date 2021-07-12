package com.org.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bus")
public class Bus {

	@Id
	@Column(name = "busnumber")
	private String busNumber;

	@JoinColumn(name = "busrouteid")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private BusRoute busRoute;

	@Column(name = "totalseats", nullable = false)
	private int totalSeats;

	@Column(name = "busOperatorUserName")
	private String busOperatorUserName;
	
	@Column(name = "busdate")
	private LocalDate date;
	

	@Column(name = "fare", nullable = false)
	private int fare;

	@JsonIgnore
	@JoinColumn(name = "busnumber")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Booking.class)
	private List<Booking> booking;
	
	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BusRoute getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(BusRoute busRoute) {
		this.busRoute = busRoute;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getBusOperatorUserName() {
		return busOperatorUserName;
	}

	public void setBusOperatorUserName(String busOperatorUserName) {
		this.busOperatorUserName = busOperatorUserName;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}