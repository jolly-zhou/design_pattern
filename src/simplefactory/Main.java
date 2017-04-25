package simplefactory;

import java.util.Iterator;

/**
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {

       JdbcConnection conn = JdbcConnectionFactory.getJdbcConnection("simplefactory.MysqlJdbcConnection");
       conn.connect();

       JdbcConnection conn1 = JdbcConnectionFactory.getJdbcConnection("simplefactory.MssqlJdbcConnection");
       conn1.connect();

    }



}
