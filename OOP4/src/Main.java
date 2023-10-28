import Adapter.*;

public class Main {
    public static void main(String[] args) {
        SQLiteDatabase sqliteDB = new SQLiteDatabase();
        MySQLDatabase mysqlDB = new MySQLDatabase();

        SQLiteAdapter sqliteAdapter = new SQLiteAdapter(sqliteDB);
        MySQLAdapter mysqlAdapter = new MySQLAdapter(mysqlDB);

        DataConverter dataConverter = new DataConverter();
        dataConverter.convertData(sqliteAdapter, mysqlAdapter, "SELECT * FROM MyTable");
    }
}