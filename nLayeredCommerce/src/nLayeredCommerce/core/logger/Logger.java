package nLayeredCommerce.core.logger;

import nLayeredCommerce.entities.concretes.User;

public interface Logger {
	public void Log(User user, String message);
}
