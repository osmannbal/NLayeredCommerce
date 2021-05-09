package nLayeredCommerce.business.concretes;

import java.util.List;

import nLayeredCommerce.business.abstracts.UserService;
import nLayeredCommerce.dataAccess.abstracts.UserDao;
import nLayeredCommerce.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public User get(int id) {
		
		return userDao.get(id);
	}
	
	
	
}
