package ua.iboard.controller;

import ua.iboard.db.Category;
import ua.iboard.db.Post;

import java.util.List;
import java.util.Map;

/**
 * Created by Yevhen Chypachenko
 * Date 14.07.2017
 */
public class MainPageController extends AbstractController {
    private Post post = Post.getInstance();
    private Category category = Category.getInstance();

    @Override
    public void handleImpl() throws Exception {
        List<Map<String, Object>> categories = category.getAll();
        List<Map<String, Object>> posts = post.getAll();
        Map<String, Object> data = asMap("categories", categories, "posts", posts);
        render("lastPost.ftl", data);
    }
}
