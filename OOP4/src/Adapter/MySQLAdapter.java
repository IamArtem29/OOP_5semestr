package Adapter;

public class MySQLAdapter implements Database {
    private MySQLDatabase mysqlDB;

    public MySQLAdapter(MySQLDatabase mysqlDB) {
        this.mysqlDB = mysqlDB;
    }

    @Override
    public void connect() {
        mysqlDB.connectMySQL();
    }

    @Override
    public void query(String query) {
        mysqlDB.queryMySQL(query);
    }

    @Override
    public void disconnect() {
        mysqlDB.disconnectMySQL();
    }
}
