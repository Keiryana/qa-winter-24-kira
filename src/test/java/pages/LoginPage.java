package pages;

import org.openqa.selenium.By;

public class LoginPage {
    private final By REGISTRATION_LINK = By.xpath(".//p[@class ='users-session-form__signup']/a");
    private BaseFunc baseFunc;


    public LoginPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void openRegistationPage() {
        baseFunc.hardClick(baseFunc.findElement(REGISTRATION_LINK));

    }

}
