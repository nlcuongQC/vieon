package vn.vieon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class WelcomeModal {
    public static Target LOGIN_REG_BTN = the("Login/Register button").locatedBy("//button[contains(@class, 'light')]");
}
