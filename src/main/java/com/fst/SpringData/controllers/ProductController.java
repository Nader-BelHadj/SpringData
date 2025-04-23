package com.fst.SpringData.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fst.SpringData.repositories.ProductRepository;

@Controller
@RequestMapping("products")
public class ProductController {

	private final ProductRepository productRepository;
	
	//injection de dependence via le constructeur
	public ProductController(ProductRepository productRepository)
	{
		this.productRepository=productRepository;
	}
	
	
	@GetMapping("list")
	public String afficher(Model model)
	{
		
		model.addAttribute("products",productRepository.findAll());
		return "afficher";
	}
	@GetMapping("add")
	public String ajouter()
	{
		return "add";
	}
	
	
	{
		
		
	}
	
	
	
}
