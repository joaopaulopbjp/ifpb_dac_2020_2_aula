package br.edu.ifpb.dac.fornecedor.respositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifpb.dac.fornecedor.modelo.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
