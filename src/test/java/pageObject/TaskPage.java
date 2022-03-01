package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class TaskPage extends MainPage {

    @FindBy(xpath = "//*[@id='action_id_21']/span")
    private static SelenideElement inProgressButton;

    public static SelenideElement getInProgressButton() {
        return inProgressButton;
    }

    @FindBy(xpath = "//*[@id='opsbar-transitions_more']/span")
    private static SelenideElement businessProcessButton;

    public static SelenideElement getBusinessProcessButton() {
        return businessProcessButton;
    }

    @FindBy(xpath = "//*[@id='action_id_31']/span")
    private static SelenideElement doneButton;

    public static SelenideElement getDoneButton() {
        return doneButton;
    }

    @FindBy(xpath = "//*[@id='status-val']/span")
    private static SelenideElement status;

    public static SelenideElement getStatus() {
        return status;
    }
}
