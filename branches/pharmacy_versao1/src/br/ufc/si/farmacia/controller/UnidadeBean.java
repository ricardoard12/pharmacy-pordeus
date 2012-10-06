package br.ufc.si.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.UnidadeDAO;
import br.ufc.si.farmacia.interfaces.IUnidadeDAO;
import br.ufc.si.farmacia.model.Unidade;

public class UnidadeBean {
	private Unidade uni = new Unidade();
	private IUnidadeDAO iunidade = new UnidadeDAO();
	private List<Unidade> unidades;

	public UnidadeBean() {
		
		unidades = new ArrayList<Unidade>();
		
	}
	
	public String listarUnidades(){
		unidades = iunidade.listaTodos();
		return "ListarUnidades";
	}

	
	public String Cadastrar() {
		List<Unidade> lista = iunidade.listaTodos();

		for (Unidade unidade : lista) {
			if (unidade.getNome().equals(uni.getNome()))
				return "falha";// tem alguem com o mesmo nome
		}
		iunidade.salvarUnidade(uni);
		uni = new Unidade();
		return "Sucesso";
	}

	public String remover() {
		iunidade.removerUnidade(uni);
		unidades = iunidade.listaTodos();
		return "removido";
	}
	
	
	public String atualizarUnidade(){
		iunidade.atualizarUnidade(this.uni);
		return "";
	}
	
	public String atualizar(){
		return "atualizarUnidade";
	}

	public Unidade getUni() {
		return uni;
	}

	public void setUni(Unidade uni) {
		this.uni = uni;
	}

	public IUnidadeDAO getIunidade() {
		return iunidade;
	}

	public void setIunidade(IUnidadeDAO iunidade) {
		this.iunidade = iunidade;
	}

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

}
