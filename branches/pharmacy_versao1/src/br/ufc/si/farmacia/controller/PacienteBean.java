package br.ufc.si.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Paciente;

public class PacienteBean {

	List<Paciente> lista = new ArrayList<Paciente>();
	IPacienteDAO ipaciente = new PacienteDAO();

	private Paciente paciente;

	public List<Paciente> getLista() {
		return lista;
	}

	public void setLista(List<Paciente> lista) {
		this.lista = lista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String inserirPaciente() {

		if (ipaciente.pacientePorRg(this.paciente) == null) {

			ipaciente.inserirPaciente(this.paciente);
			return "imprimir";
		}

		return "ListarUnidades";

	}

	public PacienteBean() {
		this.setPaciente(new Paciente());

	}

	public PacienteBean(Paciente paciente) {
		super();
		this.paciente = paciente;

	}

	public String excluirPaciente() {
	if(	ipaciente.removerPaciente(paciente) == true){
		lista.remove(paciente);
		paciente = new Paciente();
	}
		return "ListarPacientes";
	}

	public String listarPacientes() {
		lista = ipaciente.listaTodosPacientes();
		return "ListarPacientes";
	}
	
	public String atualizar(){
		return "atualizarPaciente";
	}
	
	public String atualizarPaciente(){
		ipaciente.atualizarPaciente(this.paciente);
		return "";
	}
}
