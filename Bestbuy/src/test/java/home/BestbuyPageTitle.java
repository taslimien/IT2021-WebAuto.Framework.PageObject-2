package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BestbuyPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
