package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.entities.Bus;
import com.org.exceptions.InvalidBusIdException;
import com.org.repository.IBusRepository;

@Service
@Transactional
public class IBusServiceImpl implements IBusService {
	@Autowired
	private IBusRepository busRepository;

	/*
	 * add Bus
	 */
	@Override
	public Bus addBus(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.save(bus);
	}

	/*
	 * Update Bus
	 */
	@Override
	public Bus updateBus(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.save(bus);
	}

	/*
	 * Get Bus Details by Bus ID
	 */
	@Override
	public Bus getBusDetailsByBusNumber(String busNumber) throws InvalidBusIdException {
		// TODO Auto-generated method stub
		return busRepository.findById(busNumber).orElseThrow(() -> new InvalidBusIdException("Element no Found"));
	}

	/*
	 * Delete Bus by Bus ID
	 */
	@Override
	public void deleteBusIdByBusNumber(String busNumber) {
		// TODO Auto-generated method stub
		busRepository.deleteById(busNumber);
	}

	@Override
	public List<Bus> getAllUsers() {
		// TODO Auto-generated method stub
		return busRepository.findAll();
	}

	@Override
	public Bus getBusDetailsBySD(String source, String destination) {
		// TODO Auto-generated method stub
		return busRepository.getBusDetailsBySD(source, destination);
	}

}
