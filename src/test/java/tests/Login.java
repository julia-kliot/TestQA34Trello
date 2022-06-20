package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @Test
    public  void login1(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew","C:/Users/julia/Documents/QA/QA_Automation/QA/TestQA34Trello/chromedriver.exe");
        //System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }

}
