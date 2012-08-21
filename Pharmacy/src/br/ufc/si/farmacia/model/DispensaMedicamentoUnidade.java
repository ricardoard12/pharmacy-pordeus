package br.ufc.si.farmacia.model;

import java.util.Date;

public class DispensaMedicamentoUnidade {

	private int id;
	private String tipoMedicamento;
	private String tipoSaida;
	private int qtdSaida;
	private Date dataDispensa;
	private Medicamento medicamento;
	private Unidade unidade;
	
	
	//construtores
	
	public DispensaMedicamentoUnidade() {
		
	}


	



	public DispensaMedicamentoUnidade(int id, String tipoMedicamento,
			String tipoSaida, int qtdSaida, Date dataDispensa,
			Medicamento medicamento, Unidade unidade) {
		super();
		this.id = id;
		this.tipoMedicamento = tipoMedicamento;
		this.tipoSaida = tipoSaida;
		this.qtdSaida = qtdSaida;
		this.dataDispensa = dataDispensa;
		this.medicamento = medicamento;
		this.unidade = unidade;
	}




//métodos get e set

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoMedicamento() {
		return tipoMedicamento;
	}


	public void setTipoMedicamento(String tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}


	public String getTipoSaida() {
		return tipoSaida;
	}


	public void setTipoSaida(String tipoSaida) {
		this.tipoSaida = tipoSaida;
	}


	public int getQtdSaida() {
		return qtdSaida;
	}


	public void setQtdSaida(int qtdSaida) {
		this.qtdSaida = qtdSaida;
	}


	public Date getDataDispensa() {
		return dataDispensa;
	}


	public void setDataDispensa(Date dataDispensa) {
		this.dataDispensa = dataDispensa;
	}



	public Medicamento getMedicamento() {
		return medicamento;
	}





	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}





	public Unidade getUnidade() {
		return unidade;
	}


	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
		
	
	
}
