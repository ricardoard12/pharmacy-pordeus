package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.DispensaMedicamentoPaciente;

public interface IDispensaMedicamentoPacienteDAO {

	public void inserirDispensaMedicamentoPaciente(DispensaMedicamentoPaciente novaDispensacao);

	public boolean removerDispensaMedicamentoPaciente(DispensaMedicamentoPaciente dispensacao);

	public boolean atualizarDispensaMedicamentoPaciente(DispensaMedicamentoPaciente dispensacao);
	
	public List<DispensaMedicamentoPaciente> listarTodasAsDispensacoes();
	
}//fim da classe
