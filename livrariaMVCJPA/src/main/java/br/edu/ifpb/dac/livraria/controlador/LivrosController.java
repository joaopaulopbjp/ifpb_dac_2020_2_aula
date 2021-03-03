package br.edu.ifpb.dac.livraria.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.repositorio.LivroRepositorio;
import br.edu.ifpb.dac.livraria.servico.LivroService;

@Controller
public class LivrosController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping("/livros")
	public String listar(Model model) {
		List<Livro> listaLivros = livroService.listaLivros();

		model.addAttribute("livros", listaLivros);

		return "livros";
	}

}
