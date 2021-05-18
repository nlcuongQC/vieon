package vn.vieon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import vn.vieon.ui.LoginForm;

public class FillLoginForm {

    public static Performable with(String phoneNumber, String password) {
        return Task.where("{0} login with phone and password",
                          Enter.theValue(phoneNumber).into(LoginForm.PHONE_TXTBX),
                          Enter.theValue(password).into(LoginForm.PASSWORD_TXTBX)
                         );
    }
}
