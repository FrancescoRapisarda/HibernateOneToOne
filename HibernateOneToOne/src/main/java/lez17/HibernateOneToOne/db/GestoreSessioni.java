package lez17.HibernateOneToOne.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lez17.HibernateOneToOne.models.Dipendente;
import lez17.HibernateOneToOne.models.Indirizzo;

public class GestoreSessioni {
	
	private static GestoreSessioni ogg_gestore;
	private SessionFactory factory;

	public static GestoreSessioni getIstanza() {
		if(ogg_gestore == null) {
			ogg_gestore = new GestoreSessioni();
		}
		
		return ogg_gestore;
	}
	
	public SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration().configure("lez17/HibernateOneToOne/resources/hibernate_dipendenti.cfg.xml")
					.addAnnotatedClass(Dipendente.class)
					.addAnnotatedClass(Indirizzo.class)
					.buildSessionFactory();
		}
		
		return factory;
	}

}
