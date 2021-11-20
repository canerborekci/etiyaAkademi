package com.etiya.RentACarSpring.RentACar.business.abstracts;

import java.util.List;


import com.etiya.RentACarSpring.RentACar.business.requests.CreateColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateColorRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.entities.Color;



public interface ColorService {
	DataResult<List<Color>> getAll();
	Result save(CreateColorRequest createColorRequest);
	Result update(UpdateColorRequest updateColorRequest);
	Result delete(DeleteColorRequest deleteColorRequest);
}
