package ua.iboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class AddNewPostController extends AbstractController {
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        render("addNew.ftl", null, resp);
    }
}
