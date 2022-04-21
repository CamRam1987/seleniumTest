import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        System.setProperties();
        driver.get("https://www.saucedemo.com/");
        String title= driver.getTitle();
        WebElement user = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        user.sendKeys("standard_user");

    }
}
