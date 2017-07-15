package ua.iboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yevhen Chypachenko
 * Date 14.07.2017
 */
public interface IController {
    void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
