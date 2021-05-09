package nLayeredCommerce.core.logger;

import nLayeredCommerce.entities.concretes.User;

public class EmailLogger implements Logger{

	@Override
	public void Log(User user, String message) {
		System.out.println("Loglandý." + message);
		
	}

}
