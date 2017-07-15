package ua.iboard.controller;

import ua.iboard.Templates;
import ua.iboard.db.DB;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Collections.singletonMap;
import static java.util.Collections.unmodifiableMap;

/**
 * Created by Yevhen Chypachenko
 * Date 14.07.2017
 */
public abstract class AbstractController implements IController {
    protected Templates templates = Templates.getInstance();
    protected DB db = DB.getInstance();

    protected Map<String, Object> asMap(String key, Object value) {
        return singletonMap(key, value);
    }

    protected Map<String, Object> asMap(String k1, Object v1, String k2, Object v2) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return unmodifiableMap(map);
    }
}
