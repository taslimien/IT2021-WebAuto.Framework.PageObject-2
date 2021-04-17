package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlibabaPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String expectedTitle = "Alibaba.com: Manufacturers, Suppliers, Exporters & Importers from the world's largest online B2B marketplace";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
