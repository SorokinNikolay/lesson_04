import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Дано;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefenition"},
        tags = "@jIRA"
)

public class RunnerTest {

    @BeforeEach
    static void beforeTest() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/sorokin/IdeaProjects/lesson_04/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterEach
    static void afterTest() {
        closeWebDriver();
    }

}
