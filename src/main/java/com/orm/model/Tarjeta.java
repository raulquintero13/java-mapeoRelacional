package com.orm.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Tarjeta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	private Date fechaCaducidad;
	
	@OneToOne
	@JoinColumn(name = "socio_id")
	 private Socio socio;

	
	public Tarjeta() {
		super();
	}


	public Tarjeta(Date fechaCaducidad, Socio socio) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.socio = socio;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public Socio getSocio() {
		return socio;
	}


	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
	
	
	
	
	
}
