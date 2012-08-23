package br.ufc.si.farmacia.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IUnidadeDAO;
import br.ufc.si.farmacia.model.Unidade;

public class UnidadeDAO implements IUnidadeDAO {

	
	public void salvarUnidade(Unidade unidade) {
		Session session = HibernateUtil.getSession();
		Transaction txt = session.beginTransaction();
		try {

			session.save(unidade);
			txt.commit();

		} catch (Exception e) {
			txt.rollback();
		}

		finally {
			session.close();
		}

	}// fim do método salvar

	
	public boolean atualizarUnidade(Unidade unidade) {
		Session session = HibernateUtil.getSession();
		Transaction txt = session.beginTransaction();

		try {
			session.update(unidade);
			txt.commit();
			return true;

		} catch (Exception e) {
			txt.rollback();
		}

		finally {
			session.close();
		}
		return false;
	}// fim do método atualizar

	
	public boolean removerUnidade(Unidade unidade) {
		Session session = HibernateUtil.getSession();
		Transaction txt = session.beginTransaction();
		try {
			session.delete(unidade);
			txt.commit();

			return true;

		} catch (Exception e) {
			txt.rollback();
		}

		finally {
			session.close();
		}

		return false;
	}// fim do método remover


	public List<Unidade> listaTodos() {
		Session session = HibernateUtil.getSession();
		try {
			Criteria criteria = session.createCriteria(Unidade.class);
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}// fim da classe unidadeDAO
