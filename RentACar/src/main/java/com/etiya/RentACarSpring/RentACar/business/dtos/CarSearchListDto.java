package com.etiya.RentACarSpring.RentACar.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarSearchListDto {
	private int modelYear;
	private int dailyPrice;
	private String description;
}
