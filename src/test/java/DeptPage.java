import com.codeborne.selenide.Selenide;

/**
 * Страница отдела в Битрикс24
 */
public class DeptPage {
    private final static String DEPT_URL = "https://bitrix24.globalports.com/company/structure.php?set_filter_structure=Y&structure_UF_DEPARTMENT=";

    public DeptPage(int dept_id){
        Selenide.open(DEPT_URL + dept_id);
    }

}
