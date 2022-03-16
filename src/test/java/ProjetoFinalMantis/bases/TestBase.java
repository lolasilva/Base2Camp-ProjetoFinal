package ProjetoFinalMantis.bases;

import ProjetoFinalMantis.pages.LoginPage;
import ProjetoFinalMantis.tests.LoginTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static WebDriver driver;
    LoginTests loginTests;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();

    }


    @AfterClass
    public static void stop(){
        //driver.quit();
    }
}
