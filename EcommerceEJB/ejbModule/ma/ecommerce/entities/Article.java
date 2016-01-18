package ma.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int identifiant;
	private String referentiel;
	@Column(unique = true)
	private String designation;
	private Double prix;

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getReferentiel() {
		return referentiel;
	}

	public void setReferentiel(String referentiel) {
		this.referentiel = referentiel;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Article() {
		super();
	}

}
