package com.Ozbey.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {


    static Properties properties = new Properties();
    static  FileInputStream fileInputStream;

    static {
        try {
              fileInputStream = new FileInputStream("src/test/resources/configuration.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e) {
                e.printStackTrace();

        }

    }

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);
    }
}
