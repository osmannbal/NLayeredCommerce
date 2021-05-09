package nLayeredCommerce;

import nLayeredCommerce.business.abstracts.SignUpService;
import nLayeredCommerce.business.concretes.AuthManager;
import nLayeredCommerce.business.concretes.EmailValidationManager;
import nLayeredCommerce.business.concretes.SignUpManager;
import nLayeredCommerce.business.concretes.UserManager;
import nLayeredCommerce.core.adapters.GoogleAuth;
import nLayeredCommerce.core.logger.EmailLogger;
import nLayeredCommerce.dataAccess.concretes.HibernateUserDao;
import nLayeredCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Osman","Bal","osman@osman.com","KFLKSLL");
		AuthManager authManager = new AuthManager(new EmailValidationManager(), new EmailLogger(), new UserManager(new HibernateUserDao()));
		UserManager manager = new UserManager(new HibernateUserDao());
		
		authManager.register(user);

		
		GoogleAuth googleAuth = new GoogleAuth(new UserManager(new HibernateUserDao()));
		googleAuth.registerWithGoogle("osman@osman.com", "354961684");
	}

}
