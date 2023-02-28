package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.DatabaseExample.childrepo;
import com.example.demo.entity.Child;
@Service
public class ChildService {
@Autowired
private childrepo chi;
public Child saveDetails(Child c) {

	return chi.save(c);
		
}
public List<Child> getAllDetails()
{
	Pageable p = PageRequest.of(0, 2);
	Page<Child> c = chi.findAll(p);
	//return s.toList();
List<Child> pass = chi.findAll(Sort.by(Sort.Direction.ASC,"id"));
return pass;
}
public void deleteDepartmentById(int id)
{
	chi.deleteById(id);
}
public Child update(int  id,Child c){
return chi.save(c);	
}
//public List<Child> c(){
//	return c();
//}
}
