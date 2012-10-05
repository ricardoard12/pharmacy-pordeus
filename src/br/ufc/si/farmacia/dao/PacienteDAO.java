package br.ufc.si.farmacia.dao; 

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Medicamento;
import br.ufc.si.farmacia.model.Paciente;

public class PacienteDAO implements IPacienteDAO {

	
	public void inserirPaciente(Paciente paciente) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {
			sessao.save(paciente);
			trasaction.commit();
		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}
	}// fim do m�todo inserir paciente

	
	public boolean removerPaciente(Paciente paciente) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {
			sessao.delete(paciente);
			trasaction.commit();

			return true;
		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}
		return false;
	}// fim do m�todo remover paciente

	
	public boolean atualizarPaciente(Paciente paciente) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {
			sessao.update(paciente);
			trasaction.commit();

			return true;

		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}

		return false;
	}// fim do m�todo atualizar paciente

	
	public Paciente pacientePorId(int id) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {

			return (Paciente) sessao.get(Paciente.class, id);

		} catch (Exception e) {

		} finally {
			trasaction.commit();
			sessao.close();
		}

		return null;
	}// fim do m�todo buscar por id

	
	public List<Paciente> listaTodosPacientes() {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {

			Query query = sessao.createQuery("from Paciente");
			return (List<Paciente>) query.list();

		} catch (Exception e) {

		} finally {
			trasaction.commit();
			sessao.close();
		}

		return null;
	}// fim do m�todo listar todos os pacientes


	public boolean pacientePorRg(Long long1) {
		Paciente paciente = new Paciente();
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();
		
		try {
	
			Criteria c = sessao.createCriteria(Paciente.class);
			c.add(Restrictions.eq("rg_paciente", long1));
			return true;
			
		} catch (Exception e) {

		} finally {
			trasaction.commit();
			sessao.close();
		}

		return false;
	}// fim do m�todo buscar por id
	
	
	
}// fim da classe pacienteDAO
