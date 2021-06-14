package lez17.HibernateOneToOne;

import java.util.List;

import org.hibernate.Session;

import lez17.HibernateOneToOne.db.GestoreSessioni;
import lez17.HibernateOneToOne.models.Dipendente;
import lez17.HibernateOneToOne.models.Indirizzo;
import lez17.HibernateOneToOne.models.crud.DipendenteDAO;
import lez17.HibernateOneToOne.models.crud.IndirizzoDAO;

public class App {
    public static void main( String[] args ) {
    	
    	
    	//---------------------------- Senza DAO ----------------------------//
    	
//    	Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
//    	
//    	Indirizzo ind = new Indirizzo("Via Felice Paradiso", "Acireale", "Catania");
//    	Dipendente dipUno = new Dipendente("DP0001", "Francesco Rapisarda");
//    	dipUno.setIndirizzo(ind);
//    	
//    	try {
//    		
//    		sessione.beginTransaction();
//    		
//    		sessione.save(ind);
//    		sessione.save(dipUno);
//    		
//    		sessione.getTransaction().commit();
//			
//		} catch (Exception e) {
//			
//			System.out.println(e.getMessage());
//		
//		} finally {
//			
//			sessione.close();
//		
//		}
    	
    	
    	//------------------------------ Con DAO ---------------------------------//
    	
    	DipendenteDAO dipDao = new DipendenteDAO();
    	IndirizzoDAO indDao = new IndirizzoDAO();
    	
    	Indirizzo indUno = indDao.findById(2);
    	Dipendente dipUno = dipDao.findById(2);
    	dipUno.setIndirizzo(indUno);
    	
    	
    	
    /**
     * INSERT
     */
//    Dipendente giovanni = new Dipendente("DP0001", "Giovanni Pace");
//    Dipendente davide = new Dipendente("DP0002", "Davide Rapisarda");
//    Dipendente federico = new Dipendente("DP0003", "Federico Barbagallo");
//    
//    dipDao.insert(giovanni);
//    dipDao.insert(davide);
//    dipDao.insert(federico);
//   
//    
//    Indirizzo indUno = new Indirizzo("Via Torquato Tasso", "Roma", "Roma");
//    Indirizzo indDue = new Indirizzo("Via Alessandro Manzoni", "Acireale", "Catania");
//    Indirizzo indTre = new Indirizzo("Via dei Re", "Riposto", "Messina");
//    
//    indDao.insert(indUno);
//    indDao.insert(indDue);
//    indDao.insert(indTre);
  
    
    
    /**
     * FINDBYID
     */
//    Dipendente ricercatoUno = dipDao.findById(1);
//    System.out.println(ricercatoUno);
//    
//    Dipendente ricercatoDue = dipDao.findById(2);
//    System.out.println(ricercatoDue);
//    
//    Dipendente ricercatoTre = dipDao.findById(3);
//    System.out.println(ricercatoTre);
    	
    
//    Indirizzo ricercaIndirizzoUno = indDao.findById(1);
//    System.out.println(ricercaIndirizzoUno);
//    Indirizzo ricercaIndirizzoDue = indDao.findById(2);
//    System.out.println(ricercaIndirizzoDue);
//    Indirizzo ricercaIndirizzoTre = indDao.findById(3);
//    System.out.println(ricercaIndirizzoTre);
    
    
    
    /**
     * FINDALL
     */
//    List<Dipendente> ricercaAllDipendente = dipDao.findAll();
//    for(int i = 0; i < ricercaAllDipendente.size(); i++) {
//    	Dipendente temp = ricercaAllDipendente.get(i);
//    	System.out.println(temp);
//    }
//    
//    
//    List<Indirizzo> ricercaAllIndirizzo = indDao.findAll();
//    for(int i = 0; i < ricercaAllIndirizzo.size(); i++) {
//    	Indirizzo temp = ricercaAllIndirizzo.get(i);
//    	System.out.println(temp);
//    }
    
    
    
    /**
     * DELETEID
     */
//    if(dipDao.delete(1)) {
//    	System.out.println("Eliminazione del dipendente effettuata con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }
//    
//    
//    if(indDao.delete(1)) {
//    	System.out.println("Eliminazione dell'indirizzo effettuata con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }
    
    
    
    /**
     * DELETEOGGETTO
     */
//    if(dipDao.delete(2)) {
//    	System.out.println("Eliminazione del dipendente effettuata con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }
//    
//    
//    if(indDao.delete(2)) {
//    	System.out.println("Eliminazione dell'indirizzo effettuata con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }  

    
    	
    /**
     * UPDATE
     */
//    Dipendente updateDipendente = dipDao.findById(3);
//    updateDipendente.setCodice("DP0002");
//    updateDipendente.setNominativo("Davide Rapisarda");
//    
//    if(dipDao.update(updateDipendente)) {
//    	System.out.println("Aggiornamento DIPENDENTE eseguito con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }    	
    
    
//    Indirizzo updateIndirizzo = indDao.findById(2);
//    updateIndirizzo.setVia("Via Enrico Fermi");
//    updateIndirizzo.setCitta("Catania");
//    updateIndirizzo.setProvincia("CT");
//    
//    if(indDao.update(updateIndirizzo)) {
//    	System.out.println("Aggiornamento INDIRIZZO eseguito con successo!");
//    } else {
//    	System.out.println("Errore!");
//    }
    
  }
}
