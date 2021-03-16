package br.edu.ifpb.dac.fornecedor.respositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.fornecedor.modelo.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Integer>{

	
	public InfoFornecedor findByEstado(String estado);
}
