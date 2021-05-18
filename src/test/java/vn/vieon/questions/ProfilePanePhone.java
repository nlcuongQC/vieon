package vn.vieon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.vieon.tasks.Hover;
import vn.vieon.ui.LoginForm;
import vn.vieon.ui.ProfilePane;

public class ProfilePanePhone implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProfilePane.PHONE_TXT).viewedBy(actor).asString();
    }
}
