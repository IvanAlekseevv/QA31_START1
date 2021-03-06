package firstProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test_1 {
    WebDriver wd;

    @BeforeMethod
public void Precondition() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");


    }
@Test
        public void testNew(){
        //WebElement el = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        //WebElement e3 = wd.findElement(By.className("btn btn-sm btn-link text-primary"));
        //WebElement link = wd.findElement(By.linkText("Sign Up")); сайт русский он не будет работать
        //WebElement partLink = wd.findElement(By.partialLinkText("Sign"));
        List<WebElement> ael = wd.findElements(By.tagName("a"));
        System.out.println(ael.size());
        WebElement eln = wd.findElement(By.tagName("input"));
        eln.click();
        eln.clear();
        eln.sendKeys("aleksivan060@gmail.com");

}

@AfterMethod
    public void close(){
        wd.close();
        wd.quit();
}

}