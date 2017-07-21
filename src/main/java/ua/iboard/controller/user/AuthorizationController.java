package ua.iboard.controller.user;

import ua.iboard.controller.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yevhen Chypachenko
 * Date 21.07.2017
 */
public class AuthorizationController extends AbstractController {
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        render("login.ftl", null, resp);
    }
}
