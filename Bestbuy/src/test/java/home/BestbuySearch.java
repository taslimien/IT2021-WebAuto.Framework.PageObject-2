package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class BestbuySearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.id("gh-search-input")).sendKeys("Iphone12", Keys.ENTER);
        Thread.sleep(4000);
    }
}
