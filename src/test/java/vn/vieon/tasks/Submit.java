package vn.vieon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import vn.vieon.ui.LoginForm;

public class Submit {

    public static Performable loginForm() {
        return Task.where("{0} login with phone and password", Click.on(LoginForm.LOGIN_BTN));
    }
}
