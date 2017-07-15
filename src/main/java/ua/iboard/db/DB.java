package ua.iboard.db;

import org.apache.commons.io.IOUtils;
import org.h2.jdbcx.JdbcConnectionPool;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

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
        try {
            h.createScript(IOUtils.toString(DB.class.getResourceAsStream("/db/schema.sql"), UTF_8)).execute();
            h.createScript(IOUtils.toString(DB.class.getResourceAsStream("/db/initialData.sql"), UTF_8)).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        h.close();
    }

    public List<Map<String, Object>> select(String query) {
        try (Handle h = dbi.open()) {
            return h.select(query);
        }
    }
}
