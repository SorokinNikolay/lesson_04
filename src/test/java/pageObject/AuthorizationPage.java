package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;


public class AuthorizationPage {

    @FindBy(xpath = "//*[@id='login-form-username']")
    private static SelenideElement loginField;

    public static SelenideElement getLoginField() {
        return loginField;
    }

    @FindBy(xpath = "//*[@id='login-form-password']")
    private static SelenideElement passwordField;

    public static SelenideElement getPasswordField() {
        return passwordField;
    }

    @FindBy(xpath = "//*[@id='login-form-submit']")
    private static SelenideElement loginButton;

    public static SelenideElement getLoginButton() {
        return loginButton;
    }

}
