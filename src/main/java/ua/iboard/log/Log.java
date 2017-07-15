package ua.iboard.log;

import java.util.logging.Logger;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class Log {
    private final Logger logger;

    public Log(Logger logger) {
        this.logger = logger;
    }

    public static Log logger(Class clazz) {
        return new Log(Logger.getLogger(clazz.getName()));
    }

    public void info(String log) {
        logger.info(log);
    }
}
