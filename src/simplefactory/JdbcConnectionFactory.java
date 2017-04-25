package simplefactory;

/**
 * Created by jolly on 2017/4/23.
 */
public class JdbcConnectionFactory {

    public static JdbcConnection getJdbcConnection(String driverClass) {

        if(driverClass == null)
            throw new IllegalArgumentException("driverClass must not be null value");

        try {
            JdbcConnection connection = (JdbcConnection) Class.forName(driverClass).newInstance();
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
