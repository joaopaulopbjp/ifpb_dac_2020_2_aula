package br.edu.ifpb.dac.fornecedor.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.fornecedor.modelo.Produto;
import br.edu.ifpb.dac.fornecedor.respositorio.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	public List<Produto> getProdutos() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtoRepository.findAll().forEach(produtos::add);
		return produtos;
	}

	
}
