package br.edu.ifpb.dac.fornecedor.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.fornecedor.modelo.Produto;
import br.edu.ifpb.dac.fornecedor.servicos.ProdutoService;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	public List<Produto> getProdutosPorEstado( String estado) {
		return produtoService.getProdutosPorEstado(estado);
	}
}
