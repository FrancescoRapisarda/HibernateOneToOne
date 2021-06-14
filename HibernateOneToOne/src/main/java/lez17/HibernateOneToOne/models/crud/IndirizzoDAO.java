package lez17.HibernateOneToOne.models.crud;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import lez17.HibernateOneToOne.db.GestoreSessioni;
import lez17.HibernateOneToOne.models.Indirizzo;

public class IndirizzoDAO implements Dao<Indirizzo> {

	@Override
	public void insert(Indirizzo t) {
		
Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			sessione.save(t);
			
			sessione.getTransaction().commit();
			
			System.out.println(t.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
	}

	
	
	@Override
	public Indirizzo findById(int id) {
		
Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			Indirizzo temp = sessione.get(Indirizzo.class, id);
			
			sessione.getTransaction().commit();
			
			return temp;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return null;
		
	}

	
	
	@Override
	public List<Indirizzo> findAll() {
		
Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			TypedQuery<Indirizzo> indirizzo = sessione.createQuery("FROM Indirizzo", Indirizzo.class);
			List<Indirizzo> elenco = indirizzo.getResultList();
			
			sessione.getTransaction().commit();
			
			return elenco;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return null;
		
	}

	
	
	@Override
	public boolean delete(int id) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {

			sessione.beginTransaction();
			
			Indirizzo temp = sessione.load(Indirizzo.class, id);
			sessione.delete(temp);
			
			
			sessione.getTransaction().commit();

			return true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
		
	}

	
	
	@Override
	public boolean delete(Indirizzo t) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			sessione.delete(t);
			
			sessione.getTransaction().commit();
			
			return true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
		
	}

	
	
	@Override
	public boolean update(Indirizzo t) {
		
	Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			
			sessione.update(t);
			
			sessione.getTransaction().commit();
			
			return false;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
		
	}

}