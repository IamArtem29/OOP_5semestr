import Adapter.*;

public class Main {
    public static void main(String[] args) {
        SourceDatabase mysqlDatabase = new MySQLDatabase();
        TargetDatabase postgresDatabase = new PostgreSQLDatabase();

        TargetDatabase adapter = new DatabaseAdapter(mysqlDatabase);

        adapter.connect();
        adapter.insertData();
        adapter.disconnect();
    }
}