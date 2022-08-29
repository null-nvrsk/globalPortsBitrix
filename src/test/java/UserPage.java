import com.codeborne.selenide.Selenide;

/**
 * Страница пользователя в Битрикс24
 */
public class UserPage {
    private final static String USER_URL = "https://bitrix24.globalports.com/company/personal/user/";

    public UserPage(int user_id){
        Selenide.open(USER_URL + user_id + "/");
    }

}
