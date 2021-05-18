package vn.vieon.features.login;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.vieon.questions.Alert;
import vn.vieon.questions.ProfilePanePhone;
import vn.vieon.tasks.*;

import java.util.Arrays;
import java.util.Collection;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityParameterizedRunner.class)
public class LoginValidStory {

    private final String phone;
    private final String password;

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    Actor john = Actor.named("John");

    ProfilePanePhone profilePanePhone = new ProfilePanePhone();

    public LoginValidStory(String phone, String password) {
        this.phone    = phone;
        this.password = password;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{{"0932028646", "123456"}});
    }

    @Before
    public void john_prepare_to_login() {
        john.can(BrowseTheWeb.with(hisBrowser));

        givenThat(john).wasAbleTo(OpenPage.homePage());

        and(john).attemptsTo(OpenForm.loginForm());
    }

    @Test
    @WithTag("login")
    public void john_login_with_valid_phone_and_password() {
        when(john).attemptsTo(FillLoginForm.with(phone, password), Submit.loginForm());

        then(john).should(seeThat(Alert.text(), is("Chào mừng bạn trở lại VieON")));
        and(john).attemptsTo(TurnOff.alert());
        and(john).should(seeThat(profilePanePhone, is(phone)).whenAttemptingTo(Hover.profile()));
    }
}