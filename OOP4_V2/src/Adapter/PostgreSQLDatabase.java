package Adapter;

public class PostgreSQLDatabase implements TargetDatabase {
    @Override
    public void connect() {
        System.out.println("Connect to PostgreSQLDatabase");
    }

    @Override
    public void insertData() {
        System.out.println("Insert data");
    }

    @Override
    public void disconnect() {
        System.out.println("Exit PostgreSQLDatabase");
    }
}
