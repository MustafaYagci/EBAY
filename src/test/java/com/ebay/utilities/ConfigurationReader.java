package com.ebay.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


   private static Properties properties;
    static {

        String path="configuration.properties";

        try{
            FileInputStream inputStream;
            inputStream=new FileInputStream(path);
            properties=new Properties();
            properties.load(inputStream);
            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getValue(String key){
       return properties.getProperty(key);
    }

}
