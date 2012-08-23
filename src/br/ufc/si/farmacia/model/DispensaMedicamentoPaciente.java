package br.ufc.si.farmacia.model;

import java.util.Date;

public class DispensaMedicamentoPaciente {
 private int id;
 private String crm_medico;
 private String tipo_medicamento;
 private String tipo_saida;
 private int quant_saida;
 private Date data_dispensa;
 private Date data_retorno;
 private Paciente paciente;
 private Medicamento medicamento;
 
 
 

public Medicamento getMedicamento() {
	return medicamento;
}
public void setMedicamento(Medicamento medicamento) {
	this.medicamento = medicamento;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCrm_medico() {
	return crm_medico;
}
public void setCrm_medico(String crm_medico) {
	this.crm_medico = crm_medico;
}
public String getTipo_medicamento() {
	return tipo_medicamento;
}
public void setTipo_medicamento(String tipo_medicamento) {
	this.tipo_medicamento = tipo_medicamento;
}
public String getTipo_saida() {
	return tipo_saida;
}
public void setTipo_saida(String tipo_saida) {
	this.tipo_saida = tipo_saida;
}
public int getQuant_saida() {
	return quant_saida;
}
public void setQuant_saida(int quant_saida) {
	this.quant_saida = quant_saida;
}
public Date getData_dispensa() {
	return data_dispensa;
}
public void setData_dispensa(Date data_dispensa) {
	this.data_dispensa = data_dispensa;
}
public Date getData_retorno() {
	return data_retorno;
}
public void setData_retorno(Date data_retorno) {
	this.data_retorno = data_retorno;
}
public Paciente getPaciente() {
	return paciente;
}
public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}


//construtores da classe


public DispensaMedicamentoPaciente() {
	super();
}
public DispensaMedicamentoPaciente(int id, String crm_medico,
		String tipo_medicamento, String tipo_saida, int quant_saida,
		Date data_dispensa, Date data_retorno, Paciente paciente,
		Medicamento medicamento) {
	super();
	this.id = id;
	this.crm_medico = crm_medico;
	this.tipo_medicamento = tipo_medicamento;
	this.tipo_saida = tipo_saida;
	this.quant_saida = quant_saida;
	this.data_dispensa = data_dispensa;
	this.data_retorno = data_retorno;
	this.paciente = paciente;
	this.medicamento = medicamento;
}

 

 
}//fim da classe dispensa Paciente
