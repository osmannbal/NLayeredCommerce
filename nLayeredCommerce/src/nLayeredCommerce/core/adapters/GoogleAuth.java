package nLayeredCommerce.core.adapters;

import nLayeredCommerce.business.abstracts.SignUpService;
import nLayeredCommerce.business.abstracts.UserService;
import nLayeredCommerce.entities.concretes.User;

public class GoogleAuth implements SignUpService{
	private UserService userService;
	
	public GoogleAuth(UserService userService) {
		super();
		this.userService = userService;
	}

	public void registerWithGoogle(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		userService.add(user);
		System.out.println(user.getEmail() + " adresiyle kayýt yapýldý.");
	}
}
