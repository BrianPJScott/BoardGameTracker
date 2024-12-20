import java.sql.*;
import java.util.*;

public class DBManager {

    //Default DB Connection Details
    final static String DEFAULT_URL = "jdbc:mysql://localhost:3306/gamedb";
    final static int DEFAULT_PORT = 3306;
    final static String DEFAULT_USER = "brianpjscott";
    final static String DEFAULT_PASS = "BpjS24061980#*";

    // Pre-made SQL Queries
    final static String GET_ALL_USERS = "SELECT * FROM users";
    final static String GET_ALL_GAMES = "SELECT * FROM games";

    // Non-default DB connection details
    private String dbConnection;
    private String dbHost;
    private int dbPort;
    private String dbUser;
    private String dePass;

    // SQL Helper vars (Statement / ResultSet)
    private Statement statement;
    private ResultSet results;

    private boolean isConnected = false;

    public boolean isConnected() {
        return isConnected;
    }

    // Constructors
    public DBManager() {
        this(DEFAULT_URL, DEFAULT_PORT, DEFAULT_USER, DEFAULT_PASS);
    }

    public DBManager(String host, int port, String user, String pass) {
        dbConnection = host + ":" + port + "/" + user + "/" + pass;
    }

    public void printConnection() {
        System.out.println("Host: " + DEFAULT_URL);
        System.out.println("Port: " + DEFAULT_PORT);
        System.out.println("Host: " + DEFAULT_USER);
        System.out.println("Host: " + DEFAULT_PASS);
    }

    public void dbConnect() {

        try {
            Connection con = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USER, DEFAULT_PASS); //Connection con = DriverManager.getConnection(dbConnection);
            isConnected = true;
            statement = con.createStatement();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }

    }

    public List<List<String>> getAllUsers() {
        List<List<String>> users = new ArrayList<>();

        try {
            results = statement.executeQuery(GET_ALL_USERS);
            while (results.next()) {
                users.add(Arrays.asList(results.getString(1), results.getString(2), results.getString(3), results.getString(4)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

        return users;
    }

}
