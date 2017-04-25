package factorymethod;

/**
 * Created by jolly on 2017/4/23.
 */
public class MysqlJdbcConnection implements JdbcConnection {

    @Override
    public void connect() {
        System.out.println("MYSQL connect");
    }
}
