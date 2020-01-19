package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeeDashboard extends TestBase {
    public EmployeeDashboard() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//li[@id='menu_admin_viewAdminModule'")
    public WebElement

}
