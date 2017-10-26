package com.pitagoras.compinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pitagoras.compinfo.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	
	public List<Evento> findByLocalId(Long id);
	
	public List<Evento> findByLocalPiso(Integer number);
	
}
