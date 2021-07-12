package com.org.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.org.entities.BusRoute;
import com.org.service.IBusRouteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/busroute")
public class IBusRouteController {

	@Autowired
	IBusRouteService busRouteService;

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BusRoute addBusRoute(@RequestBody BusRoute busRoute) {
		return busRouteService.addBusRoute(busRoute);
	}

	// Fetch all user records
	@GetMapping("/allbusroute")
	public List<BusRoute> getAllUsers() {
		return busRouteService.getAllBusroute();
	}

	@GetMapping("/{busrouteId}")
	public BusRoute getBusRouteById(@PathVariable("busrouteId") int busrouteId) {
		return busRouteService.getBusRouteById(busrouteId);
	}


	@PutMapping("/updateBusRoute")
	public ResponseEntity<String> updateBusRoute(@RequestBody BusRoute busRoute) {
		try {
			busRouteService.updateBusRoute(busRoute);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (NoSuchElementException ex) {
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{busrouteId}")
	public ResponseEntity<String> deleteBusRoute(@PathVariable int busrouteId) {
		try {
			busRouteService.deleteBusRoute(busrouteId);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (RuntimeException ex) {
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
}