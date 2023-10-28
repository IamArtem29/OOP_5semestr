package Adapter;

public interface Database {
    void connect();
    void query(String query);
    void disconnect();
}