package com.org.service;

import java.util.List;

import com.org.entities.BusRoute;

public interface IBusRouteService {
	public BusRoute addBusRoute(BusRoute busRoute);

	public List<BusRoute> getAllBusroute();

	public BusRoute getBusRouteById(int busrouteId);

	public BusRoute updateBusRoute(BusRoute busRoute);

	public void deleteBusRoute(int busrouteId);
}