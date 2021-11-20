package com.etiya.RentACarSpring.RentACar.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.RentACarSpring.RentACar.business.abstracts.ColorService;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateColorRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.entities.Color;

@RestController
@RequestMapping("api/colors")
public class ColorsController {
	private ColorService colorService;
	@Autowired
	public ColorsController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}
	
	
	@GetMapping("getAll")
	public DataResult<List<Color>> getAll(){
		return this.colorService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody CreateColorRequest createColorRequest){
		return this.colorService.save(createColorRequest);
		
	}
	@PostMapping("update")
	public Result update(UpdateColorRequest updateColorRequest){
		return this.colorService.update(updateColorRequest);
		
	}
	
	@DeleteMapping("delete")
	public Result update(DeleteColorRequest deleteColorRequest){
		return this.colorService.delete(deleteColorRequest);
		
	}

}
