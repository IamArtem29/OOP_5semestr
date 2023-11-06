package Adapter;

public interface SourceDatabase {
    void connect();
    void fetchData();
    void disconnect();
}
