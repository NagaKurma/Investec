package Page_Objects;

import BaseFramework.BaseClass;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import static Reports.ExtentList.test;

public class Investec_Homp_Page extends BaseClass {

    static By Focus = By.xpath("//a[@data-di-id='di-id-884c90c-2862c1d6']");

    public static void ClickFocuslink() throws InterruptedException {
        driver.findElement(Focus).click();
        Thread.sleep(10000);
        test.log(Status.PASS,"Navigated to Focus Page");
    }
}
