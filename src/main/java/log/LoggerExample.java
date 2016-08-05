package log;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	//create or find a logger by the name
	public static void main(String[] args) throws SecurityException, IOException {

		LOGGER.info("Logger Name: " + LOGGER.getName());
		//this method used ot log an INFO message
		
		LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
		//this method is used to log an  WARNING message
		
		int[] a = { 1, 2, 3 };// An array of size 3
		int index = 4;
		LOGGER.config("index is set to " + index);
		//log a CONFIG message
		try {
			System.out.println(a[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			LOGGER.log(Level.SEVERE, "Exception occur", ex);
		}

	}

}
