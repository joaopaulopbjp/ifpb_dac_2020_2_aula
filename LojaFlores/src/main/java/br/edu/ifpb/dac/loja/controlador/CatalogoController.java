package br.edu.ifpb.dac.loja.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.loja.modelo.Compra;
import br.edu.ifpb.dac.loja.modelo.dto.CompraDTO;
import br.edu.ifpb.dac.loja.modelo.dto.ProdutoDTO;
import br.edu.ifpb.dac.loja.servico.CatalogoService;
import br.edu.ifpb.dac.loja.servico.CompraService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
	
	@Autowired
	private CatalogoService catalogoService;

	@GetMapping
	public List<ProdutoDTO> listaProdutos() {
		System.out.println("CatalogoController_buscarProdutos. ");
		return catalogoService.buscaProdutos();
	}
}
