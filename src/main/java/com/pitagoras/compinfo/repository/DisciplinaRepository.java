package com.pitagoras.compinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitagoras.compinfo.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
	
	Disciplina findBySala(String salaNum);
}
