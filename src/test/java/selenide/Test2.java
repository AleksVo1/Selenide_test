package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.InitDriverProvider;
import config.InitFirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static config.InitSelenideViaWebDriverRunner.initWebDriverRunner;
import static org.example.AlertsPage.*;
import static org.example.DynamicControlsPage.*;


public class Test2 extends BasePageTest{

    @Test
    public void Test6(){
        InitFirefoxDriver.initFirefoxDriver();
        open("/dynamic_controls");
        inputFieldToBeDisabled();
        clickToEnableBtn();
        Assert.assertEquals(getMessageEnabled(), "It's enabled!");
        enterTextIntoInputField("Test string");
        Assert.assertEquals(getInputFieldValue(), "Test string");
        clickToDisableBtn();
        Assert.assertEquals(getMessageDisabled(), "It's disabled!");

    }

    @Test
    public void Test7() {
        initWebDriverRunner();
        open("/dynamic_controls");
        checkBoxExistActiveNotChecked();
        clickAndCheckedCheckBox();
        clickToRemoveButton();
        waitForSpinnerDisappear();
        Assert.assertFalse(checkBoxIsDisplayed());
        clickToAddButton();
        Assert.assertTrue(checkboxIsDisplayed());
        Assert.assertEquals(getMessage(), "It's back!");

    }

    @Test
    public void Test8() {
        Configuration.browser = InitDriverProvider.class.getName();
        open("/javascript_alerts");
        clickToClickForJsAlertBtnByFilter("Click for JS Alert");
        Selenide.confirm();
        Assert.assertEquals(getResult(), "You successfully clicked an alert");

    }

}

