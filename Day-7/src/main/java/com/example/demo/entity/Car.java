package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Models-3")
@Entity
public class Car {
@Id
@Column(name="ID")
@GeneratedValue
private int id;
@Column(name="CARNAME")
private String carname;
@Column(name="CARTYPE")
private String cartype;
@Column(name="OWNERS")
private int owners;
@Column(name="CURRENTOWNERNAME")
private String currentownername;
@Column(name="MOBILE")
private long mobile;
@Column(name="ADDRESS")
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getcarname() {
	return carname;
	
}
public void setcarname(String carname) {
	this.carname=carname;
}
public String getcartype() {
	return cartype;
}
public void setcartype(String cartype) {
	this.cartype=cartype;
}
public int getowner() {
	return owners;
}
public void setowner(int owners) {
	this.owners=owners;
}
public String getcurrentownername() {
	return currentownername;
}
public void setcurrentownername(String currentownername) {
	this.currentownername=currentownername;
}
public long getmobile() {
	return mobile;
}
public void setmobile(long mobile) {
	this.mobile=mobile;
}
public String getaddress() {
	return address;
}
public void setaddress(String address) {
	this.address=address;
}
public Car(int id,String carname,String cartype,int owners,String currentownername,long mobile,String address) {
	super();
	this.id=id;
	this.carname=carname;
	this.cartype=cartype;
	this.owners=owners;
	this.currentownername=currentownername;
	this.mobile=mobile;
	this.address=address;
}
public Car() {
	
}
}
