package com.etiya.RentACarSpring.RentACar.business.abstracts;

import java.util.List;

import com.etiya.RentACarSpring.RentACar.business.dtos.CarSearchListDto;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateCarRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;

public interface CarService {
	DataResult<List<CarSearchListDto>> getAll();
	Result save(CreateCarRequest createCarRequest);
	Result update(UpdateCarRequest updateCarRequest);
	Result delete(DeleteCarRequest deleteCarRequest);
	
}
