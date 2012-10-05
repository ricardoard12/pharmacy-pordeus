package br.ufc.si.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Medicamento;
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
		
		boolean existe = verificaInsercaoPaciente(paciente); 	
				
		if(existe==false){
			this.paciente = paciente;
		
			IPacienteDAO dao = new PacienteDAO();
			dao.inserirPaciente(this.paciente);
			return "imprimir";
		}
		
		return "erro";
		
	}

	
	private boolean verificaInsercaoPaciente(Paciente paciente2) {
		IPacienteDAO dao = new PacienteDAO();
				
		boolean verifica = dao.pacientePorRg(paciente2.getRg());
		
		if (verifica == true)
			return true;
		
		
		return false;
	}			
	
	
	public PacienteBean() {
		this.setPaciente(new Paciente());
		
	}

	public PacienteBean(Paciente paciente) {
		super();
		this.paciente = paciente;
		
	}
		
	public String excluirPaciente(){
		lista.remove(paciente);
		paciente = new Paciente();
		return "";
	}
}
