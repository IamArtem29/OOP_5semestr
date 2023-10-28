package Adapter;

public class DataConverter {
    public void convertData(Database sourceDB, Database targetDB, String query) {
        sourceDB.connect();
        targetDB.connect();

        sourceDB.query(query);
        targetDB.query(query);

        sourceDB.disconnect();
        targetDB.disconnect();
    }
}