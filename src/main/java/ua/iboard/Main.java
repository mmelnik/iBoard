package ua.iboard;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.DefaultSessionIdManager;
import org.eclipse.jetty.server.session.SessionHandler;
import ua.iboard.db.DB;
import ua.iboard.http.IBoardHandler;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Yevhen Chypachenko
 * Date 13.07.2017
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {
        LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logger.properties"));

        Templates.getInstance();
        DB.getInstance();

        Server server = new Server(8080);
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase("data");

        ContextHandler resourceContext = new ContextHandler();
        resourceContext.setContextPath("/data");
        resourceContext.setHandler(resourceHandler);

        IBoardHandler iBoardHandler = new IBoardHandler();

        SessionHandler sessionHandler = new SessionHandler();
        sessionHandler.setSessionIdManager(new DefaultSessionIdManager(server));

        HandlerList handlers = new HandlerList(resourceContext, sessionHandler, iBoardHandler);

        server.setHandler(handlers);

        server.start();
        log.info("Application started");
    }

}
