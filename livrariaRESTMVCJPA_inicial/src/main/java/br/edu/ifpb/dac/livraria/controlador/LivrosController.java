package br.edu.ifpb.dac.livraria.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.servico.LivroService;

@Controller
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping
	public String listar(Model model) {
		model.addAttribute("livros", livroService.listaLivros());
		return "/livros/livros";
	}

	public String detalhaLivro(Integer id) {
		return "/livros/livro";
	}
	
	public void adicionaLivro(Livro livro) {
		
		livroService.adicionaLivro(livro);
	}
	
	public void atualizaLivro(Livro livro, Integer id) {
		
		livroService.atualizaLivro(id,livro);
	}


}
