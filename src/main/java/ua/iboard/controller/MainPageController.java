package ua.iboard.controller;

import freemarker.template.Template;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 14.07.2017
 */
public class MainPageController extends AbstractController {


    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Template template = templates.getTemplate("index.ftl");

        List<Map<String, Object>> categories = db.select("select * from category");
        List<Map<String, Object>> posts = db.select("select * from post");

        Map<String, Object> data = asMap("categories", categories, "posts", posts);

        template.process(data, resp.getWriter());
    }
}
