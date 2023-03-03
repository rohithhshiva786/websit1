package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.CarService;
import com.example.demo.entity.Car;

import jakarta.transaction.Transactional;

	@RestController
	public class CarController {
	@Autowired
	 CarService stuservice;
	@GetMapping(value="/getCarNameWithPrefix/{prefix}")
	public List<Car>getCarNameByPrefix(@PathVariable("prefix")String prefix){
		return stuservice.findByCarNameStartingWith(prefix);
	}
	@GetMapping(value="/getCarNameWithSufix/{sufix}")
	public List<Car>getCarNameBySufix(@PathVariable("sufix")String sufix){
		return stuservice.findByCarNameEndingWith(sufix);
	}
	@GetMapping(value="/getCarOwnerLessThan/{owners}")
	public List<Car>getCarOwnerLessThan(@PathVariable("owners")int owners){
		return stuservice.findByOwnersLessThan(owners);
	}
	@GetMapping(value="/getCarOwnerGreaterThan/{owners}")
	public List<Car>getCarOwnerGreaterThan(@PathVariable("owners")int owners){
		return stuservice.findByOwnersGreaterThan(owners);

	}
	@GetMapping(value="/getCarOwnerLessThanEqual/{owners}")
	public List<Car>getCarOwnerLessThanEqual(@PathVariable("owners")int owners){
		return stuservice.findByOwnersLessThan(owners);
	}
//	@GetMapping(value="/getCarOwnerGreaterThanEqual/{owners}")
//		public List<Car>getCarOwnerGreaterThanEqual(@PathVariable("owners")int owners){
//			return stuservice.findByOwnersGreaterThanEqual(owners);
		
	@Transactional
	@PutMapping(value="/updateCarOwner/{own}/{id}")
	public String updateCarOwner(@PathVariable("own")int own,@PathVariable("id") int id) {
		String del="";
		int delRes=stuservice.deleteCarDetails(id);
		if(delRes>0) {
			del="id :"+""+id+" "+"Successfully deleted";
			System.err.println(del);
		}
		else {
			del="id :"+id+" "+"Not Deleted";
			System.err.println(del);
		}
		return del;
	}
	}
		
	
