package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	 private static JDBC instance = new JDBC();
	    public static final String URL = "jdbc:mysql://143.248.53.136:3310/db_hdvcs";
	    public static final String USER = "root";
	    public static final String PASSWORD = "digger";
	    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
	     
	    //private constructor
	    private JDBC() {
	        try {
	            //Step 2: Load MySQL Java driver
	            Class.forName(DRIVER_CLASS);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	     
	    private Connection createConnection() {
	 
	        Connection connection = null;
	        try {
	            //Step 3: Establish Java MySQL connection
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            System.out.println("ERROR: Unable to Connect to Database.");
	        }
	        return connection;
	    }   
	     
	    public static Connection getConnection() {
	        return instance.createConnection();
	    }
}
