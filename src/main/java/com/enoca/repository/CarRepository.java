package com.enoca.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.enoca.domain.Car;

public interface CarRepository  extends JpaRepository<Car, Long>{//jpa reposunu extend edip crud metodlarını da kullanabilirim
	
	@Query("SELECT c FROM Car c WHERE c.brandName = :brandName AND c.modelYear = :modelYear")
	//@Query("SELECT c.brandName, c.modelYear, COUNT(c.id) FROM Car c WHERE c.brandName = :brandName AND c.modelYear = :modelYear GROUP BY c.brandName, c.modelYear HAVING COUNT(c.id) > 3")
    List<Car> findCarsByBrandNameAndModelYear(@Param("brandName") String brandName, @Param("modelYear") int modelYear);


}
