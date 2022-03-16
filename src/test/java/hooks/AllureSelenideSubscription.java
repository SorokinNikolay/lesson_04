package hooks;

import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class AllureSelenideSubscription {
    @Before
    public static void allureSubThreadParallel() {
        new AllureSelenide()
                .screenshots(true)
                .savePageSource(false);
    }
}
