package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePageTest {

    @BeforeMethod
    public void setup(){
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.timeout = 10000;
    }

    @AfterMethod
    public void closeDriver(){
        Selenide.closeWebDriver();

    }
}
