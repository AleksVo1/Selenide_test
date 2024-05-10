package config;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;

public class InitDriverProvider implements WebDriverProvider{
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities){
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;

    }
}
