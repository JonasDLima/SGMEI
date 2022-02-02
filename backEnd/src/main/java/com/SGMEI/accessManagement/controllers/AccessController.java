package com.SGMEI.accessManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SGMEI.accessManagement.models.Access;
import com.SGMEI.accessManagement.repository.AccessRepository;

@RestController
@RequestMapping("/usuarios")
public class AccessController {
	
	private final AccessRepository repository;
	private final PasswordEncoder encoder;
	
	public AccessController(AccessRepository repository, PasswordEncoder encoder) {
		this.repository = repository;
		this.encoder = encoder;
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<Access>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/salvarUsuario")
	public ResponseEntity<Access> salvarUsuario(@RequestBody Access usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return ResponseEntity.ok(repository.save(usuario));
	}
	
	@GetMapping("/validarSenha")
	public ResponseEntity<Boolean> validarSenha(@RequestParam String login, @RequestParam String password) {
		
		Optional<Access> optAccess = repository.findByLogin(login);
		if (optAccess.isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
		}
		
		Access usuario = optAccess.get();
		boolean valid = encoder.matches(password, usuario.getPassword());
		
		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
		return ResponseEntity.status(status).body(valid);
	}
	
}
