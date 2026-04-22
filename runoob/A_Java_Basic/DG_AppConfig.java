public class DG_AppConfig {
    public static final String APP_NAME = "MyApp";
    public static final String APP_VERSION = "1.0.0";
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    
    public static void main(String[] args) {
        System.out.println("Application name: " + DG_AppConfig.APP_NAME);
        System.out.println("Application version: " + DG_AppConfig.APP_VERSION);
        System.out.println("Database URL: " + DG_AppConfig.DATABASE_URL);
    }
}
