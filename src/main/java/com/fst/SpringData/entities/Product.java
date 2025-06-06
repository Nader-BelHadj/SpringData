package com.fst.SpringData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private double price;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product() {
	super();
}
public Product(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}

} 
