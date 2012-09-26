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
	}

	public List<Medicamento> ListarTodosRemedios() {
		Session session = HibernateUtil.getSession();
		try {
			Criteria criteria = session.createCriteria(Medicamento.class);
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Medicamento> ListarMedicamentosAindaEmEstoque() {
		Session session = HibernateUtil.getSession();
		try {
			Query query = session
					.createQuery("from Medicamento med where med.totalUnidadesDisponiveis > :qtd");
			query.setInteger("qtd", 0);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Medicamento> ListarMedicamentosDispensados() {
		Session session = HibernateUtil.getSession();
		try {
			Criteria c = session.createCriteria(Medicamento.class);
			c.add(Restrictions.eq("jaDispensado", true));
			return c.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
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

	public List<Medicamento> ListarMedicamentoPorNotaFiscal(String notaFiscal) {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);
		try {
			criteria.add(Restrictions.eq("notaFiscalMedicamento", notaFiscal));
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Medicamento> BuscarMedicamentoPorNome(String nome) {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);
		try {
			criteria.add(Restrictions.like("nomeMedicamento", "%" + nome + "%"));
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Medicamento> BuscarMedicamentoPorLote(String lote) {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);

		try {
			criteria.add(Restrictions.like("loteMedicamento", "%" + lote + "%"));
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Medicamento> BuscarMedicamentoPorNotaFiscal(String notaFiscal) {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(Medicamento.class);
		try {
			criteria.add(Restrictions.like("notaFiscalMedicamento", "%"
					+ notaFiscal + "%"));
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}
