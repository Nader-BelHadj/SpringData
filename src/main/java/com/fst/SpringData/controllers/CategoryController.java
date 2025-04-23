package com.fst.SpringData.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.fst.SpringData.entities.Category;
import com.fst.SpringData.repositories.CategoryRepository;

@Controller
@RequestMapping("categories")
public class CategoryController {
	
	private final CategoryRepository categoryRepository;
	//@Autowired
	public CategoryController(CategoryRepository categoryRepository)
	{
		this.categoryRepository=categoryRepository;
	}

	
	@GetMapping("list")
	public String afficher(Model model)
	{
		List<Category>categories=categoryRepository.findAll();
		model.addAttribute("categories",categories);

		return "afficher";
	}
	@GetMapping ("add")
	public String ajouter(Model model)
	{
		model.addAttribute("category",new Category());
		return "addCategory";
	}
	@PostMapping("add")
	public String add(@ModelAttribute Category category)
	{
		categoryRepository.save(category);
		return "redirect:list";
		
		
	}
	
}
