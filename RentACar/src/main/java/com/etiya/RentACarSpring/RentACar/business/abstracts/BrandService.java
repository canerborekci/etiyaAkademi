package com.etiya.RentACarSpring.RentACar.business.abstracts;

import java.util.List;


import com.etiya.RentACarSpring.RentACar.business.requests.CreateBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateBrandRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.entities.Brand;



public interface BrandService {
	DataResult<List<Brand>> getAll();
	Result save(CreateBrandRequest createBrandRequest);
	Result update(UpdateBrandRequest updateBrandRequest);
	Result delete(DeleteBrandRequest deleteBrandRequest);
}
