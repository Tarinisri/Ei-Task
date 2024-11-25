// Logger: A singleton class that ensures only one instance exists across the application.
// Private Constructor: Prevents instantiation from outside the class.
// getInstance(): A static method to create and return the single Logger instance. It uses lazy initialization with thread-safe double-checked locking.
// logMessage(): A method to log messages, demonstrating the functionality of the singleton.
// Main Class: Accesses the singleton instance and uses it for logging. All accesses use the same Logger instance.


class Logger {
    // Private static instance of the singleton class
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {}

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { // Ensures thread safety
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // A method to log messages
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        // Retrieve the single instance of Logger
        Logger logger = Logger.getInstance();

        // Use the logger to log messages
        logger.logMessage("This is the first log message.");
        logger.logMessage("Singleton ensures a single instance of Logger is used.");
    }
}
