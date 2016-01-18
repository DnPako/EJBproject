package ma.ecommerce.service;

import java.util.Collection;

import javax.ejb.Remote;

import ma.ecommerce.entities.Client;

@Remote
public interface IService {
	Client createClient(Client client);

	Client updateClient(Client client);

	void removeClient(String login);

	Collection<Client> findAll();

	Client findByLogin(String login);

}
