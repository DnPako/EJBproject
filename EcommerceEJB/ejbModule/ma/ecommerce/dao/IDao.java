package ma.ecommerce.dao;

import java.util.Collection;

import javax.ejb.Remote;

import ma.ecommerce.entities.Client;

@Remote
public interface IDao {
	
	Client createClient(Client client);

	Client updateClient(Client client);

	void removeClient(String login);

	Collection<Client> findAll();

	Client findByLogin(String login);

}
