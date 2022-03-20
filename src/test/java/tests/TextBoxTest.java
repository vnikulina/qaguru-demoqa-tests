package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void afterAll(){
        Selenide.closeWebDriver();
    }

    @Test
    void successFillTest() {
        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));

        $("#userName").setValue("someName");
        $("#userEmail").setValue("some@mail.com");
        $("#currentAddress").setValue("current address 1");
        $("#permanentAddress").setValue("other address 2");
        $("#submit").click();


        $("#output").shouldHave(text("someName"), text("some@mail.com"),
                text("current address 1"), text("other address 2"));

        System.out.println("Test has passed!");

    }
}
