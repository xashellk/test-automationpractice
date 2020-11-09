package starter.payment;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import starter.login.DoLogin;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoPayment implements Task{
    private final String username;
    private final String password;

    public DoPayment(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable Payment(String username, String password){
        return instrumented(DoPayment.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Sleeve").into(PaymentForm.SEARCH_FIELD),
                Click.on(PaymentForm.SEARCH_BUTTON),
                Click.on(PaymentForm.PRODUCT_BUTTON),
                Click.on(PaymentForm.ADD_TO_CART_BUTTON),
                WaitUntil.the(PaymentForm.PROCEED_TO_CHECKOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_BUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_2_BUTTON),
                // Click.on(PaymentForm.SIGN_IN_BUTTON),
                Enter.theValue(username).into(PaymentForm.USERNAME_FIELD),
                Enter.theValue(password).into(PaymentForm.PASSWORD_FIELD),
                Click.on(PaymentForm.LOGIN_BUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_3_BUTTON),
                Click.on(PaymentForm.CHECKBUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_4_BUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_5_BUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_6_BUTTON),
                Click.on(PaymentForm.PROCEED_TO_CHECKOUT_7_BACK)
        );
    }
}
