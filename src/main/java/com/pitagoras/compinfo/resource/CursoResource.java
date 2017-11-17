package com.pitagoras.compinfo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pitagoras.compinfo.model.Curso;
import com.pitagoras.compinfo.repository.CursoRepository;

@CrossOrigin(origins = "**")
@RestController
public class CursoResource {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@PostMapping("/cursos")
	public Curso salva(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}
