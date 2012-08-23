package br.ufc.si.farmacia.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	static {
		Configuration configuration = new AnnotationConfiguration();
		configuration.configure();

		factory = configuration.buildSessionFactory();

	}// fim do m�todo

	public static Session getSession() {
		return factory.openSession();
	}

}// fim da classe hibernate util
