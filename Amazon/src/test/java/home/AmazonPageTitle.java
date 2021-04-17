package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
