package ru.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE;

    static {
        String string = System.getenv("APP_LANG");
        if (string != null) {
            APPLICATION_DEFAULT_LANGUAGE = string;
        } else {
            APPLICATION_DEFAULT_LANGUAGE = "en";
        }
    }
}
