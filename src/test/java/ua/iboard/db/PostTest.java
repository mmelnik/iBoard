package ua.iboard.db;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PostTest {
    private Post post;

    @Before
    public void setUp() throws Exception {
        DB.getInstance();
        post = Post.getInstance();
    }

    @Test
    public void getAll() throws Exception {
        List<Map<String, Object>> all = post.getAll();
        assertNotNull(all);
        assertNotEquals(0, all.size());
    }

}