package Journeys;

import BaseFramework.BaseClass;
import Page_Objects.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reports.ExtentList.class)
public class Investec_Testcase extends BaseClass {

    @Test
    public void TestScenario1() throws InterruptedException {

        Investec_Homp_Page.ClickFocuslink();
        Investec_Focus_Page.ClickMyMoneylink();
        Investec_My_Money_Page.Click_Understanding_Cash_req();
        Investec_My_Money_Page.clickCloseCookiesbtn();
        Investec_My_Money_Page.ClickSignUp();
        Investec_My_Money_Page.Enter_Input_details("Test Name","Test Surname"," test@investec.co.za");
        Investec_My_Money_Page.ClickMyself();
        Investec_My_Money_Page.ClickSubmitBtn();
        Investec_My_Money_Page.VerifySignedupSuccessfully();

    }


}
