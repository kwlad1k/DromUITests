package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@DisplayName("Тесты авторизации")
public class AuthDromTests extends TestBase {

    MainPage mainPage = new MainPage();

    TestData testData = new TestData();

    @Test
    @Owner("Kwlad1ck")
    @Severity(SeverityLevel.BLOCKER)
    @Tags({
            @Tag("Positive"),
            @Tag("SMOKE"),
            @Tag("Authorization")
    })
    @DisplayName("Проверка успешной авторизации пользователя")
    void successfulAuthTest() {
        mainPage.openPage()
                .clickAuthBtn()
                .setAuthData(testData.userName, testData.userPassword)
                .clickSignBtn()
                .checkAuthUserElement();
    }

    @Test
    @Owner("Kwlad1ck")
    @Tags({
            @Tag("NegativeAuth"),
            @Tag("SMOKE"),
            @Tag("Authorization")
    })
    @DisplayName("Негативаня проверка авторизации с некорректными данными")
    void negativeAuthTest() {
        mainPage.openPage()
                .clickAuthBtn()
                .setAuthData(testData.randomEmail, testData.randomPassword)
                .clickSignBtn()
                .checkAuthErrors();
    }
}
