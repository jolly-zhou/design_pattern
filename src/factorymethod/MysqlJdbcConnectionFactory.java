package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public class MysqlJdbcConnectionFactory implements JdbcConnectionFactory {

    @Override
    public JdbcConnection getJdbcConnection() {
        return new MysqlJdbcConnection();
    }
}
