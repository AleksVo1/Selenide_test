package config;

import com.codeborne.selenide.Configuration;

public class InitFirefoxDriver {
    public static void initFirefoxDriver (){
        Configuration.browser = "firefox";

    }
}