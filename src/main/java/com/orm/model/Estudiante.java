package com.orm.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
			name="estudiante_curso", joinColumns = @JoinColumn(name="estudiante_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="curso_id", referencedColumnName = "id")
			)
	private List<Curso> cursos;
	
	

	public Estudiante() {
		super();
	}



	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
	
	
}
