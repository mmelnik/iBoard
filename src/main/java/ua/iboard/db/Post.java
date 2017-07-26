package ua.iboard.db;

import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 26.07.2017
 */
public class Post {
    private static Post instance = new Post();

    public static Post getInstance() {
        return instance;
    }

    private Post() {
    }

    public List<Map<String, Object>> getAll() {
        return DB.getInstance().select("select * from post");
    }
}
