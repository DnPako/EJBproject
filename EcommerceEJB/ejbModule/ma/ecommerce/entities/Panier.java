package ma.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Panier
 *
 */
@Entity
public class Panier implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int identifiant;
	private int quantite;

	public Panier() {
		super();
	}
   
}
