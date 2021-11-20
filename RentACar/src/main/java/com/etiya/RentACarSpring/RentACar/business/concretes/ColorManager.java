package com.etiya.RentACarSpring.RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.RentACarSpring.RentACar.business.abstracts.ColorService;
import com.etiya.RentACarSpring.RentACar.business.requests.CreateColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.DeleteColorRequest;
import com.etiya.RentACarSpring.RentACar.business.requests.UpdateColorRequest;
import com.etiya.RentACarSpring.RentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.DataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.Result;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessDataResult;
import com.etiya.RentACarSpring.RentACar.core.utilities.result.SuccessResult;
import com.etiya.RentACarSpring.RentACar.dataAccess.abstracts.ColorDao;
import com.etiya.RentACarSpring.RentACar.entities.Color;
@Service
public class ColorManager implements ColorService{
	private ColorDao colorDao;
	private ModelMapperService modelMapperService;
	
	
	@Autowired
	public ColorManager(ColorDao colorDao, ModelMapperService modelMapperService) {
		super();
		this.colorDao = colorDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<Color>> getAll() {
		List<Color> result = this.colorDao.findAll();
		List<Color> response = result.stream().map(color->modelMapperService.forDto().map(color, Color.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<Color>>(response,"Renkler Listelendi");
	}

	@Override
	public Result save(CreateColorRequest createColorRequest) {
		Color color=modelMapperService.forRequest().map(createColorRequest, Color.class);
		this.colorDao.save(color);
		return new SuccessResult("Renk eklendi");
	}

	@Override
	public Result update(UpdateColorRequest updateColorRequest) {
		Color color=modelMapperService.forRequest().map(updateColorRequest, Color.class);
		this.colorDao.save(color);
		return new SuccessResult("Renk güncellendi");
	}

	@Override
	public Result delete(DeleteColorRequest deleteColorRequest) {
		Color color=modelMapperService.forRequest().map(deleteColorRequest, Color.class);
		this.colorDao.delete(color);
		return new SuccessResult("Renk Silindi");
	}

}
