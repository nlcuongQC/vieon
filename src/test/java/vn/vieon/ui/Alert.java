package vn.vieon.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class Alert {
    public static final Target ALERT_TXT = the("Alert modal").locatedBy("//div[@role= 'alert']");
}
