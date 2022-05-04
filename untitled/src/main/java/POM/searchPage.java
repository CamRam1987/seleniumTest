package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchPage extends Base{
    By searchBar= By.xpath("//input[@id='gh-ac']");
    By searchBtn= By.xpath("//input[@id='gh-btn']");


    public searchPage(WebDriver driver) {
        super(driver);
    }
    public void search() throws InterruptedException {
        Thread.sleep(2000);
        click(searchBar);
        type("Shoes",searchBar);
        click(searchBtn);

    }
}
