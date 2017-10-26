package com.pitagoras.compinfo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pitagoras.compinfo.model.Evento;
import com.pitagoras.compinfo.repository.EventoRepository;

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
	
	@PostMapping("/eventos")
	public Evento salvar(@RequestBody Evento e) {
		return eventoRepository.save(e);
	}
	
	@PutMapping("/eventos/{id}")
	public Evento modificar(@RequestBody Evento evento, @PathVariable Long id) {
		
		Evento oldEvento = eventoRepository.findOne(id);
		
		if ( !oldEvento.getLocal().equals(evento.getLocal()) ) {
			evento.setModificado(true);
		}
		
		return eventoRepository.save(evento);
	}
	
	@DeleteMapping("/eventos/{id}")
	public void deletar(@PathVariable Long id) {
		eventoRepository.delete(id);
	}
}
