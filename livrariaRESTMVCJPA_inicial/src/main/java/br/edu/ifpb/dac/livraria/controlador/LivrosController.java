package br.edu.ifpb.dac.livraria.controlador;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.repositorio.LivroRepositorio;
import br.edu.ifpb.dac.livraria.servico.LivroService;

@RestController
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<Livro> listar(Model model) {
		List<Livro> listaLivros = livroService.listaLivros();

		return listaLivros;
	}
	
	@GetMapping("/{id}")
	public Livro detalhaLivro(@PathVariable("id") Integer id) {
		return livroService.buscaPeloId(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void adicionaLivro(@RequestBody Livro livro) {
		
		livroService.adicionaLivro(livro);
	}
	
	@PutMapping("/{id}")
	public void atualizaLivro(@RequestBody Livro livro,@PathVariable Integer id) {
		
		livroService.atualizaLivro(id,livro);
	}


}
