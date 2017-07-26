package ua.iboard.db;

import java.util.Map;

import org.skife.jdbi.v2.Handle;

/**
 * Created by Yevhen Chypachenko
 * Date 21.07.2017
 */
public class Users {
    private static Users ourInstance = new Users();

    public static Users getInstance() {
        return ourInstance;
    }

    private DB db = DB.getInstance();

    private Users() {
    }

    public int createUser(String email, String password, String name) {
        try (Handle h = db.handle()) {
            return h.createStatement("insert into users(email,password,name) values(:email,:password,:name)")
                    .bind("email", email)
                    .bind("password", password)
                    .bind("name", name)
                    .execute();
        }
    }

    public Map<String, Object> findByEmail(String email) {
        try (Handle h = db.handle()) {
            return h.createQuery("select * from users where email = :email")
                    .bind("email", email)
                    .first();
        }
    }
}
