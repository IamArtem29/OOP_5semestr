package Adapter;

public class SQLiteAdapter implements Database {
    private SQLiteDatabase sqliteDB;

    public SQLiteAdapter(SQLiteDatabase sqliteDB) {
        this.sqliteDB = sqliteDB;
    }

    @Override
    public void connect() {
        sqliteDB.connectSQLite();
    }

    @Override
    public void query(String query) {
        sqliteDB.querySQLite(query);
    }

    @Override
    public void disconnect() {
        sqliteDB.disconnectSQLite();
    }
}