package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRegister implements Task {
    private final String email;
    private final String firstname;
    private final String lastname;
    private final String password;
    private final String day;
    private final String month;
    private final String year;
    private final String company;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String postcode;
    private final String country;
    private final String other;
    private final String phone;
    private final String mobilephone;

    public DoRegister(String email, String firstname, String lastname, String password, String day, String month, String year, String company, String address1, String address2, String city, String state, String postcode, String country, String other, String phone, String mobilephone ) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.other = other;
        this.phone = phone;
        this.mobilephone = mobilephone;
    }

    public static Performable Register(String email, String firstname, String lastname, String password, String day, String month, String year, String company, String address1, String address2, String city, String state, String postcode, String country, String other, String phone, String mobilephone){
        return instrumented(starter.register.DoRegister.class, email, firstname, lastname, password, day, month, year, company, address1, address2, city, state, postcode, country, other, phone, mobilephone );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ValidEmailForm.SIGN_IN_BUTTON),
                Enter.theValue(email).into(ValidEmailForm.EMAIL_FIELD),
                Click.on(ValidEmailForm.BUTTON_FIELD),
                Click.on(RegisterForm.TITLE_RADIO_BUTTON),
                Enter.theValue(firstname).into(RegisterForm.FIRST_NAME_FIELD),
                Enter.theValue(lastname).into(RegisterForm.LAST_NAME_FIELD),
                Enter.theValue(password).into(RegisterForm.PASSWORD_FIELD),
                Enter.theValue(day).into(RegisterForm.DAY_DATE_BIRTH_SELECT),
                Enter.theValue(month).into(RegisterForm.MONTH_DATE_BIRTH_SELECT),
                Enter.theValue(year).into(RegisterForm.YEAR_DATE_BIRTH_SELECT),
                Click.on(RegisterForm.SING_UP_CHECKBOX_BUTTON),
                Click.on(RegisterForm.RECEIVE_CHECKBOX_BUTTON),
                Enter.theValue(company).into(RegisterForm.COMPANY_FIELD),
                Enter.theValue(address1).into(RegisterForm.ADDRESS1_FIELD),
                Enter.theValue(address2).into(RegisterForm.ADDRESS2_FIELD),
                Enter.theValue(city).into(RegisterForm.CITY_FIELD),
                Enter.theValue(state).into(RegisterForm.STATE_SELECT),
                Enter.theValue(country).into(RegisterForm.COUNTRY_SELECT),
                Enter.theValue(postcode).into(RegisterForm.POST_CODE_FIELD),
                Enter.theValue(other).into(RegisterForm.OTHER_FIELD),
                Enter.theValue(phone).into(RegisterForm.HOME_PHONE_FIELD),
                Enter.theValue(mobilephone).into(RegisterForm.MOBILE_PHONE_FIELD),
                Click.on(RegisterForm.REGISTER_BUTTON)
        );
    }
}