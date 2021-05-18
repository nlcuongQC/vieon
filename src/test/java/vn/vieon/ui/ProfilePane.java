package vn.vieon.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProfilePane {
    public static final Target PHONE_TXT       = the("Phone number").locatedBy("//div[@class = 'pane__header']//span");
    public static final Target ACCOUNT_SETTING = the("Account and Setting").locatedBy(
            "//a[@title = 'Tài khoản và Cài đặt']");
}
