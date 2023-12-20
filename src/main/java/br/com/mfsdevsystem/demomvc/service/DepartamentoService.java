package br.com.mfsdevsystem.demomvc.service;

import java.util.List;

import br.com.mfsdevsystem.demomvc.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentosTemCargos(Long id);
}
