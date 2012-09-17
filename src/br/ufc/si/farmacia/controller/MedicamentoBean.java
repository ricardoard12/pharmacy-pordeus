package br.ufc.si.farmacia.controller;


import br.ufc.si.farmacia.dao.MedicamentoDAO;
import br.ufc.si.farmacia.interfaces.IMedicamentoDAO;
import br.ufc.si.farmacia.model.Medicamento;

public class MedicamentoBean {

	private Medicamento medicamento;

	
	public MedicamentoBean() {
		this.setMedicamento(new Medicamento());
	}
	
	
	
	
	public MedicamentoBean(Medicamento medicamento) {
		super();
		this.medicamento = medicamento;
	}



	public Medicamento getMedicamento() {
		return medicamento;
	}

	
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
	public Medicamento verificaInsercaoMedicamento(Medicamento origem){
		Medicamento destino = new Medicamento();
		
		destino.setIdMedicamento(origem.getIdMedicamento());
		destino.setNomeMedicamento(origem.getNomeMedicamento());
		destino.setPrateleiraMedicamento(origem.getPrateleiraMedicamento());
		destino.setApresentacaoMedicamento(origem.getApresentacaoMedicamento());
		destino.setQtdUnidadesPorCaixa(origem.getQtdUnidadesPorCaixa());
		destino.setQtdCaixas(origem.getQtdCaixas());
		destino.setTotalUnidadesDisponiveis(origem.getQtdUnidadesPorCaixa()*origem.getQtdCaixas());
		destino.setLoteMedicamento(origem.getLoteMedicamento());
		destino.setValidadeMedicamento(origem.getValidadeMedicamento());
		destino.setNotaFiscalMedicamento(origem.getNotaFiscalMedicamento());
		destino.setTipoAtencaoMedicamento(origem.getTipoAtencaoMedicamento());
		destino.setTipoMedicamento(origem.getTipoMedicamento());
		destino.setValorMedicamento(origem.getValorMedicamento());
		destino.setJaDispensado(false);
		
		return destino;
	}
	
	public String inserirMedicamento(){
		
		this.medicamento = verificaInsercaoMedicamento(medicamento);
		
		IMedicamentoDAO imedic = new MedicamentoDAO();
		imedic.InserirRemedio(this.medicamento);
		
		return "imprimir";
	}
	
}
