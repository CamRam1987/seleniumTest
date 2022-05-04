import POM.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.nio.file.Paths;

public class firstTest{
        public static void main(String[] args) throws InterruptedException {

        String path= Paths.get(System.getProperty("user.dir"),"src/main/resources/chromedriver_win32 (4)/chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver",path.toString());
        String [] array;
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement searchBar=driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchBtn=driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchBar.click();
        searchBar.sendKeys("shoes");
        searchBtn.click();
        Thread.sleep(2000);
        WebElement adidasCheckbox=driver.findElement(By.xpath("//input[@aria-label='adidas']"));
        adidasCheckbox.click();
        WebElement count=driver.findElement(By.cssSelector("div[class='srp-controls__control srp-controls__count'] span:nth-child(1)"));
        String totalString=count.getText();
        float f=Float.parseFloat(totalString)*1000;
        if(f>2000){
            Assert.assertTrue(true,"The Adidas shoes quantity is greater than 2000");
        }else{
            Assert.assertTrue(false,"The Adidas shoes quantity is not greater than 2000");
        }
        driver.quit();


    }
}
