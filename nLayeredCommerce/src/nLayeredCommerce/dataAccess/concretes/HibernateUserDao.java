package nLayeredCommerce.dataAccess.concretes;

import java.util.List;

import nLayeredCommerce.dataAccess.abstracts.UserDao;
import nLayeredCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi.");
		
	}

	@Override
	public List<User> getAll() {
		System.out.println("Kullanıcılar listelendi.");
		return null;
	}

	@Override
	public User get(int id) {
		System.out.println("Kullanıcı listelendi.");
		return null;
	}

}
