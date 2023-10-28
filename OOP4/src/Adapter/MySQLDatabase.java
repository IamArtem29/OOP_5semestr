package Adapter;

public class MySQLDatabase {
    public void connectMySQL() {
        System.out.println("Connecting to MySQL db");
    }

    public void queryMySQL(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    public void disconnectMySQL() {
        System.out.println("Disconnecting from MySQL db");
    }
}
