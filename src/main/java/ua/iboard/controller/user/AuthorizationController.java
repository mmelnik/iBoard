package ua.iboard.controller.user;

import ua.iboard.controller.AbstractController;
import ua.iboard.db.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 21.07.2017
 */
public class AuthorizationController extends AbstractController {
    private Users users = Users.getInstance();

    @Override
    public void handleImpl() throws Exception {
        HttpServletRequest req = req();
        HttpServletResponse resp = resp();

        String method = req.getMethod();
        switch (method) {
            case "GET":
                render("login.ftl");
                break;
            case "POST":
                Map<String, String[]> data = req.getParameterMap();
                // todo: validation
                String email = data.get("email")[0];
                String password = data.get("password")[0];

                Map<String, Object> dbUser = users.findByEmail(email);
                if (dbUser == null) {
                    render("login.ftl", asMap("alert", "Пользователь не существует или пароль не правильный"));
                } else if (!dbUser.get("password").equals(password)) {
                    render("login.ftl", asMap("alert", "Пользователь не существует или пароль не правильный"));
                } else {
                    String id = req.getSession().getId();
                    users.setSessionId((int) dbUser.get("id"), id);
                    redirect("/");
                }
                break;
        }
    }
}
