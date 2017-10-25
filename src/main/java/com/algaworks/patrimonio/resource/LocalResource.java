package com.algaworks.patrimonio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.patrimonio.model.Local;
import com.algaworks.patrimonio.repository.LocalRepository;

@RestController
public class LocalResource {
	
	@Autowired
	private LocalRepository localRepository;
	
	@GetMapping("/locais")
	public List<Local> listar() {
		return localRepository.findAll();
	}
}
