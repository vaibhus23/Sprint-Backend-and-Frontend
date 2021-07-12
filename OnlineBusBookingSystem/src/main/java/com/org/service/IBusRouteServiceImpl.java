package com.org.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.BusRoute;
import com.org.repository.IBusRouteRepository;

@Service
@Transactional
public class IBusRouteServiceImpl implements IBusRouteService {

	@Autowired
	IBusRouteRepository busRouteRepository;

	@Override
	public BusRoute addBusRoute(BusRoute busRoute) {
		// TODO Auto-generated method stub
		return busRouteRepository.save(busRoute);
	}

	@Override
	public List<BusRoute> getAllBusroute() {
		// TODO Auto-generated method stub
		return busRouteRepository.findAll();
	}

	@Override
	public BusRoute getBusRouteById(int busrouteId) {
		// TODO Auto-generated method stub
		return busRouteRepository.getById(busrouteId);
	}

	@Override
	public BusRoute updateBusRoute(BusRoute busRoute) {
		// TODO Auto-generated method stub
		return busRouteRepository.save(busRoute);
	}

	@Override
	public void deleteBusRoute(int busrouteId) {

		busRouteRepository.deleteById(busrouteId);
	}

}