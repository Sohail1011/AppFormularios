package idat.edu.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import idat.edu.pe.model.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("Mensaje", "Iniciar Sesión");
		model.addAttribute("loginform", new LoginForm());
		return "login";
	}

	@PostMapping("/login")
	public String autenticacion(@ModelAttribute("loginform") LoginForm login, Model model) {
		if (login.getUsuario().equals("Min Min") && login.getPassword().equals("1234")) {
			model.addAttribute("usuario", "Bienvenido: " + login.getUsuario());
			return "autenticacion";
		} else {
			model.addAttribute("Mensaje", "Iniciar Sesión");
			model.addAttribute("loginform", new LoginForm());
			return "login";
		}
	}
}