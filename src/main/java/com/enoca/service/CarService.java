package com.enoca.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.enoca.domain.Car;
import com.enoca.repository.CarRepository;
import com.enoca.responseDTO.CarResponseDTO;

@Service // springe bu classın bir servis classı old. söylüyorum
public class CarService {
	// burası logic yaptığım yer

	@Autowired
	CarRepository carRepository;// DI(dependecy injection)

	public List<CarResponseDTO> getCarsWithBrandAndModelYear(String brandName, int modelYear) {

		List<Car> cars = carRepository.findCarsByBrandNameAndModelYear(brandName, modelYear);

		// burada mapper kullanarak gelen pojo classı dto'ya mapleyebilirdim.
		// fakat elle tek tek dto'ya setliyorum.

		List<CarResponseDTO> carResponseList = new ArrayList<>();

		if (cars.size() >= 3) {
			for (Car w : cars) {

				CarResponseDTO carResponseDTO = new CarResponseDTO();

				carResponseDTO.setId(w.getId());
				carResponseDTO.setBrandName(w.getBrandName());
				carResponseDTO.setGalleryName(w.getAutoGallery().getName());
				carResponseDTO.setModelYear(w.getModelYear());
				carResponseDTO.setPrice(w.getPrice());

				carResponseList.add(carResponseDTO);

			}
			return carResponseList;
		}

		return null;

	}

}
