package lez17.HibernateOneToOne.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dipendente")
public class Dipendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_dipendente")
	private int id;
	
	@Column
	private String codice;
	
	@Column
	private String nominativo;
	
	
	@OneToOne
	@JoinColumn(name="indirizzo_rif", referencedColumnName = "id_indirizzo")
	private Indirizzo indirizzo;
	
	
	//COSTRUTTORE
	public Dipendente() {
		
	}


	//COSTRUTTORE CON PARAMETRI
	public Dipendente(String codice, String nominativo) {
		super();
		this.codice = codice;
		this.nominativo = nominativo;
	}
	
	
	
	//GETTERS END SETTERS
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public String getNominativo() {
		return nominativo;
	}


	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}


	public Indirizzo getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}


	
	//TO STRING
	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", codice=" + codice + ", nominativo=" + nominativo + "]";
	}	
	
}
