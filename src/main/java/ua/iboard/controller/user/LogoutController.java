package ua.iboard.controller.user;

import ua.iboard.controller.AbstractController;
import ua.iboard.db.Users;

import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 26.07.2017
 */
public class LogoutController extends AbstractController {
    @Override
    public void handleImpl() throws Exception {
        Map<String, Object> user = currentUser();
        if (user != null) {
            Users.getInstance().setSessionId((Integer) user.get("id"), null);
        }
        redirect("/");
    }
}
