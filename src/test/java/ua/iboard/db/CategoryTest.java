package ua.iboard.db;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
    private Category category;

    @Before
    public void setUp() throws Exception {
        DB.getInstance();
        category = Category.getInstance();
    }

    @Test
    public void getAll() throws Exception {
        List<Map<String, Object>> all = category.getAll();
        assertNotNull(all);
        assertNotEquals(0, all.size());
    }

}