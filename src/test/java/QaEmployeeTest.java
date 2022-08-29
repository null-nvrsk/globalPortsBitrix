import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class QaEmployeeTest {

    private final static String BASE_URL = "https://bitrix24.globalports.com/";
    private final static String USER_LOGIN = "skomorokhov.maksim";
    private final static String USER_PASSWORD = "2Skm2105";


    @Test
    public void checkLogin(){
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.login(USER_LOGIN, USER_PASSWORD);

        SelenideElement userNameText = $x("//span[@id='user-name']");
        Assert.assertTrue(userNameText.exists());
    }

    @Test
    public void checkDept578() {
        DeptPage deptPage = new DeptPage(578);

        // Должен быть 1 тестировщик
        ElementsCollection testers = $$x("//table[@id='employee-table']//div[@class='employee-post' and contains(.,'Тестировщик')]");
        Assert.assertEquals(1, testers.size());
    }

    @Test
    public void checkDept577() {
        DeptPage deptPage = new DeptPage(577);

        // Должно быть 3 тестировщика
        ElementsCollection testers = $$x("//table[@id='employee-table']//div[@class='employee-post' and contains(.,'инженер по качеству')]");
        Assert.assertEquals(3, testers.size());
    }

    @Test
    public void checkUser1706() {
        UserPage userPage = new UserPage(1706);
        switchTo().frame($("[class='side-panel-iframe']"));

        SelenideElement userNameText = $x("//span[@id='pagetitle']/span[contains(.,'Марина Полесова')]");
        Assert.assertTrue(userNameText.exists());
    }

    @Test
    public void checkUser1427() {
        UserPage userPage = new UserPage(1427);
        switchTo().frame($("[class='side-panel-iframe']"));

        SelenideElement userNameText = $x("//span[@id='pagetitle']/span[contains(.,'Анастасия Дейкун')]");
        Assert.assertTrue(userNameText.exists());
    }

    @Test
    public void checkUser1120() {
        UserPage userPage = new UserPage(1120);
        switchTo().frame($("[class='side-panel-iframe']"));

        SelenideElement userNameText = $x("//span[@id='pagetitle']/span[contains(.,'Анна Бибина')]");
        Assert.assertTrue(userNameText.exists());
    }
    @Test
    public void checkUser1118() {
        UserPage userPage = new UserPage(1118);
        switchTo().frame($("[class='side-panel-iframe']"));

        SelenideElement userNameText = $x("//span[@id='pagetitle']/span[contains(.,'Екатерина Бессмертная')]");
        Assert.assertTrue(userNameText.exists());
    }
}
