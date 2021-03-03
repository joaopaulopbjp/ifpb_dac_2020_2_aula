package br.edu.ifpb.dac.livraria.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.livraria.modelo.Livro;
import br.edu.ifpb.dac.livraria.repositorio.LivroRepositorio;

@Service
public class LivroService {

	@Autowired
	private LivroRepositorio livroRepositorio;
	
	public List<Livro> listaLivros(){
		return (List<Livro>) livroRepositorio.findAll();
	}
}
