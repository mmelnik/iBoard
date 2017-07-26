package ua.iboard.controller;

import ua.iboard.controller.page.AddNewPostController;
import ua.iboard.controller.page.MainPageController;
import ua.iboard.controller.user.AuthorizationController;
import ua.iboard.controller.user.LogoutController;
import ua.iboard.controller.user.RegistrationController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class Controllers {
    private static final Logger log = Logger.getLogger(Controllers.class.getName());
    private static Controllers ourInstance = new Controllers();

    public static Controllers getInstance() {
        return ourInstance;
    }

    private final Map<String, AbstractController> controllers = new HashMap<>();

    private Controllers() {
        controllers.put("/", new MainPageController());
        controllers.put("/post/add-new", new AddNewPostController());
        controllers.put("/user/register", new RegistrationController());
        controllers.put("/user/login", new AuthorizationController());
        controllers.put("/user/logout", new LogoutController());
    }

    public void handle(String target, HttpServletRequest req, HttpServletResponse resp) throws Exception {
        log.fine("Handling request: " + target);
        AbstractController controller = controllers.get(target);
        if (controller == null) {
            throw new ServletException("No register controller found for target: " + target);
        }

        controller.handle(req, resp);
    }
}
