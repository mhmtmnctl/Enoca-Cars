package com.enoca.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // lombok kütüphanesi kullandım.
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_auto_gallery")
public class AutoGallery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "autoGallery") //  cascade = CascadeType.ALL, orphanRemoval = true eklenebilir.
	private List<Car> cars = new ArrayList<>(); //her araç unique old. için set kullanılabilirdi.

}
