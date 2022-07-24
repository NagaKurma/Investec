package Page_Objects;

import BaseFramework.BaseClass;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Reports.ExtentList.test;

public class Investec_My_Money_Page extends BaseClass {

    static By UnderStanding_Cash_Req = By.xpath("(//a[@ng-href=\"/en_za/focus/money/understanding-interest-rates.html\"])[2]");
    //static By SignUp_Btn = By.xpath("//*[@id=\"content\"]/div[7]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/button");
    static By SignUp_Btn = By.xpath("//button[text()[normalize-space()='Sign up']]");
    static By Name = By.xpath("/html/body/div[2]/div[3]/div[7]/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[1]/text-input/div/div[1]/input");
    static By Surname = By.xpath("//input[@name=\"surname\"]");
    static By Email = By.xpath("//input[@name=\"email\"]");
    static By MyselfCheckbox = By.xpath("//button[@class='checkbox-input__trigger-button checkbox-input__trigger-button--first-child']");
    static By SubmitBtn =By.xpath("//button[@class='forms__submit cta-primary']");
    static By Result=By.xpath("//h3[text()='Thank you']");
    static By CloseCoookiesbtn=By.xpath("//button[@class=\"js-alerts-close alerts-top__close\"]");

    public static void Click_Understanding_Cash_req() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(UnderStanding_Cash_Req));
        Thread.sleep(1000);
        driver.findElement(UnderStanding_Cash_Req).click();
        Thread.sleep(1500);
        test.log(Status.PASS,"Navigated to Understanding Interest Rates Page");

    }
    public static void ClickSignUp() throws InterruptedException {
        WebElement element = driver.findElement(SignUp_Btn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        test.log(Status.PASS, "Sign Up Button Clicked");

        WebElement element2 = driver.findElement(By.xpath("//h2[text()='Is your business cash investment yielding positive returns? Make sure you’re investing in flexible cash investment products offering competitive returns.']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(2000);



    }
    public static void Enter_Input_details(String name,String surname,String email) throws InterruptedException {


        Actions act = new Actions(driver);
        //System.out.println(driver.findElement(By.xpath("//div[@class=\"content-hub-form-container__content component-bordered component-bordered--small\"]")).getText());
        //act.moveToElement(driver.findElement(By.xpath("//div[@class=\"content-hub-form-container__content component-bordered component-bordered--small\"]")));
       // act.moveToElement(driver.findElement(By.xpath("//div[@ng-controller=\"ChFormContainerCtrl as container\"]")));
       //act.moveToElement(driver.findElement(By.xpath("//div[@class=\"col-12 col-lg-8\"]")));
      // act.moveToElement(driver.findElement(By.xpath("/html/body")));

        //driver.switchTo().frame("iframewrap");
        //driver.findElement(By.xpath("//*[@id=\"iframewrap\"]"));



        Thread.sleep(1000);

        driver.findElement(Name).sendKeys(name);
        test.log(Status.PASS, "Name Entered");
        driver.findElement(Surname).sendKeys(surname);
        test.log(Status.PASS, "Surname Entered");
        driver.findElement(Email).sendKeys(email);
        test.log(Status.PASS, "Email Entered");
    }

    public static void ClickMyself(){
        driver.findElement(MyselfCheckbox).click();
        test.log(Status.PASS,"Myself check box checked");
    }

    public static void ClickSubmitBtn() throws InterruptedException {
        driver.findElement(SubmitBtn).click();
        Thread.sleep(5000);
        test.log(Status.PASS,"Submit Button Clicked");
    }
    public static void VerifySignedupSuccessfully(){
        String actual = driver.findElement(Result).getText();
        String expected = "Thank you";
        boolean b = actual.equalsIgnoreCase(expected);
        Assert.assertTrue(b);
    }

    public static void clickCloseCookiesbtn() throws InterruptedException {
        driver.findElement(CloseCoookiesbtn).click();
        Thread.sleep(2000);
        test.log(Status.PASS,"Cookies pop up closed.");
    }

}
