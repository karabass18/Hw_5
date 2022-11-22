package Pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultTab {
    public void checkResultTabAppear() {
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    }
    public void checkResultTab(String key, String value){
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }
}
