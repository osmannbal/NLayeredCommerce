package nLayeredCommerce.business.abstracts;

import nLayeredCommerce.entities.concretes.User;

public interface EmailValidationService {
	public Boolean valid(User user);
}
