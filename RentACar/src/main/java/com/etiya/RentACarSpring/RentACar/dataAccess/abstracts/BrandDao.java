package com.etiya.RentACarSpring.RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.RentACarSpring.RentACar.entities.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer>{

}
