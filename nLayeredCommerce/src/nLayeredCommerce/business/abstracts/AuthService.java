package nLayeredCommerce.business.abstracts;

import nLayeredCommerce.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user);
}
