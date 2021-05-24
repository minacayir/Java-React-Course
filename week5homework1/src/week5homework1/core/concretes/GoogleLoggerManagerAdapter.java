package week5homework1.core.concretes;

import week5homework1.core.abstracts.LoggerService;
import week5homework1.googleLogger.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerService{

	@Override
	public void register() {
		GoogleLoggerManager manager = new GoogleLoggerManager();
		manager.register();
		
	}

}
