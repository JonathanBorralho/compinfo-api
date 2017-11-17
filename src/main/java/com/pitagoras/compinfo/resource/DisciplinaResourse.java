package com.pitagoras.compinfo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pitagoras.compinfo.model.Disciplina;
import com.pitagoras.compinfo.repository.DisciplinaRepository;

@CrossOrigin(origins = "**")
@RestController
public class DisciplinaResourse {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@GetMapping("/sala/{numSala}")
	public String getDisciplinaInfo(@PathVariable String numSala) {
		
		Disciplina disci = disciplinaRepository.findBySala(numSala);
		
		return numSala + "/" + disci.getNome() + "/" + disci.getCurso().getNome();
		
	}
	
	@PostMapping("/disciplinas")
	public Disciplina salva(@ RequestBody Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
	
}
