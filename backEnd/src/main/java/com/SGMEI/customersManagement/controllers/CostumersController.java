package com.SGMEI.customersManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SGMEI.customersManagement.models.Costumers;
import com.SGMEI.customersManagement.repository.CostumersRepository;

@RestController
@RequestMapping("/clientes")
public class CostumersController {
	
	@Autowired
	public CostumersRepository costumersRepository;
	
	@GetMapping
	public List<Costumers> getCostumers() {
		
		List<Costumers> listaClientes = costumersRepository.getAll();
		return listaClientes;
	}
}
