package ua.iboard.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class UsersTest {
    private Users users;

    @Before
    public void setUp() throws Exception {
        DB.getInstance();
        users = Users.getInstance();
    }

    @Test
    public void createAndFindUser() throws Exception {
        users.createUser("test1@test.com", "test1", "test1");
        Map user = users.findByEmail("test1@test.com");
        assertNotNull(user);
        assertEquals("test1@test.com", user.get("email"));
    }

    @Test
    public void findBySessionId() throws Exception {
        users.createUser("test2@test.com", "test2", "test2");
        Map user = users.findByEmail("test2@test.com");
        users.setSessionId((Integer) user.get("id"), "testId");

        Map actual = users.findBySessionId("testId");
        assertNotNull(actual);
        assertEquals("test2@test.com", actual.get("email"));
    }
}