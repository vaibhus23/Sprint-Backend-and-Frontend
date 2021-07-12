package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.entities.Bus;
/*
 * Bus Repository
 */
public interface IBusRepository extends JpaRepository<Bus, String>{

	@Query(value="Select * from bus,busroute where source=?1 and destination=?2",nativeQuery=true)
	public Bus getBusDetailsBySD(String source,String destination);
}
