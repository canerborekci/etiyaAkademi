package com.etiya.RentACarSpring.RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.RentACarSpring.RentACar.entities.Color;

public interface ColorDao extends JpaRepository<Color, Integer>{

}
