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
public class RegistrationController extends AbstractController {
    private Users users = Users.getInstance();

    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String method = req.getMethod();
        switch (method) {
            case "GET":
                render("register.ftl", null, resp);
                break;
            case "POST":
                Map<String, String[]> data = req.getParameterMap();
                // todo: validation
                int user = users.createUser(data.get("email")[0], data.get("password")[0], data.get("name")[0]);
                render("register.ftl", asMap("registration_success", true), resp);
                break;
        }
    }
}
