package com.algaworks.patrimonio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.patrimonio.model.Evento;
import com.algaworks.patrimonio.repository.EventoRepository;

@RestController
public class EventoResource {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping("/eventos")
	public List<Evento> listar(@RequestParam(value="local", required=false) Long id,
							   @RequestParam(value="piso", required=false) Integer piso) {
		
		if (id != null) {
			return eventoRepository.findByLocalId(id);
		}
		
		if (piso != null) {
			return eventoRepository.findByLocalPiso(piso);
		}
		
		return eventoRepository.findAll();
	}
	
	@GetMapping("/eventos/{id}")
	public Evento listaPorId(@PathVariable Long id) {
		return eventoRepository.findOne(id);
	}
	
}
