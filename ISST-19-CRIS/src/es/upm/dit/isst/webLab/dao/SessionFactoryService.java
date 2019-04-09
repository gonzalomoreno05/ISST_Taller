package es.upm.dit.isst.webLab.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryService {
	
	private static SessionFactory sessionFactory;
	private static SessionFactoryService sfs;
	private SessionFactoryService() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	@SuppressWarnings("static-access")
	public static SessionFactory get() {
		if( null == sfs ) sfs = new SessionFactoryService();
		return sfs.sessionFactory;
	}
}
