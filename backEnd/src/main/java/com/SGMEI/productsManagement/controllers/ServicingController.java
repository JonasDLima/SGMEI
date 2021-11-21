package com.SGMEI.productsManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SGMEI.productsManagement.models.Servicing;
import com.SGMEI.productsManagement.repositorys.ServicingRepository;

@RestController
@RequestMapping("/servicos")
public class ServicingController {
	
	@Autowired
	private ServicingRepository servicingRepository;
	
	@GetMapping
	public List<Servicing> getServicing() {
		
		List<Servicing> listaServicos = servicingRepository.getAll();
		return listaServicos;
	}

}
