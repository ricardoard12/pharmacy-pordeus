package br.ufc.si.farmacia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IDispensaMedicamentoPacienteDAO;
import br.ufc.si.farmacia.model.DispensaMedicamentoPaciente;

public class DispensaMedicamentoPacienteDAO implements
		IDispensaMedicamentoPacienteDAO {

	public void inserirDispensaMedicamentoPaciente(
			DispensaMedicamentoPaciente novaDispensacao) {

		Session sessao = HibernateUtil.getSession();
	  	Transaction trasaction = sessao.beginTransaction();

	  	boolean teste = true;
	  	
	  	//fazendo um merge maravilhoso
	  	
		try {
			sessao.save(novaDispensacao);
			trasaction.commit();
		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}
	}

	public boolean removerDispensaMedicamentoPaciente(
			DispensaMedicamentoPaciente dispensacao) {

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

	public boolean atualizarDispensaMedicamentoPaciente(
			DispensaMedicamentoPaciente dispensacao) {

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

	public List<DispensaMedicamentoPaciente> listarTodasAsDispensacoes() {

		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {

			Query query = sessao
					.createQuery("from DispensaMedicamentoPaciente");
			return (List<DispensaMedicamentoPaciente>) query.list();

		} catch (Exception e) {

		} finally {
			trasaction.commit();
			sessao.close();
		}

		return null;
	}

}
