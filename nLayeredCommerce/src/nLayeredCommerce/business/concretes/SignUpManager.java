package nLayeredCommerce.business.concretes;

import nLayeredCommerce.business.abstracts.SignUpService;
import nLayeredCommerce.core.adapters.GoogleAuth;

public class SignUpManager implements SignUpService{

	private GoogleAuth googleAuth;
	
	public SignUpManager(GoogleAuth googleAuth) {
		super();
		this.googleAuth = googleAuth;
	}

	@Override
	public void registerWithGoogle(String email, String password) {
		
	}

}
