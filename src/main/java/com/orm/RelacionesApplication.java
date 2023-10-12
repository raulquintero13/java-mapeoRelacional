package com.orm;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orm.model.Autor;
import com.orm.model.Libro;
import com.orm.model.Socio;
import com.orm.model.Tarjeta;
import com.orm.model.Estudiante;
import com.orm.model.Curso;
import com.orm.repository.AutorRepository;
import com.orm.repository.CursoRepository;
import com.orm.repository.SocioRepository;
import com.orm.repository.EstudianteRepository;

@SpringBootApplication
public class RelacionesApplication implements CommandLineRunner{
	
	@Autowired
	CursoRepository cursoRepository;
	@Autowired
	EstudianteRepository estudianteRepository;
//	AutorRepository autorRepository;
//	SocioRepository socioRepository;

	
	public static void main(String[] args) {SpringApplication.run(RelacionesApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Relacion OneToOne
		 */
		
//		
//		Socio socio = new Socio("pepe", "pepe@server.com");
//		Tarjeta tarjeta = new Tarjeta(new Date(),socio);
//		socio.setTarjeta(tarjeta);
//		
//		socioRepository.save(socio);
//		
//		socioRepository.findAll().forEach(x-> {
//			System.out.println(x.getNombre() + "-" + x.getTarjeta().getFechaCaducidad());
//		});
//		
		
//		Optional<Socio> socio = socioRepository.findById(7L);
//		System.out.println(socio.get().getNombre());
		
//		socioRepository.delete(socio.get());
		
		
		
	/*
//	 * Relacion OneToMany	
//	 */
//		
//		Libro libro1 = new Libro("libro copia 1", "Edicion 1");
//		Libro libro2 = new Libro("libro copia 2", "Edicion 1");
//		Libro libro3 = new Libro("libro copia 3", "Edicion 1");
//		Libro libro4 = new Libro("libro copia 4", "Edicion 1");
//		
//		Autor autor = new Autor("miguel", "juan@server.com");
//		
//		List<Libro> librosAutor = new ArrayList<>();
//		
//		libro1.setAutor(autor);
//		libro2.setAutor(autor);
//		libro3.setAutor(autor);
//		libro4.setAutor(autor);
//		
//		librosAutor.add(libro1);
//		librosAutor.add(libro2);
//		librosAutor.add(libro3);
//		librosAutor.add(libro4);
//		
//		autor.setLibros(librosAutor);
//		Autor autorSave = autorRepository.save(autor);
//		
//		System.out.println(autorSave.getNombre());
//		autorSave.getLibros().forEach(x-> {
//			System.out.println("Libros Creados:" + x.getNombre());
//		});
		
		/*
		 * Relacion ManyToMany
		 */
		
		
		
		Estudiante estudiante1 = new Estudiante("juan");
		Estudiante estudiante2 = new Estudiante("pedro");
		
		Curso curso1= new Curso("fisica");
		Curso curso2 = new Curso("Base de datos");
		
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		
		List<Curso> cursosEstudiante1 = new ArrayList<>();
		cursosEstudiante1.add(curso1);
		cursosEstudiante1.add(curso2);
		estudiante1.setCursos(cursosEstudiante1);
		
		List<Curso> cursosEstudiante2 = new ArrayList<>();
		cursosEstudiante2.add(curso1);
		estudiante2.setCursos(cursosEstudiante2);
		
		estudianteRepository.save(estudiante1);
		estudianteRepository.save(estudiante2);
		
		
		
	}
	

	
	
	

}
