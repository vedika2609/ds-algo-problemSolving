package helpers;

public class Log{

	// Initialize Log4j logs
//	private static Logger Log = Logger.getLogger(Log.class.getName());
    private static String TC_Name;

	//This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

	public static void startTestCase(String sTestCaseName){

//		Reporter.log("\n ########################################################################################");
//		Reporter.log("#########################Starting "+sTestCaseName+"########################");
//		Reporter.log("########################################################################################\n ");
		System.out.println("\n ########################################################################################");
		System.out.println("#########################Starting "+sTestCaseName+"########################");
		System.out.println("########################################################################################\n ");
		TC_Name = sTestCaseName;
	}

	//This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName){

		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

		Log.info("X");

		Log.info("X");

		Log.info("X");

		Log.info("X");

	}

	// Need to create these methods, so that they can be called

    static void info(String message) {
		Log.info(message);
		System.out.println(message);
//		Reporter.log(message);
	}

	private static void warn(String message) {
		Log.warn(message);
	}

	private static void error(String message, Exception e) {
		Log.error(message, e);
		e.printStackTrace();
	}

	private static void fatal(String message) {
		Log.fatal(message);
	}

	private static void debug(String message) {
		Log.debug(message);
	}

}