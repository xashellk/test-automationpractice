package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.payment.DoPayment;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PaymentStepDefinitions {
    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) load and navigate to main page")
    public void load_and_navigate_to_main_page(String name) {
        this.name = name;
        theActorCalled(this.name).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("she test payment flow")
    public void she_test_payment_flow() {
        theActorCalled(this.name).attemptsTo(
                DoPayment.Payment("xashellk@hotmail.com", "123456")
        );
    }

}
