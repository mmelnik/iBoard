package ua.iboard.controller.page;

import ua.iboard.controller.AbstractSecureController;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class AddNewPostController extends AbstractSecureController {
    @Override
    public void handleImplSecured() throws Exception {
        render("addNew.ftl");
    }
}
