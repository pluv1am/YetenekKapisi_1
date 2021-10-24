package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button.btn:nth-child(1)");
    private By showpass =By.cssSelector(".form__form-group-button");
    private By afterRegsisterMessage = By.className("notification-message");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickshowPass(){
        HomePage.bekle(1000);
        driver.findElement(showpass).click();
    }
    public StudentLoggedInPage clickLoginButton(){
        //HomePage.bekle(2000);
        driver.findElement(loginButton).click();
        return new StudentLoggedInPage(driver);
    }

    public String getMessage(){
        return driver.findElement(afterRegsisterMessage).getText();
    }

}
