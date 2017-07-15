package ua.iboard;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yevhen Chypachenko
 * Date 13.07.2017
 */
public class Templates {
    private static Templates ourInstance = new Templates();

    public static Templates getInstance() {
        return ourInstance;
    }

    private final Configuration configuration;

    private Templates() {
        configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setDefaultEncoding("UTF-8");
        configuration.unsetCacheStorage();
        try {
            configuration.setDirectoryForTemplateLoading(new File("tpl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Template getTemplate(String name) {
        try {
            return configuration.getTemplate(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
