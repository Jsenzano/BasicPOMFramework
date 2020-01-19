package pages;
import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "btnLogin")
    public WebElement logIn_Btn;
}