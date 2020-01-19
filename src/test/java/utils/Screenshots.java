package utils;

import base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshots extends TestBase {
    public static void captureScreenShot(WebDriver driver, String screenshotName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("./src/test/java/Jsenzano/resources/screenshots" + screenshotName + ".jpeg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
