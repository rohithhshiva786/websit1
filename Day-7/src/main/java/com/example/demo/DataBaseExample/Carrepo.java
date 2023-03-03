package com.example.demo.DataBaseExample;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Car;

public interface Carrepo extends JpaRepository<Car, Integer>{
	 
	   public  List<Car> findByCarNameStartingWith(String prefix);
	   public List<Car> findByCarNameEndingWith(String sufix);
	   public List<Car> findByOwnersLessThan(int owners);
	  public List <Car> findByOwnersGreaterThan(int owners);
//	  public List<Car> findByOwnersLessThanEqual(int owners);
//	  public List <Car> findByOwnersGreaterThanEqual(int owners);
	  @Query ("Select stu from Models2  stu Where stu.id=?1" )
	  public List<Car>findAllCarById(int id);
	  @Modifying
	  @Query("Update Models2 stu set stu.owners=:own where stu.id=:id")
	  public int updateCarOwner(@Param("own")int own,@Param("id")int id);
	  @Modifying
	  @Query("Delete from Models2 stu where stu.id=:id")
	  public int deleteCarDetails(@Param("id")int id);
}
