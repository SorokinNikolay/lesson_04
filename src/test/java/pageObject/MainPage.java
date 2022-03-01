package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//*[@id='browse_link']")
    private static SelenideElement projectButton;

    public static SelenideElement getProjectButton() {
        return projectButton;
    }

    @FindBy(xpath = "//*[@id='admin_main_proj_link_lnk']")
    private static SelenideElement testProjectButton;

    public static SelenideElement getTestProjectButton() {
        return testProjectButton;
    }

    @FindBy(xpath = "//*[@id='ghx-content-group']//div[@class='ghx-issue-count']")
    private static SelenideElement problemValue;

    public static SelenideElement getProblemValue() {
        return problemValue;
    }

    @FindBy(xpath = "//*[@id='content']//a[@class='aui-nav-item ']")
    private static SelenideElement tasks;

    public static SelenideElement getTasks() {
        return tasks;
    }

    @FindBy(xpath = "//*[@id='create_link']")
    private static SelenideElement createButton;

    public static SelenideElement getCreateButton() {
        return createButton;
    }

    @FindBy(xpath = "//*[@id='summary']")
    private static SelenideElement topic;

    public static SelenideElement getTopic() {
        return topic;
    }

    @FindBy(xpath = "//*[@id='description']")
    private static SelenideElement description;

    public static SelenideElement getDescription() {
        return description;
    }

    @FindBy(xpath = "//*[@id='create-issue-submit']")
    private static SelenideElement createTaskButton;

    public static SelenideElement getCreateTaskButton() {
        return createTaskButton;
    }

}
