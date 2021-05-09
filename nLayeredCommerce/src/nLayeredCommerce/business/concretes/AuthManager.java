package nLayeredCommerce.business.concretes;


import nLayeredCommerce.business.abstracts.AuthService;
import nLayeredCommerce.business.abstracts.EmailValidationService;
import nLayeredCommerce.business.abstracts.UserService;
import nLayeredCommerce.core.adapters.GoogleAuth;
import nLayeredCommerce.core.logger.Logger;
import nLayeredCommerce.entities.concretes.User;

public class AuthManager implements AuthService{
	private EmailValidationService emailValidationService;
	private Logger logger;
	private UserService userService;
	public AuthManager(EmailValidationService emailValidationService, Logger logger, UserService userService) {
		this.emailValidationService = emailValidationService;
		this.logger = logger;
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý");
		
	}

	@Override
	public void register(User user) {
		var rules = user.getFirstName().length()<2 || user.getLastName().length()<2
				|| user.getPassword().length()<6 ;
		if (rules) {
			System.out.println("Kayýt baþarýsýz.");
		} else {
			logger.Log(user, user.getEmail() + " adresine doðrulama mesajý gönderildi.");
			if (emailValidationService.valid(user)) {
				userService.add(user);
				System.out.println("Kayýt baþarýlý");
			} else {
				System.out.println("Kayýt baþarýsýz.");
			}
			
		}
		
		
	}

	
}
