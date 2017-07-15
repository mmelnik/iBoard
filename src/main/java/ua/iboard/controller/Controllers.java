package ua.iboard.controller;

import ua.iboard.log.Log;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class Controllers {
    private static final Log log = Log.logger(Controllers.class);
    private static Controllers ourInstance = new Controllers();

    public static Controllers getInstance() {
        return ourInstance;
    }

    private final Map<String, IController> controllers = new HashMap<>();

    private Controllers() {
        controllers.put("/", new MainPageController());
        controllers.put("/post/add-new", new AddNewPostController());
    }

    public void handle(String target, HttpServletRequest req, HttpServletResponse resp) throws Exception {
        log.info("Handling request: " + req);
        IController controller = controllers.get(target);
        if (controller == null) {
            throw new ServletException("No register controller found for target: " + target);
        }

        controller.handle(req, resp);
    }
}
