package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EbaySearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);

    }
}
