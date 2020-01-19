package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashboard;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {

    HomePage homePage;
    EmployeeDashboard employeeDashboard;

    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboard=new EmployeeDashboard();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void verifyHomeTitle(){
        SeleniumUtils.waitForVisibilityOfElement(homePage.logIn_Btn);
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test
    public void testLogInBtn(){
        SeleniumUtils.click(homePage.logIn_Btn);
        String expectedTitle = "Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(employeeDashboard.dashboardTitle),expectedTitle);
    }

}
