package com.org.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.org.entities.Bus;
import com.org.exceptions.InvalidBusIdException;
import com.org.service.IBusServiceImpl;

/*
 * Bus Controller
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/bus")
public class IBusController {

	@Autowired
	IBusServiceImpl busService;
	
	/*
	 *Add Bus
	 */
	@PostMapping("/add")
	public ResponseEntity<Bus> insertBus(@RequestBody Bus bus) {
		bus = busService.addBus(bus);
		return new ResponseEntity<Bus>(bus, HttpStatus.OK);
	}

	/*
	 *Get Bus Details by ID
	 */
	@GetMapping("/{busNumber}")
	public Bus getBusDetailsById(@PathVariable String busNumber) throws InvalidBusIdException {
		
		return busService.getBusDetailsByBusNumber(busNumber);
	}

	/*
	 *Update Bus
	 */
	@PutMapping("/updatebus")
	public ResponseEntity<Bus> updateBus(@RequestBody Bus bus) {
		bus = busService.updateBus(bus);
		return new ResponseEntity<Bus>(bus, HttpStatus.OK);
	}

	/*
	 *Delete Bus
	 */
	@DeleteMapping("/deleteBus/{busNumber}")
	public void deleteBusByID(@PathVariable("busNumber") String busNumber) {
		busService.deleteBusIdByBusNumber(busNumber);
	}
	
	@GetMapping("/findallbus")
	  public List<Bus> getAllUsers(){
	    return busService.getAllUsers();
	  }
	@GetMapping("/byUserName/{username}")
	public Bus getBusDetailsBySD(@PathVariable String source,String destination) {
		return getBusDetailsBySD(source, destination);
	}
}
