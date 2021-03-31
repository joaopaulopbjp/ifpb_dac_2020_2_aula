package br.edu.ifpb.dac.livraria.controlador;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class ClienteController {


	@GetMapping
	public String listar() {

		return "/livros/livroForm";
	}
}
