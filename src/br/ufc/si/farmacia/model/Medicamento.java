package br.ufc.si.farmacia.model;

import java.util.Date;

public class Medicamento {

	private Integer idMedicamento;
	private String nomeMedicamento;
	private Integer prateleiraMedicamento;
	private String apresentacaoMedicamento;
	private Integer qtdUnidadesPorCaixa;
	private Integer qtdCaixas;
	private Integer totalUnidadesDisponiveis;
	private String loteMedicamento;
	private Date validadeMedicamento;
	private String notaFiscalMedicamento;
	private String tipoAtencaoMedicamento;
	private String tipoMedicamento;
	private double valorMedicamento;
	private boolean jaDispensado;

	public boolean isJaDispensado() {
		return jaDispensado;
	}

	public void setJaDispensado(boolean jaDispensado) {
		this.jaDispensado = jaDispensado;
	}

	public double getValorMedicamento() {
		return valorMedicamento;
	}

	public void setValorMedicamento(double valorMedicamento) {
		this.valorMedicamento = valorMedicamento;
	}

	public Medicamento() {

	}

		
	public Medicamento(Integer idMedicamento, String nomeMedicamento,
			Integer prateleiraMedicamento, String apresentacaoMedicamento,
			Integer qtdUnidadesPorCaixa, Integer qtdCaixas,
			Integer totalUnidadesDisponiveis, String loteMedicamento,
			Date validadeMedicamento, String notaFiscalMedicamento,
			String tipoAtencaoMedicamento, String tipoMedicamento,
			double valorMedicamento, boolean jaDispensado) {
		super();
		this.idMedicamento = idMedicamento;
		this.nomeMedicamento = nomeMedicamento;
		this.prateleiraMedicamento = prateleiraMedicamento;
		this.apresentacaoMedicamento = apresentacaoMedicamento;
		this.qtdUnidadesPorCaixa = qtdUnidadesPorCaixa;
		this.qtdCaixas = qtdCaixas;
		this.totalUnidadesDisponiveis = totalUnidadesDisponiveis;
		this.loteMedicamento = loteMedicamento;
		this.validadeMedicamento = validadeMedicamento;
		this.notaFiscalMedicamento = notaFiscalMedicamento;
		this.tipoAtencaoMedicamento = tipoAtencaoMedicamento;
		this.tipoMedicamento = tipoMedicamento;
		this.valorMedicamento = valorMedicamento;
		this.jaDispensado = jaDispensado;
	}

	public Integer getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public Integer getPrateleiraMedicamento() {
		return prateleiraMedicamento;
	}

	public void setPrateleiraMedicamento(Integer prateleiraMedicamento) {
		this.prateleiraMedicamento = prateleiraMedicamento;
	}

	public String getApresentacaoMedicamento() {
		return apresentacaoMedicamento;
	}

	public void setApresentacaoMedicamento(String apresentacaoMedicamento) {
		this.apresentacaoMedicamento = apresentacaoMedicamento;
	}

	public Integer getQtdUnidadesPorCaixa() {
		return qtdUnidadesPorCaixa;
	}

	public void setQtdUnidadesPorCaixa(Integer qtdUnidadesPorCaixa) {
		this.qtdUnidadesPorCaixa = qtdUnidadesPorCaixa;
	}

	public Integer getQtdCaixas() {
		return qtdCaixas;
	}

	public void setQtdCaixas(Integer qtdCaixas) {
		this.qtdCaixas = qtdCaixas;
	}

	public Integer getTotalUnidadesDisponiveis() {
		return totalUnidadesDisponiveis;
	}

	public void setTotalUnidadesDisponiveis(Integer totalUnidadesDisponiveis) {
		this.totalUnidadesDisponiveis = totalUnidadesDisponiveis;
	}

	public String getLoteMedicamento() {
		return loteMedicamento;
	}

	public void setLoteMedicamento(String loteMedicamento) {
		this.loteMedicamento = loteMedicamento;
	}

	public Date getValidadeMedicamento() {
		return validadeMedicamento;
	}

	public void setValidadeMedicamento(Date validadeMedicamento) {
		this.validadeMedicamento = validadeMedicamento;
	}

	public String getNotaFiscalMedicamento() {
		return notaFiscalMedicamento;
	}

	public void setNotaFiscalMedicamento(String notaFiscalMedicamento) {
		this.notaFiscalMedicamento = notaFiscalMedicamento;
	}

	public String getTipoAtencaoMedicamento() {
		return tipoAtencaoMedicamento;
	}

	public void setTipoAtencaoMedicamento(String tipoAtencaoMedicamento) {
		this.tipoAtencaoMedicamento = tipoAtencaoMedicamento;
	}

	public String getTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(String tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}

}
