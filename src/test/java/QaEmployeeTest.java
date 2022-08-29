import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;

public class QaEmployeeTest {

    private final static String BASE_URL = "https://bitrix24.globalports.com/";
    private final static String USER_LOGIN = "skomorokhov.maksim";
    private final static String USER_PASSWORD = "2Skm2105";
    private final SelenideElement userNameText = $x("//span[@id='user-name']");

    @Test
    public void checkLogin(){
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.login(USER_LOGIN, USER_PASSWORD);
        Assert.assertTrue(userNameText.exists());
    }

}
