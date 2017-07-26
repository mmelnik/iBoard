package ua.iboard.http;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import ua.iboard.controller.Controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Yevhen Chypachenko
 * Date 13.07.2017
 */
public class IBoardHandler extends AbstractHandler {
    private static final Logger log = Logger.getLogger(IBoardHandler.class.getName());
    private Controllers controllers = Controllers.getInstance();

    @Override
    public void handle(String target,
                       Request request,
                       HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws IOException, ServletException {

        httpServletResponse.setCharacterEncoding("UTF-8");

        try {
            controllers.handle(target, httpServletRequest, httpServletResponse);
            request.setHandled(true);
        } catch (Exception e) {
            throw new ServletException("An error occurred", e);
        }
    }
}
