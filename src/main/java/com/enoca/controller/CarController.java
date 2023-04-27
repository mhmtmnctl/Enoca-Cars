package com.enoca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.enoca.responseDTO.CarResponseDTO;
import com.enoca.service.CarService;

@RestController// bu classın controller olduğunu söylüyorum 
public class CarController {
	
	@Autowired
	private CarService carService;

	@GetMapping("/cars")
    public ResponseEntity<List<CarResponseDTO>>  getCarsWithBrandNameAndModelYear(@RequestParam String brandName, @RequestParam int modelYear) {
		
		List<CarResponseDTO> dtoList = carService.getCarsWithBrandAndModelYear(brandName,modelYear);
				
        return ResponseEntity.ok(dtoList);
        
        //burada  servis katmanına gerek olmadan da direkt repoya gidebilirdim. n-tier çalıştığım için bu şekilde yapıyorum
    }
}
