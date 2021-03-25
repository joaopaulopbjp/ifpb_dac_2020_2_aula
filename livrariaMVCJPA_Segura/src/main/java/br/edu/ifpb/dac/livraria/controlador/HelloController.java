package br.edu.ifpb.dac.livraria.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.repositorio.AutorRepositorio;
import br.edu.ifpb.dac.livraria.servico.AutorService;

@Controller
public class HelloController {
	
	@Autowired
	private AutorService autoService;

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "João");
		
		return "helloworld";
	}
}
