package com.pitagoras.compinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitagoras.compinfo.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
