package nLayeredCommerce.business.concretes;

import java.util.Scanner;

import nLayeredCommerce.business.abstracts.EmailValidationService;
import nLayeredCommerce.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService{
	
	@Override
	public Boolean valid(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doðrulamaya onay vermek için true yazýnýz. Onay vermemek için false yazýnýz.");
		Boolean isValid= scanner.nextBoolean();
		if (isValid) {
			System.out.println("Doðrulama baþarýlý");
			return true;
		} else {
			System.out.println("Doðrulama gerçekleþtirilemedi");
			return false;
		}
		
		
	}

}
