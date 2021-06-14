package lez17.HibernateOneToOne.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="indirizzo")
public class Indirizzo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_indirizzo")
	private int id;
	
	@Column	
	private String via;
	@Column
	private String citta;
	@Column
	private String provincia;
	
	
	@OneToOne(mappedBy = "indirizzo")
	private Dipendente dipendente;
	
	
	
	//COSTRUTORE
	public Indirizzo() {
		
	}


	
	//COSTRUTTORE CON PARAMETRI
	public Indirizzo(String via, String citta, String provincia) {
		super();
		this.via = via;
		this.citta = citta;
		this.provincia = provincia;
	}
	
	
	
	//GETTERS END SETTERS
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
	}


	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Dipendente getDipendente() {
		return dipendente;
	}


	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}



	//TO STRING
	@Override
	public String toString() {
		return "Indirizzo [id=" + id + ", via=" + via + ", citta=" + citta + ", provincia=" + provincia + "]";
	}
	
}