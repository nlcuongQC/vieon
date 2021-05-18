package vn.vieon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import vn.vieon.ui.WelcomeModal;

public class OpenForm {

    public static Performable loginForm() {
        return Task.where("{0} open login form", Click.on(WelcomeModal.LOGIN_REG_BTN));
    }
}
