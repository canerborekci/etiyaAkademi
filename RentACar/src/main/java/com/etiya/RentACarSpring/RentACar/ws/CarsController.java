package com.etiya.RentACarSpring.RentACar.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.RentACarSpring.RentACar.business.abstracts.CarService;
import com.etiya.RentACarSpring.RentACar.business.dtos.CarSearchListDto;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateCarRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;

@RestController
@RequestMapping("api/cars")
public class CarsController {
	
	private CarService carService;
	
	@Autowired
	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<CarSearchListDto>> getAll(){
		return this.carService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CreateCarRequest createCarRequest){
		return this.carService.save(createCarRequest);
		
	}
	@PostMapping("update")
	public Result update(UpdateCarRequest updateCarRequest){
		return this.carService.update(updateCarRequest);
		
	}
	
	@DeleteMapping("delete")
	public Result update(DeleteCarRequest deleteCarRequest){
		return this.carService.delete(deleteCarRequest);
		
	}
	
	
}
