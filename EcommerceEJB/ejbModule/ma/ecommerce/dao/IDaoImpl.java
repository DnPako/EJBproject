package ma.ecommerce.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.ecommerce.entities.Client;

@Stateless
public class IDaoImpl implements IDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Client createClient(Client client) {
		this.manager.persist(client);
		return client;
	}

	@Override
	public Client updateClient(Client client) {
		return this.manager.merge(client);
	}

	@Override
	public void removeClient(String login) {
		this.manager.remove(this.manager.getReference(Client.class, login));
	}

	@SuppressWarnings("unchecked")
	public Collection<Client> findAll() {
		Query query = this.manager.createQuery("SELECT c FROM Client c");
		return query.getResultList();
	}

	@Override
	public Client findByLogin(String login) {
		return (Client) this.manager.find(Client.class, login);
	}

}
