package br.edu.ifpb.dac.fornecedor.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.fornecedor.modelo.InfoFornecedor;
import br.edu.ifpb.dac.fornecedor.servicos.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	public InfoFornecedor informacoesPorEstado(String estado) {
		System.out.println("informaçõesPorEstado: "+estado);
		return infoService.getInfoPorEstado(estado);
	}
}
