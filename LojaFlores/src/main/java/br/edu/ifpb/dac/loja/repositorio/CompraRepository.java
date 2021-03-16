package br.edu.ifpb.dac.loja.repositorio;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.loja.modelo.Compra;


@Repository
public interface CompraRepository extends CrudRepository<Compra, Long>{

}
