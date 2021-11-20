package com.etiya.RentACarSpring.RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.RentACarSpring.RentACar.business.abstracts.BrandService;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateBrandRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessDataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessResult;
import com.etiya.RentACarSpring.RentACar.dataAccess.abstracts.BrandDao;
import com.etiya.RentACarSpring.RentACar.entities.Brand;
@Service
public class BrandManager implements BrandService{
	private BrandDao brandDao;
	private ModelMapperService modelMapperService;
	
	@Autowired
	public BrandManager(BrandDao brandDao, ModelMapperService modelMapperService) {
		super();
		this.brandDao = brandDao;
		this.modelMapperService = modelMapperService;
	}

	
	
	@Override
	public DataResult<List<Brand>> getAll() {
		List<Brand> result = this.brandDao.findAll();
		List<Brand> response = result.stream().map(brand->modelMapperService.forDto().map(brand, Brand.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<Brand>>(response,"Markalar Listelendi");
	}

	@Override
	public Result save(CreateBrandRequest createBrandRequest) {
		Brand brand=modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		this.brandDao.save(brand);
		return new SuccessResult("Marka eklendi");
	}

	@Override
	public Result update(UpdateBrandRequest updateBrandRequest) {
		Brand brand=modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandDao.save(brand);
		return new SuccessResult("Marka güncellendi");
	}

	@Override
	public Result delete(DeleteBrandRequest deleteBrandRequest) {
		Brand brand=modelMapperService.forRequest().map(deleteBrandRequest, Brand.class);
		this.brandDao.delete(brand);
		return new SuccessResult("Marka silindi");
	}

}
