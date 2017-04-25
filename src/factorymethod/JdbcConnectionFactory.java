package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public interface JdbcConnectionFactory {

    JdbcConnection getJdbcConnection();
}
