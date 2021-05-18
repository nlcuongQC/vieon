package vn.vieon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static vn.vieon.ui.Alert.ALERT_TXT;

public class TurnOff {

    public static Performable alert() {
        return Task.where("{0} turn off the alert", Click.on(ALERT_TXT));
    }
}
