package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CategoryService;

@Controller
public class ProfileController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/profile")
	public String profile(Model model) {
		model.addAttribute("categoryList", categoryService.getAllCategories());
		return "web/profile";
	}
}
