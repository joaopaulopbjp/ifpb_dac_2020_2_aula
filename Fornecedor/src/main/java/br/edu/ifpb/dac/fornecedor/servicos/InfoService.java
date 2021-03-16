package br.edu.ifpb.dac.fornecedor.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.fornecedor.modelo.InfoFornecedor;
import br.edu.ifpb.dac.fornecedor.respositorio.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRep;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
			return infoRep.findByEstado(estado);
	}

	
}
