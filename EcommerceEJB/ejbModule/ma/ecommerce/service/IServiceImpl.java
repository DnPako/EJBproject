package ma.ecommerce.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ma.ecommerce.dao.IDao;
import ma.ecommerce.entities.Client;

@Stateless(name="EC")
public class IServiceImpl implements IService {

	@EJB
	private IDao articleDao;

	@Override
	public Client createClient(Client client) {
		return articleDao.createClient(client);
	}

	@Override
	public Client updateClient(Client client) {
		return articleDao.updateClient(client);
	}

	@Override
	public void removeClient(String login) {

		articleDao.removeClient(login);
	}

	@Override
	public Collection<Client> findAll() {
		return articleDao.findAll();
	}

	@Override
	public Client findByLogin(String login) {
		return articleDao.findByLogin(login);
	}

}
