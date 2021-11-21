package com.SGMEI.customersManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SGMEI.customersManagement.models.Costumers;

public interface CostumersRepository extends JpaRepository<Costumers, Long>{
	
	@Query(value="select * from clientes", nativeQuery=true)
	public List<Costumers> getAll();
}
