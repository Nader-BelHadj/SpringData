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

} 
