package vn.vieon.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginForm {
    public static Target LOGIN_BTN      = the("Login button").locatedBy(
            "//div[@class = 'button-group child-auto']/a[contains(@class, 'light')]");
    public static Target PHONE_TXTBX    = the("Phone field").locatedBy("#phoneNumber");
    public static Target PASSWORD_TXTBX = the("Password button").locatedBy("#password");
    public static Target ERROR_TXT = the("Password button").locatedBy("//label[contains(@class, 'error')]");
}
