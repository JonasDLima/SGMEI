package com.SGMEI.productsManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SGMEI.productsManagement.models.Product;
import com.SGMEI.productsManagement.repositorys.ProductRepository;

@RestController
@RequestMapping("/produtos")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getProducts(){
		
		List<Product> listaProdutos = productRepository.getAll();
		System.out.println(listaProdutos);
		//return productRepository.getAll();
		return listaProdutos;
	}

}
