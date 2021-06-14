package lez17.HibernateOneToOne.models.crud;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import lez17.HibernateOneToOne.db.GestoreSessioni;
import lez17.HibernateOneToOne.models.Dipendente;

public class DipendenteDAO implements Dao<Dipendente> {
	

	@Override
	public void insert(Dipendente t) {
		
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
	public Dipendente findById(int id) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			Dipendente temp = sessione.get(Dipendente.class, id);
			
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
	public List<Dipendente> findAll() {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			TypedQuery<Dipendente> dipendente = sessione.createQuery("FROM Dipendente", Dipendente.class);
			List<Dipendente> elenco = dipendente.getResultList();
			
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
			
			Dipendente temp = sessione.load(Dipendente.class, id);
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
	public boolean delete(Dipendente t) {
		
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
	public boolean update(Dipendente t) {
		
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