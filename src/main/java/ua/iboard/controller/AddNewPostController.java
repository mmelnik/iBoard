package ua.iboard.controller;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class AddNewPostController extends AbstractController {
    @Override
    public void handleImpl() throws Exception {
        render("addNew.ftl", null);
    }
}
