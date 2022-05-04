package POM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testEbay{
    private WebDriver driver;
    Base base=new Base(driver);
    searchPage sp=new searchPage(driver);
    filterPage fp=new filterPage(driver);
    @BeforeTest
    public void setup(){
        base=new Base(driver);
        driver=base.ChromeDriverConnection();
        base.getPage("https://www.ebay.com/");
    }
    @AfterTest
    public void teardown(){
        //driver.quit();
    }
    @Test
    public void prueba() throws InterruptedException {
        sp.search();
        String t=fp.comparison();
        Float f=fp.conversion(t);
        if(f>2000){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }






}
