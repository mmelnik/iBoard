package ua.iboard.controller.page;

import ua.iboard.controller.AbstractController;

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
