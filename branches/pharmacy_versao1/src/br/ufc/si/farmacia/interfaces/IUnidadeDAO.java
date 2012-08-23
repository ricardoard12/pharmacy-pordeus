package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.Unidade;

public interface IUnidadeDAO {

	public void salvarUnidade(Unidade unidade);
	
	public boolean atualizarUnidade(Unidade unidade);
	
	public boolean removerUnidade(Unidade unidade);
	
	public List<Unidade> listaTodos();
	
	
}//fim da interface
