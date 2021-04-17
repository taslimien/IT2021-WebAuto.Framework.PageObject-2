package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class NYPostHomePage extends CommonAPI {

    @Test
    public void home(){
        System.out.println(driver.getTitle());
    }
}
