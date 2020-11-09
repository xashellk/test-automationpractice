package starter.payment;

import org.openqa.selenium.By;

public class PaymentForm {
    public static By SEARCH_FIELD = By.xpath("//*[@id=\"search_query_top\"]");
    public static By SEARCH_BUTTON = By.xpath("//*[@id=\"searchbox\"]/button");
    public static By PRODUCT_BUTTON = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a");
    public static By ADD_TO_CART_BUTTON = By.xpath("//*[@id=\"add_to_cart\"]/button");
    public static By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    public static By PROCEED_TO_CHECKOUT_2_BUTTON = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    public static By SIGN_IN_BUTTON = By.className("login");
    public static By USERNAME_FIELD = By.id("email");
    public static By PASSWORD_FIELD = By.id("passwd");
    public static By LOGIN_BUTTON = By.id("SubmitLogin");
    public static By PROCEED_TO_CHECKOUT_3_BUTTON = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    public static By CHECKBUTTON = By.id("cgv");
    public static By PROCEED_TO_CHECKOUT_4_BUTTON = By.xpath("//*[@id=\"form\"]/p/button");
    public static By PROCEED_TO_CHECKOUT_5_BUTTON = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    public static By PROCEED_TO_CHECKOUT_6_BUTTON = By.xpath("//*[@id=\"cart_navigation\"]/button");
    public static By PROCEED_TO_CHECKOUT_7_BACK = By.xpath("//*[@id=\"center_column\"]/p/a");
}
