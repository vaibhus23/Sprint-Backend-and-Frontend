package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.BusRoute;

public interface IBusRouteRepository extends JpaRepository<BusRoute, Integer>{

}
