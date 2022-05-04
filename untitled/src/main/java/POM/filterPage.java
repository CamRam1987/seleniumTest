package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filterPage extends Base{
    By adidasCheckbox= By.xpath("//input[@aria-label='adidas']");
    By count=By.cssSelector("div[class='srp-controls__control srp-controls__count'] span:nth-child(1)");

    public filterPage(WebDriver driver) {
        super(driver);
    }
    public void filter(){
        click(adidasCheckbox);

    }
    public String comparison(){
       String text=getText(count);
        return text;
    }
    public Float conversion(String text){
        float f=Float.parseFloat(text)*1000;
        return f;
    }
}
