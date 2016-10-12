package com.lux.tpr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.StreamHandler;

public class PropertyHolder {

    private static Properties properties = new Properties();

    static {
        InputStream stream = null;
        try {
            stream = new FileInputStream("/home/konstantin/Desktop/work/rm.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private PropertyHolder() {

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
