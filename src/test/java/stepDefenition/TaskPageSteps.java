package stepDefenition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Также;
import pageObject.TaskPage;

import java.util.Locale;

import static pageObject.TaskPage.*;

import static com.codeborne.selenide.Selenide.page;

public class TaskPageSteps {
    @И("назначить статус \"в работе\"")
    public TaskPage inProgress() {
        getInProgressButton().click();
        return page(TaskPage.class);
    }

    @Также("назначить статус \"готово\"")
    public TaskPage done() {
        getBusinessProcessButton().click();
        getDoneButton().click();
        return page(TaskPage.class);
    }

    @И("^проверить, что статус задачи (.*)$")
    public TaskPage statusIsDone(String status) {
        String currentStatus = status.substring(1, status.length()-1).toUpperCase();
        getStatus().shouldBe(Condition.text(currentStatus));
        return page(TaskPage.class);
    }
}
