package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WalmartPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String exceptedTitle = "Walmart.com | Save Money. Live Better.";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(exceptedTitle, actualTitle);
    }
}
