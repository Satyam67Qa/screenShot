package org.screenshotusingtestngg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ScreenShotTest extends Base{

    @BeforeMethod
    public void setUp(){
        initilaization();
    }

    @Test
    public void loginTest(){

        Assert.assertEquals(true,true);
    }
    @Test
    public void searchTest(){

        Assert.assertEquals(false,true);
    }
    @Test
    public void createDealTest(){

        Assert.assertEquals(false,true);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
