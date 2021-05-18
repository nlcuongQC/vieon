package vn.vieon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import vn.vieon.ui.NavBar;

public class Hover {

    public static Performable profile() {
        return Task.where("{0} hover the profile avatar", MoveMouse.to(NavBar.PROFILE_AVATAR));
    }
}
