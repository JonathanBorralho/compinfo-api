package com.pitagoras.compinfo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.pitagoras.compinfo.enums.StatusEvento;
import com.pitagoras.compinfo.enums.TipoEvento;
import com.pitagoras.compinfo.enums.Turno;

@Entity
public class Evento {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String instrutor;
	
	@Column(name="tipo_evento")
	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;
	
	@ManyToOne
	private Local local;
	
	private LocalDate data;
	
	@Column(name="hora_inicio")
	private LocalDateTime horaInicio;
	
	@Column(name="hora_fim")
	private LocalDateTime horaFim;
	
	@Enumerated(EnumType.STRING)
	private Turno turno;
	
	private StatusEvento status;
	
	@Column(name="modificado")
	private boolean isModificado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalDateTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalDateTime horaFim) {
		this.horaFim = horaFim;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public StatusEvento getStatus() {
		return status;
	}
	public void setStatus(StatusEvento status) {
		this.status = status;
	}
	public boolean isModificado() {
		return isModificado;
	}
	public void setModificado(boolean isModificado) {
		this.isModificado = isModificado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
