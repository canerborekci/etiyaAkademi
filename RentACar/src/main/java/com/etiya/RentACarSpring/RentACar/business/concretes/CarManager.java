package com.etiya.RentACarSpring.RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.RentACarSpring.RentACar.business.abstracts.CarService;
import com.etiya.RentACarSpring.RentACar.business.dtos.CarSearchListDto;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteCarRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateCarRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessDataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessResult;
import com.etiya.RentACarSpring.RentACar.dataAccess.abstracts.CarDao;
import com.etiya.RentACarSpring.RentACar.entities.Car;
@Service
public class CarManager implements CarService{
	private CarDao carDao;
	private ModelMapperService modelMapperService;
	@Autowired
	public CarManager(CarDao carDao, ModelMapperService modelMapperService) {
		super();
		this.carDao = carDao;
		this.modelMapperService = modelMapperService;
	}

	
	
	
	@Override
	public DataResult<List<CarSearchListDto>> getAll() {
		List<Car> result = this.carDao.findAll();
		List<CarSearchListDto> response = result.stream().map(car->modelMapperService.forDto().map(car, CarSearchListDto.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<CarSearchListDto>>(response,"Arabalar Listelendi");
	}




	@Override
	public Result save(CreateCarRequest createCarRequest) {
		Car car=modelMapperService.forRequest().map(createCarRequest, Car.class);
		this.carDao.save(car);
		return new SuccessResult("Araba eklendi");
	}



	@Override
	public Result update(UpdateCarRequest updateCarRequest) {
		Car car=modelMapperService.forRequest().map(updateCarRequest, Car.class);
		carDao.save(car);
		return new SuccessResult("Araç bilgisi güncellendi");
	}





	@Override
	public Result delete(DeleteCarRequest deleteCarRequest) {
		Car car=modelMapperService.forRequest().map(deleteCarRequest, Car.class);
		carDao.delete(car);
		return new SuccessResult();
	}







}
