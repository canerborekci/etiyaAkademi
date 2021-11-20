package com.etiya.RentACarSpring.RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.RentACarSpring.RentACar.entities.Car;

public interface CarDao extends JpaRepository<Car, Integer>{

}
