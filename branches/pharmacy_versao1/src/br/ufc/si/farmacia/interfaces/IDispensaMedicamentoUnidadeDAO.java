package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.DispensaMedicamentoUnidade;


public interface IDispensaMedicamentoUnidadeDAO {

	public void inserirDispensaMedicamentoUnidade(DispensaMedicamentoUnidade dispensacao);

	public boolean removerDispensaMedicamentoUnidade(DispensaMedicamentoUnidade dispensacao);

	public boolean atualizarDispensaMedicamentoUnidade(DispensaMedicamentoUnidade dispensacao);
	
	public List<DispensaMedicamentoUnidade> listarTodasAsDispensacoes();

	
}//fim da classe
