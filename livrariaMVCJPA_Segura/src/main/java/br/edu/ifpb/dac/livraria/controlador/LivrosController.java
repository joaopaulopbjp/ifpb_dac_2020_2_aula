package br.edu.ifpb.dac.livraria.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.modelo.Usuario;
import br.edu.ifpb.dac.livraria.repositorio.LivroRepositorio;
import br.edu.ifpb.dac.livraria.servico.LivroService;

@Controller
public class LivrosController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping("/publico/livros")
	public String listar(Model model, @AuthenticationPrincipal Usuario usuario) {
		List<Livro> listaLivros = livroService.listaLivros();

		model.addAttribute("livros", listaLivros);
		model.addAttribute("usuario", usuario);

		return "/livros/livros";
	}
	
	@GetMapping("/protegido/formAdicionaLivro")
	public String mostraFormularioLivro(Model model) {

		model.addAttribute("livro", new Livro());

		return "/livros/formLivro";
	}
	
	@PostMapping("/protegido/adicionaLivro")
	public String processarFormulario(@ModelAttribute("livro") Livro livro) {
		
		livroService.adicionaLivro(livro);
		
		return "redirect:/publico/livros";
	}


}
