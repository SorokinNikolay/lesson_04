package hooks;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WebHooks {

    @BeforeEach
    static void beforeTest() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterEach
    static void afterTest() {
        closeWebDriver();
    }

}
