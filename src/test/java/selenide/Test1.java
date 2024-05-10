package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static org.example.AlertsPage.*;

public class Test1 extends BasePageTest{

    @Test
    public void alertTest(){
        open("/javascript_alerts");
        clickToClickForJsAlertBtn();
        Assert.assertEquals(switchTo().alert().getText(), "I am a JS Alert");
        Selenide.confirm();
        Assert.assertEquals(getResult(), "You successfully clicked an alert");

    }

    @Test
    public void confirmTest(){
        open("/javascript_alerts");
        clickToClickForJsConfirmBtn();
        Assert.assertEquals(switchTo().alert().getText(), "I am a JS Confirm");
        Selenide.dismiss();
        Assert.assertEquals(getResult(), "You clicked: Cancel");

    }

    @Test
    public void promptTest(){
        open("/javascript_alerts");
        clickToClickForJsPromptBtn();
        Assert.assertEquals(switchTo().alert().getText(), "I am a JS prompt");
        switchTo().alert().sendKeys("Test message");
        Selenide.confirm();
        Assert.assertEquals(getResult(), "You entered: Test message");

    }

    @Test
    public void confirmViaCoTest(){
        open("/javascript_alerts");
        clickToConfirmViaClickOptions();
        Assert.assertEquals(switchTo().alert().getText(), "I am a JS Confirm");
        Selenide.confirm();
        Assert.assertEquals(getResult(), "You clicked: Ok");

    }

    @Test
    public void confirmViaJsTest(){
        open("/javascript_alerts");
        clickToConfirmViaJsExecuter();
        Assert.assertEquals(switchTo().alert().getText(), "I am a JS Confirm");
        Selenide.confirm();
        Assert.assertEquals(getResult(), "You clicked: Ok");

    }
}

