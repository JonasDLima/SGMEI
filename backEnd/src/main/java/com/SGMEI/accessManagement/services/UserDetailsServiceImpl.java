package com.SGMEI.accessManagement.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.SGMEI.accessManagement.data.UserDetailsData;
import com.SGMEI.accessManagement.models.Access;
import com.SGMEI.accessManagement.repository.AccessRepository;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private final AccessRepository repository;

	public UserDetailsServiceImpl(AccessRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Access> usuario = repository.findByLogin(username);
		if(usuario.isEmpty()) {
			throw new UsernameNotFoundException("Usuário [" + username + "] não encontrado");
		}
		
		return new UserDetailsData(usuario);
	}

}
