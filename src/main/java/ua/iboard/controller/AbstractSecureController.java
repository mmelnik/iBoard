package ua.iboard.controller;

/**
 * Created by Yevhen Chypachenko
 * Date 26.07.2017
 */
public abstract class AbstractSecureController extends AbstractController {
    @Override
    public final void handleImpl() throws Exception {
        if (currentUser() == null) {
            resp().setStatus(403);
            render("403.ftl");
            return;
        }

        handleImplSecured();
    }

    protected abstract void handleImplSecured() throws Exception;
}
