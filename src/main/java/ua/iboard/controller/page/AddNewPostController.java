package ua.iboard.controller.page;

import ua.iboard.controller.AbstractSecureController;
import ua.iboard.db.Post;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 15.07.2017
 */
public class AddNewPostController extends AbstractSecureController {
    private Post post = Post.getInstance();
    
    @Override
    public void handleImplSecured() throws Exception {
        HttpServletRequest request = req();
        String method = request.getMethod();
        switch (method) {
            case "GET":
                render("addNew.ftl");
                break;
            case "POST":
                addNewPost();
                render("addNew.ftl", asMap("alert", "Not implemented"));
                break;
        }
    }

    private void addNewPost() {
        // TODO: add validation
        HttpServletRequest request = req();

        Map<String, Object> user = currentUser();
        int userId = (int) user.get("id");
        
        // TODO: add categories
        int categoryId = 1;
        
        Map<String, String[]> parameterMap = request.getParameterMap();
        String title = parameterMap.get("title")[0];
        String description = parameterMap.get("description")[0];
        String price = parameterMap.get("price")[0];
        
        post.create(userId, categoryId, title, description, price);
        
        //TODO: photos
        
    }
}
