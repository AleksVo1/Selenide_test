package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DynamicControlsPage {

    public static void inputFieldToBeDisabled(){
        $(By.xpath("//*[@type='text']")).shouldHave(attribute("disabled"));

    }

    public static void clickToEnableBtn(){
        $(By.xpath("//*[@onclick='swapInput()']")).shouldBe(visible).click();

    }

    public static String getMessageEnabled(){
        return $(By.xpath("//*[@id='message']")).shouldBe(visible).getText();

    }

    public static void enterTextIntoInputField(String text) {
        $(By.xpath("//*[@type='text']")).shouldBe(visible).setValue(text);

    }

    public static String getInputFieldValue() {
        return $(By.xpath("//*[@type='text']")).shouldBe(visible).getValue();
    }

    public static void clickToDisableBtn(){
        $(By.xpath("//*[@onclick='swapInput()']")).shouldBe(visible).click();

    }

    public static String getMessageDisabled(){
        return $(By.xpath("//*[@id='message']")).shouldBe(visible).getText();

    }

    public static void checkBoxExistActiveNotChecked() {
        SelenideElement checkBox = $(By.xpath("//*[@type='checkbox']"));
        checkBox.should(exist);
        checkBox.should(enabled);
        checkBox.shouldNotBe(checked);
    }

    public static void clickAndCheckedCheckBox() {
        SelenideElement checkBox = $(By.xpath("//*[@type='checkbox']"));
        checkBox.click();
        checkBox.shouldBe(checked);

    }

    public static void clickToRemoveButton() {
        $(By.xpath("//*[@onclick='swapCheckbox()']")).shouldBe(visible).click();

    }

    public static void waitForSpinnerDisappear() {
        $(By.id("loading")).shouldNotBe(visible);

    }

    public static boolean checkBoxIsDisplayed() {
        return $(By.xpath("//*[@type='checkbox']")).shouldNotBe(visible).isDisplayed();
    }

    public static void clickToAddButton() {
        $(By.xpath("//*[@onclick='swapCheckbox()']")).shouldBe(visible).click();

    }

    public static boolean checkboxIsDisplayed() {
        return $(By.xpath("//*[@type='checkbox']")).shouldBe(visible).isDisplayed();
    }

    public static String getMessage(){
        return $(By.xpath("//*[@id='message'] [1]")).shouldBe(visible).getText();
    }



}
