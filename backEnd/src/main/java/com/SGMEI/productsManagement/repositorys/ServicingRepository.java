package com.SGMEI.productsManagement.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SGMEI.productsManagement.models.Servicing;

public interface ServicingRepository extends JpaRepository<Servicing, Long>{
	
	@Query(value="select * from servicos", nativeQuery=true)
	public List<Servicing> getAll();
}
