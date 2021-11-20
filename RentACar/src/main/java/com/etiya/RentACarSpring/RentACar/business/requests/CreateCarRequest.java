package com.etiya.RentACarSpring.RentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {
	private int colorId;
	private int brandId;
	private int modelYear;
	private double dailyPrice;
	private String description;
}
