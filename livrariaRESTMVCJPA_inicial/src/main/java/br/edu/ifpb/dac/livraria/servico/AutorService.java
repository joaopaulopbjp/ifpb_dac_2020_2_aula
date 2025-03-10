package br.edu.ifpb.dac.livraria.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.livraria.modelo.Autor;
import br.edu.ifpb.dac.livraria.repositorio.AutorRepositorio;

@Service
public class AutorService {

	@Autowired
	private AutorRepositorio autorRep;
	
	public List<Autor> listaAutores(){
		return (List<Autor>)autorRep.findAll();
	}
}
