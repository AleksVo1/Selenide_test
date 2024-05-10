package config;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitSelenideViaWebDriverRunner {
    public static void initWebDriverRunner(){
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        WebDriverRunner.setWebDriver(firefoxDriver);

    }
}