package com.enoca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter// lombok kütüphanesi kullandım.
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column 	
	private String brandName;
	
	@Column 	
	private Integer modelYear;
	
	@Column 
	private Double price;
	
	@ManyToOne(fetch = FetchType.LAZY) //default eagerdır. ben lazy yaptım. sadece çağrıldığında db'den yükleyip getirsin
    @JoinColumn(name = "auto_gallery_id")
    private AutoGallery autoGallery;
	
	

}
