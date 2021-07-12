package com.org.service;

import java.util.List;

import com.org.entities.Bus;
import com.org.exceptions.InvalidBusIdException;


public interface IBusService {
	public Bus addBus(Bus bus);

	public Bus updateBus(Bus bus);

	public Bus getBusDetailsByBusNumber(String busNumber) throws InvalidBusIdException;

	public void deleteBusIdByBusNumber(String busNumber);
	
	List<Bus> getAllUsers();
	
	public Bus getBusDetailsBySD(String source,String destination);
}
