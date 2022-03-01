package stepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import java.util.List;

public class CalculatorSteps {

    int a;
    int b;
    List<Integer> list;
    float result;
    String action;

    @Дано("^два числа (.*) и (.*)$")
    public void given(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Дано("^список чисел")
    public void givenList(List<Integer> list) {
        this.list = list;
    }

    @Тогда("^находим (.*) этих чисел$")
    public void result(String action) {
        this.action = action.substring(0, 1).toUpperCase() + action.substring(1);
        switch (action) {
            case "сумму":
                this.action = "Сумма";
                this.result = a + b;
                break;
            case "произведение":
                this.result = a * b;
                break;
            case "разность":
                this.result = a - b;
                break;
            case "частное":
                this.result = (float) a / b;
                break;
        }
    }

    @Тогда("^находим (.*) списка чисел")
    public void listResult(String action) {
        switch (action) {
            case "сумму":
                this.action = "Сумма";
                for (Integer integer : this.list) {
                    this.result += integer;
                }
                break;
            case "произведение":
                this.action = "Произведение";
                this.result = 1;
                for (Integer integer : this.list) {
                    this.result *= integer;
                }
                break;
        }
    }

    @И("выводим результат на экран")
    public void printResult() {
        if (this.action.equals("Частное")) {
            System.out.println(action + " чисел " + a + " и " + b + " равняется " + result);
            System.out.println();
        } else {
            System.out.println(action + " чисел " + a + " и " + b + " равняется " + Math.round(result));
            System.out.println();
        }
    }

    @И("выводим результат работы со списком на экран")
    public void printListResult() {
        System.out.println(action + " чисел из списка равняется " + Math.round(this.result));
        System.out.println();
    }

}
