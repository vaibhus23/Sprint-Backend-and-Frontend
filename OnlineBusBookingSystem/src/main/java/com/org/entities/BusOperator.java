package com.org.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "busoperator")
public class BusOperator {

	@Id
	@Column(name = "busOperatorUserName")
	private String busOperatorUserName;

	@Column(name = "password")
	private String password;

	@Column(name = "name", nullable = true)
	private String name;

	/*
	 * One to many relationship between BusOperator and bus
	 */
	
	@JoinColumn(name = "busOperatorUserName")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Bus.class)
	private List<Bus> bus;

	public String getBusOperatorUserName() {
		return busOperatorUserName;
	}

	public void setBusOperatorUserName(String busOperatorUserName) {
		this.busOperatorUserName = busOperatorUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}