package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class WalmartSearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException{
        driver.findElement(By.id("global-search-input")).sendKeys("mouse", Keys.ENTER);
        Thread.sleep(2000);

    }
}
