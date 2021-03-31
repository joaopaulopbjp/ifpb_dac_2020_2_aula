package br.edu.ifpb.dac.livraria.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClienteController {


	@GetMapping
	public String home() {

		return "index";
	}
}
