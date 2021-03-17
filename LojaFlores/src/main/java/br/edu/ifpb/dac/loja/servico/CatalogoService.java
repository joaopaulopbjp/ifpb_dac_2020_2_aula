package br.edu.ifpb.dac.loja.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.loja.cliente.FornecedorCliente;
import br.edu.ifpb.dac.loja.modelo.dto.ProdutoDTO;

@Service
public class CatalogoService {

	@Autowired
	private FornecedorCliente fornecedorCliente;

	public List<ProdutoDTO> buscaProdutos() {
		return fornecedorCliente.buscaProdutos();
	}
	
	
}
