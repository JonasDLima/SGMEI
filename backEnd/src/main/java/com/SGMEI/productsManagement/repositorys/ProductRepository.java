package com.SGMEI.productsManagement.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SGMEI.productsManagement.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query(value="select * from produtos", nativeQuery=true)
	public List<Product> getAll();
	
}