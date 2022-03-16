package stepDefenition;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import pageObject.AuthorizationPage;

import static com.codeborne.selenide.Selenide.page;
import static pageObject.AuthorizationPage.*;

public class AuthorizationPageSteps {

    @Допустим("^открыта страница (.*)$")
    public AuthorizationPage openJira(String url) {
        Selenide.open(url);
        return page(AuthorizationPage.class);
    }

    @Дано("^логин  - (.*) и пароль - (.*)$")
    public AuthorizationPage inputLoginAndPassword(String login, String password) {
        String currentLogin = login.substring(1,login.length()-1);
        String currentPassword = password.substring(1,password.length()-1);
        AuthorizationPage.getLoginField().sendKeys(currentLogin);
        getLoginField().pressTab();
        getPasswordField().sendKeys(currentPassword);
        return page(AuthorizationPage.class);
    }

    @И("кнопка входа нажата")
    public AuthorizationPage clickLoginButton() {
        getLoginButton().click();
        return page(AuthorizationPage.class);
    }


}
