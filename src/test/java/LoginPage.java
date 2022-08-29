import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница авторизации Битрикс24
 */
public class LoginPage {
    private final SelenideElement loginInput = $x("//input[@class='login-inp' and @type='text']");
    private final SelenideElement passInput = $x("//input[@class='login-inp' and @type='password']");
    private final SelenideElement LoginButton = $x("//input[@class='login-btn']");


    public LoginPage(String url){
        Selenide.open(url);
    }

    public void login(String login, String password){
        loginInput.sendKeys(login);
        passInput.sendKeys(password);
        LoginButton.click();
    }
}
