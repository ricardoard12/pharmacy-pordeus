package br.ufc.si.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.Session;

import br.ufc.si.farmacia.dao.UnidadeDAO;
import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.model.Unidade;

public class UnidadeBean {

	private Unidade unidade = new Unidade();
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

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
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

	public String remover() {
		unidadeDao.removerUnidade(unidade, id);
		return "removido";
	}

}
