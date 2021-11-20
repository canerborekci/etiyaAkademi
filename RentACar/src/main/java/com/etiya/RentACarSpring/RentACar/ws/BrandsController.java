package com.etiya.RentACarSpring.RentACar.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.RentACarSpring.RentACar.business.abstracts.BrandService;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteBrandRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateBrandRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.entities.Brand;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
	private BrandService brandService;
		
		@Autowired
		public BrandsController(BrandService brandService) {
			super();
			this.brandService = brandService;
		}
		
		@GetMapping("getAll")
		public DataResult<List<Brand>> getAll(){
			return this.brandService.getAll();
		}
		
		@PostMapping("add")
		public Result add(@RequestBody CreateBrandRequest createBrandRequest){
			return this.brandService.save(createBrandRequest);
			
		}
		@PostMapping("update")
		public Result update(UpdateBrandRequest updateBrandRequest){
			return this.brandService.update(updateBrandRequest);
			
		}
		
		@DeleteMapping("delete")
		public Result update(DeleteBrandRequest deleteBrandRequest){
			return this.brandService.delete(deleteBrandRequest);
			
		}
}
