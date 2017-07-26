package ua.iboard.controller;

import freemarker.template.Template;
import ua.iboard.Templates;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 14.07.2017
 */
public abstract class AbstractController implements IController {
    private static final ThreadLocal<HttpServletRequest> request = new ThreadLocal<>();
    private static final ThreadLocal<HttpServletResponse> response = new ThreadLocal<>();
    private Templates templates = Templates.getInstance();


    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        request.set(req);
        response.set(resp);

        try {
            handleImpl();
        } finally {
            request.remove();
            response.remove();
        }
    }

    protected void render(String module, Map<String, Object> dataModel) throws Exception {
        Template template = templates.getTemplate("index.ftl");

        Map<String, Object> data = new LinkedHashMap<>();
        data.put("module", module);

        if (dataModel != null)
            data.putAll(dataModel);

        template.process(data, response.get().getWriter());
    }

    protected HttpServletRequest req() {
        return request.get();
    }

    protected HttpServletResponse resp() {
        return response.get();
    }

    protected Map<String, Object> asMap(String key, Object value) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(key, value);
        return map;
    }

    protected Map<String, Object> asMap(String k1, Object v1, String k2, Object v2) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

}
