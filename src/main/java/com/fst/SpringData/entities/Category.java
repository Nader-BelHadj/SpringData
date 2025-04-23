package com.fst.SpringData.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
@Id
@GeneratedValue
private long id;
private String name;
@OneToMany
private List<Product> products;
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
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Category() {
	super();
}
public Category(String name, List<Product> products) {
	super();
	this.name = name;
	this.products = products;
}


}
