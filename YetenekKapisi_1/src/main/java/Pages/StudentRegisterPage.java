package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StudentRegisterPage {

    private WebDriver driver;
    private By nameField = By.name("name");
    private By surnameField = By.name("surname");
    private By emailField = By.name("email");
    private By phoneCountryField = By.cssSelector("div.form__form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)");
    private By phoneField = By.name("phoneDto.number");
    private By countryField = By.cssSelector("div.form__form-group:nth-child(7) > div:nth-child(2)");
    private By educationtypeField = By.cssSelector("div.form__form-group:nth-child(8) > div:nth-child(2)");
    private By universityField = By.cssSelector("div.form__form-group:nth-child(9) > div:nth-child(2)");
    private By departmentField = By.cssSelector("div.form__form-group:nth-child(10) > div:nth-child(2)");
    private By studentStatusField = By.cssSelector("div.form__form-group:nth-child(11) > div:nth-child(2)");
    private By gradeField = By.cssSelector("div.form__form-group:nth-child(12) > div:nth-child(2)");
    private By kvkk = By.cssSelector(".mdi-icon");
    private By consent = By.cssSelector("label.radio-btn:nth-child(1) > span:nth-child(2)");
    private By noconsent = By.cssSelector("label.radio-btn:nth-child(2) > span:nth-child(2)");
    private By registerButton = By.cssSelector(".full-width-button-left");

    public StudentRegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname){
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneCountry(){
        HomePage.bekle(2000);
        driver.findElement(phoneCountryField).click();
        Actions key = new Actions(driver);
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setPhoneField(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setCountry(String country){
        driver.findElement(countryField).click();
        HomePage.bekle(1000);
        Actions key = new Actions(driver);
        key.sendKeys(country).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setEducationtypeField(String educationType){
        driver.findElement(educationtypeField).click();
        Actions key = new Actions(driver);
        key.sendKeys(educationType).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setUniversityField(String university){
        HomePage.bekle(1000);
        driver.findElement(universityField).click();
        HomePage.bekle(1000);
        Actions key = new Actions(driver);
        key.sendKeys(university).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setDepartmentField(String department){
        driver.findElement(departmentField).click();
        HomePage.bekle(1000);
        Actions key = new Actions(driver);
        key.sendKeys(department).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setStudentStatusField(String status){
        driver.findElement(studentStatusField).click();
        Actions key = new Actions(driver);
        key.sendKeys(status).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setGradeField(String grade){
        driver.findElement(gradeField).click();
        Actions key = new Actions(driver);
        key.sendKeys(grade).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void clickCheckBox(){
        driver.findElement(kvkk).click();
    }

    public void chooseConsent(){
        driver.findElement(consent).click();
    }

    public void chooseNoConsent(){
        driver.findElement(noconsent).click();
    }

    public void registerButtonClick(){
        driver.findElement(registerButton).click();
    }

}
