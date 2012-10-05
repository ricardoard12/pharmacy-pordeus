package br.ufc.si.farmacia.controller;

import java.util.ArrayList;

import javax.faces.event.ActionEvent;

import java.util.List;
import br.ufc.si.farmacia.dao.MedicamentoDAO;
import br.ufc.si.farmacia.interfaces.IMedicamentoDAO;
import br.ufc.si.farmacia.model.Medicamento;

public class MedicamentoBean {

	String parametro = new String();
	String tipo_busca = new String();

	List<Medicamento> lista = new ArrayList<Medicamento>();
	IMedicamentoDAO imed = new MedicamentoDAO();

	public void EfetuaBusca(ActionEvent e) {
		if (tipo_busca.equals("codigo")) {
			this.lista.add(imed.RemedioPorId(Integer.parseInt(parametro)));
		} else if (tipo_busca.equals("nome")) {
			this.lista = imed.BuscarMedicamentoPorNome(parametro);
		} else if (tipo_busca.equals("lote")) {
			this.lista = imed.BuscarMedicamentoPorLote(parametro);
		} else if (tipo_busca.equals("nota")) {
			this.lista = imed.BuscarMedicamentoPorNotaFiscal(parametro);
		} else if (tipo_busca.equals("todos")) {
			this.lista = imed.ListarTodosRemedios();
		}

	}

	public Medicamento verificaInsercaoMedicamento(Medicamento origem) {
		Medicamento destino = new Medicamento();

		destino.setIdMedicamento(origem.getIdMedicamento());
		destino.setNomeMedicamento(origem.getNomeMedicamento());
		destino.setPrateleiraMedicamento(origem.getPrateleiraMedicamento());
		destino.setApresentacaoMedicamento(origem.getApresentacaoMedicamento());
		destino.setQtdUnidadesPorCaixa(origem.getQtdUnidadesPorCaixa());
		destino.setQtdCaixas(origem.getQtdCaixas());
		destino.setTotalUnidadesDisponiveis(origem.getQtdUnidadesPorCaixa()
				* origem.getQtdCaixas());
		destino.setLoteMedicamento(origem.getLoteMedicamento());
		destino.setValidadeMedicamento(origem.getValidadeMedicamento());
		destino.setNotaFiscalMedicamento(origem.getNotaFiscalMedicamento());
		destino.setTipoAtencaoMedicamento(origem.getTipoAtencaoMedicamento());
		destino.setTipoMedicamento(origem.getTipoMedicamento());
		destino.setValorMedicamento(origem.getValorMedicamento());
		destino.setJaDispensado(false);

		return destino;
	}

	public String inserirMedicamento() {

		this.medicamento = verificaInsercaoMedicamento(medicamento);

		IMedicamentoDAO imedic = new MedicamentoDAO();
		imedic.InserirRemedio(this.medicamento);

		return "imprimir";
	}

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

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getTipo_busca() {
		return tipo_busca;
	}

	public void setTipo_busca(String tipo_busca) {
		this.tipo_busca = tipo_busca;
	}

	public List<Medicamento> getLista() {
		return lista;
	}

	public void setLista(List<Medicamento> lista) {
		this.lista = lista;
	}

	public IMedicamentoDAO getImed() {
		return imed;
	}

	public void setImed(IMedicamentoDAO imed) {
		this.imed = imed;
	}

	public String excluirMedicamento(){
		lista.remove(medicamento);
		medicamento = new Medicamento();
		return "";
	}
}
