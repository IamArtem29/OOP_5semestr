package Adapter;

public class DatabaseAdapter implements TargetDatabase {
    private SourceDatabase source;

    public DatabaseAdapter(SourceDatabase source) {
        this.source = source;
    }

    @Override
    public void connect() {
        source.connect();
    }

    @Override
    public void insertData() {
        source.fetchData();
    }

    @Override
    public void disconnect() {
        source.disconnect();
    }
}