package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public class Main {


    public static void main(String[] args) {
        JdbcConnectionFactory mssqlfactory = new MssqlJdbcConnectionFactory();
        mssqlfactory.getJdbcConnection().connect();

        JdbcConnectionFactory mysqlfactory = new MysqlJdbcConnectionFactory();
        mysqlfactory.getJdbcConnection().connect();

        JdbcConnectionFactory oraclefactory = new OracleJdbcConnectionFactory();
        oraclefactory.getJdbcConnection().connect();
    }
}
