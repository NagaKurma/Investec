package Page_Objects;

import BaseFramework.BaseClass;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import static Reports.ExtentList.test;

public class Investec_Focus_Page extends BaseClass {

    static By My_Money = By.xpath("//a[@data-di-id='di-id-26c0163d-b4c00d77']");

    public static void ClickMyMoneylink() throws InterruptedException {
        driver.findElement(My_Money).click();
        Thread.sleep(3000);
        test.log(Status.PASS,"Navigated to My Money Page");
    }
}
