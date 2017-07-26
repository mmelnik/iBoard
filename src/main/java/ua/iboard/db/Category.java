package ua.iboard.db;

import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 26.07.2017
 */
public class Category {
    private static Category instance = new Category();

    public static Category getInstance() {
        return instance;
    }

    private Category() {
    }

    public List<Map<String, Object>> getAll() {
        return DB.getInstance().select("select * from category");
    }
}
