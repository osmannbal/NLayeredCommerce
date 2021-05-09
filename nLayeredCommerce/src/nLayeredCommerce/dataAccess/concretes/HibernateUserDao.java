package nLayeredCommerce.dataAccess.concretes;

import java.util.List;

import nLayeredCommerce.dataAccess.abstracts.UserDao;
import nLayeredCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi.");
		
	}

	@Override
	public List<User> getAll() {
		System.out.println("Kullanýcýlar listelendi.");
		return null;
	}

	@Override
	public User get(int id) {
		System.out.println("Kullanýcý listelendi.");
		return null;
	}

}
