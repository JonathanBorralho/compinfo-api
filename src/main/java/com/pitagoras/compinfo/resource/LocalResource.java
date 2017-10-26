package com.pitagoras.compinfo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/locais")
	public Local salvar(@RequestBody Local local) {
		return localRepository.save(local);
	}
	
	@PutMapping("/locais")
	public Local modificar(@RequestBody Local local) {
		return localRepository.save(local);
	}
	
	@DeleteMapping("/locais/{id}")
	public void deletar(@PathVariable Long id) {
		localRepository.delete(id);
	}
}
