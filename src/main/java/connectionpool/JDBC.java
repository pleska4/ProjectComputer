package connectionpool;

abstract class JDBC {
    private ConnectionPool connectionPool = ConnectionPool.init();

    protected ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }
}