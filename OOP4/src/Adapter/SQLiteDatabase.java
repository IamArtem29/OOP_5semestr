package Adapter;

public class SQLiteDatabase {
    public void connectSQLite() {
        System.out.println("Connecting to SQLite db");
    }

    public void querySQLite(String query) {
        System.out.println("Executing SQLite query: " + query);
    }

    public void disconnectSQLite() {
        System.out.println("Disconnecting from SQLite db");
    }
}