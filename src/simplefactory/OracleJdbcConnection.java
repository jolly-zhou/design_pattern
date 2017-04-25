package simplefactory;

/**
 * Created by jolly on 2017/4/23.
 */
public class OracleJdbcConnection implements JdbcConnection {
    @Override
    public void connect() {
        System.out.println("Oracle Connection..");
    }
}
