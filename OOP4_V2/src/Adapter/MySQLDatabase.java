package Adapter;

public class MySQLDatabase implements SourceDatabase {
    @Override
    public void connect() {
        System.out.println("Connect to MySQLDatabase");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetch data");
    }

    @Override
    public void disconnect() {
        System.out.println("Exit MySQLDatabase");
    }
}
