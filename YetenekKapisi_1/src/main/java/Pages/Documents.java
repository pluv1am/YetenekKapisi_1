package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Documents {

    WebDriver driver;
    By add_document_button = By.cssSelector(".btn-sm");
    By document_type = By.cssSelector(".css-tr8wj9-placeholder");
    By name = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By document = By.cssSelector("div.form__form-group:nth-child(4)");
    By save_button= By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");

    public Documents(WebDriver driver){
        this.driver=driver;
    }

    public void click_add_button(){
        driver.findElement(add_document_button).click();
    }

    public void setDocument_type(String type){
        driver.findElement(document_type).click();
        Actions key = new Actions(driver);
        key.sendKeys(type).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setName(String name1){
        driver.findElement(name).sendKeys(name1);
    }

    public void setDocument(String path){
        driver.findElement(document).sendKeys(path);
    }

    public void click_save_button(){
        driver.findElement(save_button).click();
    }



}
