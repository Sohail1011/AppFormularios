package idat.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import idat.edu.pe.model.Alumno;

@Controller
public class AlumnoController {

	@GetMapping("/alumnos")
	public String frmListarAlumnos(Model model) {
		model.addAttribute("alumnos", listarAlumnos());
		return "frmListarAlumnos";
	}

	private List<Alumno> listarAlumnos() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno("A789656", "Juan Alonso", "Aguirre Leti", "ernesto@gmail.com"));
		alumnos.add(new Alumno("A562345", "Abigail Lorena", "Irene Garcia", "ulti789@gmail.com"));
		alumnos.add(new Alumno("A234159", "Tayra Ursula", "Perez Kerez", "789star@gmail.com"));
		alumnos.add(new Alumno("A001000", "Enrique Soraz", "Ortega Nuñez", "guerrero@gmail.com"));
		return alumnos;
	}

}
