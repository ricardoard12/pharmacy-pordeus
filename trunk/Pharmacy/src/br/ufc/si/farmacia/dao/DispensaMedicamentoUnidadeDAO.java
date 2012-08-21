package br.ufc.si.farmacia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IDispensaMedicamentoUnidadeDAO;
import br.ufc.si.farmacia.model.DispensaMedicamentoUnidade;

public class DispensaMedicamentoUnidadeDAO implements
		IDispensaMedicamentoUnidadeDAO {


	public void inserirDispensaMedicamentoUnidade(
			DispensaMedicamentoUnidade dispensacao) {

		Session sessao = HibernateUtil.getSession();
		Transaction transaction = sessao.beginTransaction();

		try {
			sessao.save(dispensacao);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			sessao.close();
		}

	}


	public boolean removerDispensaMedicamentoUnidade(
			DispensaMedicamentoUnidade dispensacao) {

		Session sessao = HibernateUtil.getSession();
		Transaction transaction = sessao.beginTransaction();

		try {

			sessao.delete(dispensacao);
			transaction.commit();

			return true;

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			sessao.close();
		}

		return false;
	}


	public boolean atualizarDispensaMedicamentoUnidade(
			DispensaMedicamentoUnidade dispensacao) {

		Session sessao = HibernateUtil.getSession();
		Transaction transaction = sessao.beginTransaction();

		try {
			sessao.update(dispensacao);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			sessao.close();
		}

		return false;
	}


	public List<DispensaMedicamentoUnidade> listarTodasAsDispensacoes() {

		Session sessao = HibernateUtil.getSession();
		Transaction transaction = sessao.beginTransaction();

		try {

			Query query = sessao.createQuery("from DispensaMedicamentoUnidade");
			return (List<DispensaMedicamentoUnidade>) query.list();

		} catch (Exception e) {

		} finally {
			transaction.commit();
			sessao.close();
		}

		return null;
	}

}
