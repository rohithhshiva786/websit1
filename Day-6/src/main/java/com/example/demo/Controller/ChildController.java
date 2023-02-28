package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.ChildService;
import com.example.demo.entity.Child;

@RestController
public class ChildController{
@Autowired
private ChildService chiservice;

@GetMapping("/getChild")
public List<Child> getDetails(){
	return chiservice.getAllDetails();
	
}
@PostMapping("/addChild")
public Child postDetails(@RequestBody Child c) {
	return chiservice.saveDetails(c);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	 chiservice.deleteDepartmentById(id);
	 return "Deleted";
}
@PutMapping("/updateChild/{id}")
public Child update(@PathVariable int id,@RequestBody Child c) {
return chiservice.update(id,c);
}
}