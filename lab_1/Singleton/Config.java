package Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Config {
    public String LOGIN;
    public String PASSWORD;
    public String id;

    static String config = "Singleton/config.ini";

    private static Config instance;

    private Config(String idInput) {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(new File(config)));

            LOGIN = props.getProperty("LOGIN");
            PASSWORD = props.getProperty("PASSWORD");

            id = idInput;
        } catch (IOException e) {
            System.out.println("Oops");
        }
    }

    public static Config getInstance(String id) {
        if (instance == null) {
            instance = new Config(id);
        }
        return instance;
    }

    public void getParams() {
        System.out.println('\n' + LOGIN);
        System.out.println(PASSWORD);
        System.out.println(id + '\n');
    }
}