package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EducationInfo {

    WebDriver driver;

    By addEducationButton = By.cssSelector(".btn-sm");
    By country = By.cssSelector("div.form__form-group:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
    By education_type = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By university = By.cssSelector("div.form__form-group:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By department = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By start_date = By.cssSelector(".startTime");
    By graduation_date = By.cssSelector(".endTime");
    By gpa = By.cssSelector("div.form__form-group:nth-child(7) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By save_button = By.cssSelector("button.icon:nth-child(1)");


    public EducationInfo(WebDriver driver){
        this.driver=driver;
    }


    public void clickAdd(){
        driver.findElement(addEducationButton).click();
    }

    public void setCountry(String country1){
        Actions key = new Actions(driver);
        driver.findElement(country).click();
        key.sendKeys(country1).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setEducation_type(String type){
        Actions key = new Actions(driver);
        driver.findElement(education_type).click();
        key.sendKeys(type).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setUniversity(String uni){
        Actions key = new Actions(driver);
        driver.findElement(university).click();
        key.sendKeys(uni).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setDepartment(String department1){
        Actions key = new Actions(driver);
        driver.findElement(department).click();
        key.sendKeys(department1).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setStart_date(String date){
        driver.findElement(start_date).click();
        HomePage.copy(date);
        driver.findElement(start_date).sendKeys(Keys.CONTROL + "v");
        driver.findElement(start_date).sendKeys(Keys.ENTER);
    }

    public void setGraduation_date(String date){
        driver.findElement(graduation_date).click();
        HomePage.copy(date);
        driver.findElement(graduation_date).sendKeys(Keys.CONTROL + "v");
        driver.findElement(graduation_date).sendKeys(Keys.ENTER);
    }

    public void setGpa(String grade){
        Actions key = new Actions(driver);
        driver.findElement(gpa).click();
        key.sendKeys(grade).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void clicksave(){
        driver.findElement(save_button).click();
    }
}
