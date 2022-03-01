package stepDefenition;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObject.MainPage;
import pageObject.TaskPage;

import static com.codeborne.selenide.Selenide.*;
import static pageObject.MainPage.*;

public class MainPageSteps {

    @Если("^открыта внутренняя страница (.*)$")
    public static MainPage isOpened(String url) {
        Assert.assertEquals(WebDriverRunner.url(), url);
        return page(MainPage.class);
    }

    @Тогда("^перейти в проект (.*) на страницу (.*)$")
    public MainPage goToPageInProject(String project, String page) {
        getProjectButton().click();
        if (project.equals("test(TEST)")) {
            getTestProjectButton().click();
            if (page.equals("списка задач")) {
                getTasks().shouldHave(Condition.text("Список задач")).click();
            }
        }
        return page(MainPage.class);
    }

    @И("сравнить количество задач в проекте и вывести их на экран")
    public MainPage compareTasks() {

        int pval = Integer.parseInt(getProblemValue().text().split(" ")[0]);
        System.out.println("Количество задач в шапке проекта = " + pval);

        int xval = $$(By.xpath("//div[@class='ghx-issue-content']")).size();
        System.out.println("Количество заведённых задач = " + xval);

        Assert.assertEquals(pval, xval);
        return page(MainPage.class);
    }

    @Тогда("создать задачу и перейти в неё")
    public TaskPage createAndGoToTask() {
        getCreateButton().click();
        getTopic().setValue("Сорокин Николай");
        $(By.xpath("//*[@id='aui-uid-1']")).click();
        getDescription().setValue("Тестовое описание");
        getCreateTaskButton().click();

        $(By.xpath("//*[@id='aui-flag-container']//a")).click();
        return page(TaskPage.class);
    }
}
