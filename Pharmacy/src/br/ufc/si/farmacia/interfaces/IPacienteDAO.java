package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.Paciente;

public interface IPacienteDAO {
	
	public void inserirPaciente(Paciente paciente);

	public boolean removerPaciente(Paciente paciente);

	public boolean atualizarPaciente(Paciente paciente);
	
	public Paciente pacientePorId(int id);
	
	public List<Paciente> listaTodosPacientes();
	
}// fim da interface
