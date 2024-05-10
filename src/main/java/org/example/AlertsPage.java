package org.example;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AlertsPage {

    public static void clickToClickForJsAlertBtn(){
        $(By.xpath("//*[@onclick='jsAlert()']")).shouldBe(visible).click();
    }

    public static void clickToClickForJsConfirmBtn(){
        $(By.xpath("//*[@onclick='jsConfirm()']")).shouldBe(visible).click();
    }

    public static void clickToClickForJsPromptBtn(){
        $(By.xpath("//*[@onclick='jsPrompt()']")).shouldBe(visible).click();
    }

    public static void clickToConfirmViaClickOptions(){
        $(By.xpath("//*[@onclick='jsConfirm()']")).click(ClickOptions.usingJavaScript());
    }

    public static void clickToConfirmViaJsExecuter(){
        executeJavaScript("document.querySelector(\"button[onclick='jsConfirm()']\").click();");

    }

    public static String getResult(){
        return $(By.id("result")).shouldBe(visible).getText();

    }

    public static void clickToClickForJsAlertBtnByFilter(String textButton){
        $$(".button, button").filterBy(Condition.text(textButton)).first().click();

    }

}

