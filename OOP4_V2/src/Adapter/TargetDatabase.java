package Adapter;

public interface TargetDatabase {
    void connect();
    void insertData();
    void disconnect();
}