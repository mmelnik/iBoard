package ua.iboard.db;

import org.h2.jdbcx.JdbcConnectionPool;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 13.07.2017
 */
public class DB {
    private static DB ourInstance = new DB();

    public static DB getInstance() {
        return ourInstance;
    }

    private final DBI dbi;

    private DB() {
        DataSource ds = JdbcConnectionPool.create("jdbc:h2:mem:test",
                "username",
                "password");

        dbi = new DBI(ds);

        Handle h = dbi.open();
        h.execute("CREATE TABLE category (id INT PRIMARY KEY, name VARCHAR(100))");
        h.execute("CREATE TABLE post (id INT PRIMARY KEY, catId INT, name VARCHAR(100), price INT)");

        h.execute("INSERT INTO category VALUES(1, 'Кольца') ");
        h.execute("INSERT INTO category VALUES(2, 'Ожерелья') ");
        h.execute("INSERT INTO category VALUES(3, 'Серьги') ");
        h.execute("INSERT INTO category VALUES(4, 'Браслеты') ");
        h.execute("INSERT INTO category VALUES(5, 'Колье') ");
        h.execute("INSERT INTO category VALUES(6, 'Комплекты') ");

        h.execute("INSERT INTO post VALUES(1, 1, 'Супер кольцо баюма', 199) ");
        h.execute("INSERT INTO post VALUES(2, 1, 'Супер кольцо королевы муравьев', 99) ");

        h.close();
    }

    public List<Map<String, Object>> select(String query) {
        try (Handle h = dbi.open()) {
            return h.select(query);
        }
    }
}
