package pages;

import org.junit.jupiter.api.Test;

public class RegistrationsTests {

    @Test
    public void registrationFormCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.lv");


        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.openLoginPage();

        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.openRegistationPage();

//        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
//        registrationPage.fillInRegistrationForm("Dmitrijs")

    }
}
