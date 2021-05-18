package vn.vieon.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class NavBar {
    public static Target PROFILE_AVATAR = the("Login button").locatedBy(
            "//button[@class = 'avatar button']/parent::li");
}
