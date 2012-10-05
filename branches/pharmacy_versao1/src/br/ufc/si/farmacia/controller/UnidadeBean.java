package br.ufc.si.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.hibernate.Session;

import br.ufc.si.farmacia.dao.UnidadeDAO;
import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IUnidadeDAO;
import br.ufc.si.farmacia.model.Unidade;

public class UnidadeBean {
	Unidade uni = new Unidade();
	IUnidadeDAO iunidade = new UnidadeDAO();

	private List<SelectItem> unidades;
	private List<Unidade> unidadez;
	int id;
	private UnidadeDAO unidadeDao = new UnidadeDAO();

	public UnidadeBean() {
		unidades = new ArrayList<SelectItem>();
		Session session = HibernateUtil.getSession();
		unidadez = unidadeDao.listaTodos();
		List<Unidade> unid = unidadeDao.listaTodos();

		for (Unidade u : unid) {
			unidades.add(new SelectItem(u.getId(), u.getNome()));
		}
		session.close();
	}
	
	public String Cadastrar() {
		List<Unidade> lista = iunidade.listaTodos();

		for (Unidade unidade : lista) {
			if (unidade.getNome().equals(uni.getNome()))
				return "falha";// tem alguem com o mesmo nome
		}

		iunidade.salvarUnidade(uni);
		return "Sucesso";
	}
	
	public void remover(ActionEvent actionEvent) {
		unidadeDao.removerUnidade(uni, id);
	}

	public List<SelectItem> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<SelectItem> unidades) {
		this.unidades = unidades;
	}

	public List<Unidade> getUnidadez() {
		return unidadez;
	}

	public void setUnidadez(List<Unidade> unidadez) {
		this.unidadez = unidadez;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UnidadeDAO getUnidadeDao() {
		return unidadeDao;
	}

	public void setUnidadeDao(UnidadeDAO unidadeDao) {
		this.unidadeDao = unidadeDao;
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

}
