package br.edu.ifpb.dac.livraria.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.dac.livraria.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Optional<Usuario> findByEmail(String email);

}
