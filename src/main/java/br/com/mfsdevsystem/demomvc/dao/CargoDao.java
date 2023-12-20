package br.com.mfsdevsystem.demomvc.dao;

import java.util.List;

import br.com.mfsdevsystem.demomvc.domain.Cargo;
import br.com.mfsdevsystem.demomvc.util.PaginacaoUtil;

public interface CargoDao {

	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
	PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
