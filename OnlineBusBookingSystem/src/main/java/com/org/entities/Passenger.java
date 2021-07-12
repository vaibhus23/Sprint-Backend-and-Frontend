package com.org.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue
	private int passengerId;

	@Column(name = "identityDocNumber", nullable = false)
	private long identityDocNumber;

	@Column(name = "firstname", nullable = false)
	private String firstName;

	@Column(name = "lastname", nullable = false)
	private String lastName;

	@Column(name = "phoneNumber", nullable = false)
	private long phoneNumber;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "identityDocumentName", nullable = false)
	private String identityDocumentName;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "bookingId")
//	private Booking booking;

//	public Booking getBooking() {
//		return booking;
//	}
//
//	public void setBooking(Booking booking) {
//		this.booking = booking;
//	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public long getIdentityDocNumber() {
		return identityDocNumber;
	}

	public void setIdentityDocNumber(long identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityDocumentName() {
		return identityDocumentName;
	}

	public void setIdentityDocumentName(String identityDocumentName) {
		this.identityDocumentName = identityDocumentName;
	}

}