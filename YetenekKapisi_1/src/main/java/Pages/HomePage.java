package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class HomePage {

    private  WebDriver driver;
    private  By loginPath = By.cssSelector("button.btn-sm:nth-child(1)");
    private By registerPath = By.cssSelector("button.icon:nth-child(2)");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private void clickLink(By path){
        HomePage.bekle(1000);
        driver.findElement(path).click();
        HomePage.bekle(2000);
    }

    public LoginPage clickLogin(){
        clickLink(loginPath);
        return new LoginPage(driver);
    }

    public StudentRegisterPage clickStuReg(){
        clickLink(registerPath);
        return new StudentRegisterPage(driver);
    }

    public static void bekle(long sure){
        try {
            Thread.sleep(sure);
        }
        catch(InterruptedException e){
        }
    }

    public static void copy(String value) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String text = value;
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, null);
    }

}
