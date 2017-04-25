package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public class OracleJdbcConnectionFactory implements JdbcConnectionFactory {
    @Override
    public JdbcConnection getJdbcConnection() {
        return new OracleJdbcConnection();
    }
}
