package vn.vieon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.vieon.tasks.Hover;
import vn.vieon.ui.ProfilePane;

import static vn.vieon.ui.Alert.ALERT_TXT;

public class Alert implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ALERT_TXT).viewedBy(actor).asString();
    }

    public static Alert text() {
        return new Alert();
    }
}
