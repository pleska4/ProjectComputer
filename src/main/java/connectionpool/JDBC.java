package connectionpool;

abstract class JDBC {
    private ConnectionPool connectionPool = ConnectionPool.getCp();

    protected ConnectionPool getConnectionPool()
    {
        return this.connectionPool;
    }
}