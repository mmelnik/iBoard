package ua.iboard.db;

import org.skife.jdbi.v2.Handle;

import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 26.07.2017
 */
public class Post {
    private static final String INSERT = "INSERT INTO post(catId,userId,name,description,price) VALUES " +
            "(:catId, :userId, :name, :description,:price)";

    private static Post instance = new Post();
    private final DB db = DB.getInstance();

    public static Post getInstance() {
        return instance;
    }

    private Post() {
    }

    public List<Map<String, Object>> getAll() {
        return db.select("select * from post");
    }

    public void create(int userId, int categoryId, String title, String description, String price) {
        try (Handle h = db.handle()) {
            h.createStatement(INSERT)
                    .bind("catId", categoryId)
                    .bind("userId", userId)
                    .bind("name", title)
                    .bind("description", description)
                    .bind("price", price)
                    .execute();
        }
    }
}
