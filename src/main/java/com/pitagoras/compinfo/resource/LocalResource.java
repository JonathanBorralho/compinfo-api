package com.pitagoras.compinfo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pitagoras.compinfo.model.Local;
import com.pitagoras.compinfo.repository.LocalRepository;

@RestController
public class LocalResource {
	
	@Autowired
	private LocalRepository localRepository;
	
	@GetMapping("/locais")
	public List<Local> listar() {
		return localRepository.findAll();
	}
}
