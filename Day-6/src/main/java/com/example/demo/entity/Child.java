package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Model")
@Entity
public class Child {
@Id
@Column(name="ID")
@GeneratedValue
private int id;
@Column(name="BABYFIRSTNAME")
private String babyfirstname;
@Column (name="BABYLASTNAME")
private String  babylastname;
@Column(name="FATHERNAME")
private String fathername;
@Column(name="MOTHERNAME")
private String mothername;
@Column(name="ADDRESS")
private String address;
public int getId() {

	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getbabyfirstName() {
	return babyfirstname;
}
public void setbabyfirstName(String babyfirstname) {
	this.babyfirstname = babyfirstname;
}
public String getbabylastName() {
	return babylastname;
}
public void setbabylastName(String babylastname) {
	this.babylastname=babylastname;
}
public String getfatherName() {
	return fathername;
}
public void setfatherName(String fathername) {
	this.fathername=fathername;
}
public String getmotherName() {
	return  mothername;
}
public void setmotherName(String mothername) {
	this.mothername=mothername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address=address;
}

public Child(int id, String babyfirstname,String babylastname,String fathername,String mothername,String address) {
	super();
	this.id = id;
	this.babyfirstname = babyfirstname;
	this.babylastname = babylastname;
	this.fathername=fathername;
	this.mothername=mothername;
	this.address=address;
}
public Child()
{
	}
}
