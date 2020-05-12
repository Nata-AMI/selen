package ru.netology.seleny;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

 class SelenTest {
     @org.junit.jupiter.api.Test
    void shouldTest() {
        open("http://localhost:9999");
        SelenideElement form = $("[data-test-id = app-order]");
        form.$("[data-test-id='name'] input").setValue("Мария Иванова");
        form.$("[data-test-id='phone'] input").setValue("+79001010010");
        form.$("[data-test-id=agreement]").click();
        $("success").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
