package ua.iboard.controller.user;

import java.util.Map;

import ua.iboard.controller.AbstractController;
import ua.iboard.db.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yevhen Chypachenko
 * Date 21.07.2017
 */
public class AuthorizationController extends AbstractController {
    private Users users = Users.getInstance();

    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String method = req.getMethod();
        switch (method) {
            case "GET":
                render("login.ftl", null, resp);
                break;
            case "POST":
                Map<String, String[]> data = req.getParameterMap();
                // todo: validation
                String email = data.get("email")[0];
                String password = data.get("password")[0];

                Map<String, Object> dbUser = users.findByEmail(email);
                if (dbUser == null) {
                    render("login.ftl", asMap("alert", "Пользователь не существует или пароль не правильный"), resp);
                } else if (!dbUser.get("password").equals("password")) {
                    render("login.ftl", asMap("alert", "Пользователь не существует или пароль не правильный"), resp);
                } else {
                    // todo: auth user and redirect
                }
                break;
        }
    }
}
