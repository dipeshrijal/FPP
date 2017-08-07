package mainpackage;

import java.io.Serializable;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class Main implements Serializable {
	
	/** Logger should be a static final and variable name should be capitalized */
	private final static Logger LOG = 
			Logger.getLogger(Main.class.getPackage().getName());

	public static void main(String[] args) {
		Main m = new Main();
		m.testingTheLogger();
	}
	
	public void testingTheLogger() {
		LOG.info("This message will appear both in the log file and on the console -- console "
				+ "message should have simple formatting.");
		LOG.config("This message will appear only on the console but will be filtered out "
				+ "from the log file.");
	}

}
