package br.edu.ifpb.dac.livraria.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.servico.LivroService;

@RestController
@RequestMapping("/livros")
public class LivrosRestController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<Livro> listar() {
		return livroService.listaLivros();
	}

	@GetMapping("/{id}")
	public Livro detalhaLivro(@PathVariable("id") Integer id) {
		return livroService.buscaPeloId(id);
	}
	
	@PostMapping
	public void adicionaLivro(@RequestBody Livro livro) {	
		livroService.adicionaLivro(livro);
	}
	
	@PutMapping("/{id}")
	public void atualizaLivro(@RequestBody Livro livro, @PathVariable("id") Integer id) {
		livroService.atualizaLivro(id,livro);
	}

	@DeleteMapping("/{id}")
	public void excluiLivro(@PathVariable("id") Integer id) {
		livroService.excluiLivro(id);
	}

}
