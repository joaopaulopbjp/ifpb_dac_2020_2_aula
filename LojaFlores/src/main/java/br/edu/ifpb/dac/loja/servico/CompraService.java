package br.edu.ifpb.dac.loja.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.ifpb.dac.loja.modelo.Compra;
import br.edu.ifpb.dac.loja.modelo.CompraState;
import br.edu.ifpb.dac.loja.modelo.dto.CompraDTO;
import br.edu.ifpb.dac.loja.modelo.dto.InfoFornecedorDTO;
import br.edu.ifpb.dac.loja.modelo.dto.InfoPedidoDTO;
import br.edu.ifpb.dac.loja.repositorio.CompraRepository;

@Service
public class CompraService {

	
//	@Autowired
//	private DiscoveryClient eurekaCliente;
	
	@Autowired
	private CompraRepository compraRepository;

	public Compra realizarCompra(CompraDTO compra) {
		System.out.println("CompraService_realizarCompra_estado: "+compra.getEndereco().getEstado());
	
//		InfoFornecedorDTO info = fornecedorCliente.buscaInformacoesPorEstado(compra.getEndereco().getEstado());
	
//		System.out.println("Endereço fornecedor: "+info.getEndereco());

		Compra compraSalva = new Compra();
		compraSalva.setState(CompraState.RECEBIDO);
		compraSalva.setEnderecoDestino(compra.getEndereco().toString());
		compraRepository.save(compraSalva);
		compra.setCompraId(compraSalva.getId());

		return compraSalva;
	}
		
}
