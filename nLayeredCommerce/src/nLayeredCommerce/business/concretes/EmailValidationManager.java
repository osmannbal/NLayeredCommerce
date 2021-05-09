package nLayeredCommerce.business.concretes;

import java.util.Scanner;

import nLayeredCommerce.business.abstracts.EmailValidationService;
import nLayeredCommerce.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService{
	
	@Override
	public Boolean valid(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do�rulamaya onay vermek i�in true yaz�n�z. Onay vermemek i�in false yaz�n�z.");
		Boolean isValid= scanner.nextBoolean();
		if (isValid) {
			System.out.println("Do�rulama ba�ar�l�");
			return true;
		} else {
			System.out.println("Do�rulama ger�ekle�tirilemedi");
			return false;
		}
		
		
	}

}
