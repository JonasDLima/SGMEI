package com.SGMEI.accessManagement.repository;

import com.SGMEI.accessManagement.models.Access;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessRepository extends JpaRepository<Access, Long>{
	
	public Optional<Access> findByLogin(String login);

}
