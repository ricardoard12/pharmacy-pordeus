package br.ufc.si.farmacia.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IMedicamentoDAO;
import br.ufc.si.farmacia.model.Medicamento;

public class MedicamentoDAO implements IMedicamentoDAO {

	
	public void InserirRemedio(Medicamento remedio) {
		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();
		try {
			sessao.save(remedio);
			txt.commit();
		} catch (Exception e) {
			txt.rollback();
		} finally {
			sessao.close();
		}
	}// fim do método salvar

	
	public boolean AtualizarRemedio(Medicamento remedio) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {
			sessao.update(remedio);
			trasaction.commit();
			return true;
		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}

		return false;
	}// fim do método

	
	public boolean DeletarRemedio(Medicamento medicamento) {
		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();

		if (medicamento.isJaDispensado() == false) {
			try {
				sessao.delete(medicamento);
				txt.commit();
				return true;
			} catch (Exception e) {
				txt.rollback();
			} finally {
				sessao.close();
			}
		}
		return false;
	}// fim do método

	
	public Medicamento RemedioPorId(Integer id) {
		Medicamento remedioAuxiliar;
		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();

		try {
			remedioAuxiliar = (Medicamento) sessao.get(Medicamento.class, id);
			txt.commit();
			return remedioAuxiliar;
		} catch (Exception e) {
			txt.rollback();
		} finally {
			sessao.close();
		}

		return null;
	}// fim do método

	
	public List<Medicamento> ListarTodosRemedios() {

		Session sessao = HibernateUtil.getSession();
		try {

			Query query = sessao.createQuery("from Remedio");
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();
		}
		return null;
	}// fim do método

	
	public List<Medicamento> ListarMedicamentosAindaEmEstoque() {

		Session sessao = HibernateUtil.getSession();

		try {

			Query query = sessao
					.createQuery("from Medicamento med where med.totalUnidadesDisponiveis > :qtd");
			query.setInteger("qtd", 0);
			return query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();

		}

		return null;

	}

	
	public List<Medicamento> ListarMedicamentosDispensados() {

		Session sessao = HibernateUtil.getSession();

		try {

			// List<Medicamento> lista;

			Criteria c = sessao.createCriteria(Medicamento.class);
			c.add(Restrictions.eq("jaDispensado", true));

			return (List<Medicamento>) c.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessao.close();

		}

		return null;

	}

	public List<Medicamento> ListarMedicamentosQueVenceraoNoMes() {
		
		Date date = new Date();
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		List<Medicamento> medicamentoAux;

		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);
		
		
		medicamentoAux = criteria.list();
		for (Medicamento r : medicamentoAux) {
			int aux = r.getValidadeMedicamento().getMonth();
			int aux2 = r.getValidadeMedicamento().getYear();
			if (aux == date.getMonth() && aux2 == date.getYear()) {
				medicamentos.add(r);
			}
		}
		session.close();

		return medicamentos;
	}

	public List<Medicamento> ListarMedicamentosVencidos() {
		
		Date date = new Date();
		List<Medicamento> medicamentoAux;
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);
		
		medicamentoAux = criteria.list();
		for (Medicamento r : medicamentoAux) {
			if (r.getValidadeMedicamento().before(date)) {
				medicamentos.add(r);
			}
		}

		return medicamentos;
	}

}// fim da classe
