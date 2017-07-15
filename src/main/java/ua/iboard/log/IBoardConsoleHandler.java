package ua.iboard.log;

import java.util.logging.ConsoleHandler;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class IBoardConsoleHandler extends ConsoleHandler {
    public IBoardConsoleHandler() {
        super();
        setOutputStream(System.out);
    }
}
