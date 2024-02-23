import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InternetShopAsTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");
    private final String SECTION = "Instrumenti";


    @Test
    public void productPresenceCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://1a.lv");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        //find element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);

        //click on this element
        acceptBtn.click();

        // Find all sections

        WebElement menuBlock = browser.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM);



        boolean isSectionFound = false;
        for (WebElement we : items) {
           if (we.getText().equals(SECTION)) {
               wait.until(ExpectedConditions.elementToBeClickable(we));
               isSectionFound = true;
               we.click();
               break;
           }
        }

            Assertions.assertTrue(isSectionFound, "Section is not found!");



    }
}







