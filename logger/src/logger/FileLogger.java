package logger;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database Loglandi = " + message);

	}

}
