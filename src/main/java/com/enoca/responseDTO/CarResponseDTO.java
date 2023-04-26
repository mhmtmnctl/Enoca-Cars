package com.enoca.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarResponseDTO {

	private Long id;
			
	private String brandName;
			
	private Integer modelYear;
	 
	private Double price;
	
	private String GalleryName; //galery objesi yerine sadece adını döndüm. 
}
