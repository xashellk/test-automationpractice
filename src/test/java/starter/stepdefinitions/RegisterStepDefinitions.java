package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.register.DoRegister;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegisterStepDefinitions {
    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has an load page")
    public void has_an_load_page(String name) {
        this.name = name;
        theActorCalled(this.name).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("she sends their email to validate")
    public void she_sends_their_email_to_validate() {
        theActorCalled(this.name).attemptsTo(
                DoRegister.Register("xashellk3@gmail.com", "Angie","Casas", "password","6","September","1991", "Choucair", "Calle falsa 123", "Calle falsa 456","Bogota","Hawaii","23423","United States", "dfsdfs", "343434", "345345" )
        );
    }
}