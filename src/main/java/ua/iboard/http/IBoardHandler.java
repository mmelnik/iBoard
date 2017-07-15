package ua.iboard.http;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import ua.iboard.controller.MainPageController;

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

    @Override
    public void handle(String target,
                       Request request,
                       HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws IOException, ServletException {
        log.info("request" + request);

        httpServletResponse.setCharacterEncoding("UTF-8");

        String method = request.getMethod();
        if (method.equals("GET")) {
            log.info("On GET");
            if (target.equals("/")) {
                try {
                    new MainPageController().handle(httpServletRequest, httpServletResponse);
                    request.setHandled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else if (method.equals("POST")) {

        }
    }
}
