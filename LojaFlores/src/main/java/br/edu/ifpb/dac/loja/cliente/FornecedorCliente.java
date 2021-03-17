package br.edu.ifpb.dac.loja.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifpb.dac.loja.modelo.dto.InfoFornecedorDTO;
import br.edu.ifpb.dac.loja.modelo.dto.InfoPedidoDTO;
import br.edu.ifpb.dac.loja.modelo.dto.ItemDaCompraDTO;
import br.edu.ifpb.dac.loja.modelo.dto.ProdutoDTO;

@FeignClient("fornecedor")
public interface FornecedorCliente {

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO buscaInformacoesPorEstado(@PathVariable String estado);

	@RequestMapping("/produtos/{estado}")
	List<ProdutoDTO> buscaProdutosPorEstado(@PathVariable("estado") String estado);
	
	@RequestMapping("/produtos")
	List<ProdutoDTO> buscaProdutos();

	@RequestMapping(method = RequestMethod.POST, value="/pedido")
	InfoPedidoDTO realizaPedido(List<ItemDaCompraDTO> itens);
}
