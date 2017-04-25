package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public class MssqlJdbcConnection implements JdbcConnection {
    @Override
    public void connect() {
        System.out.println("MSSQL connect..");
    }
}
