package br.com.mfsdevsystem.demomvc.service;

import java.util.List;

import br.com.mfsdevsystem.demomvc.domain.Cargo;
import br.com.mfsdevsystem.demomvc.util.PaginacaoUtil;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
	
}
