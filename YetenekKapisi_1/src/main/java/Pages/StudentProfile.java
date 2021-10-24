package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class StudentProfile {

    WebDriver driver;
    By profile_photo = By.cssSelector(".dropzone__input > input:nth-child(2)");
    By pp_upload_button = By.cssSelector(".btn-sm");
    By tcnoField = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By genderField = By.cssSelector("div.form__form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1)");
    By askerlikField = By.cssSelector(".militaryServiceStatusDto > div:nth-child(1)");
    By birthdateField = By.cssSelector(".birthDate");
    By phoneCountryField = By.cssSelector(".phoneCountry > div:nth-child(1)");
    By phoneNumberField = By.name("phoneDto.number");
    By nationalityField = By.cssSelector(".nationalityDto > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By countryField = By.cssSelector(".countryDto > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By cityField = By.cssSelector(".cityDto > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By adressField = By.cssSelector("div.form__form-group:nth-child(10) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");
    By emailRaiobutton = By.cssSelector("div.form__form-group:nth-child(11) > div:nth-child(3) > div:nth-child(1) > label:nth-child(1)");
    By noemailRaiobutton = By.cssSelector("div.form__form-group:nth-child(11) > div:nth-child(3) > div:nth-child(2) > label:nth-child(1)");
    By smsRaiobutton = By.cssSelector("div.form__form-group:nth-child(12) > div:nth-child(3) > div:nth-child(1) > label:nth-child(1)");
    By nosmsRaiobutton = By.cssSelector("div.form__form-group:nth-child(12) > div:nth-child(3) > div:nth-child(2) > label:nth-child(1)");
    By disabledRaiobutton = By.cssSelector("div.form__form-group:nth-child(13) > div:nth-child(3) > div:nth-child(1) > label:nth-child(1)");
    By nodisabledRaiobutton = By.cssSelector("div.form__form-group:nth-child(13) > div:nth-child(3) > div:nth-child(2) > label:nth-child(1)");
    By gradeField = By.cssSelector(".classLevelDto > div:nth-child(1)");
    By careerField = By.cssSelector(".careerStatusDto > div:nth-child(1)");
    By graduationDateField = By.cssSelector(".graduationDate");
    By gpaField = By.cssSelector("div.form__form-group:nth-child(22) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By facebookField = By.name("facebookProfile");
    By instagramField = By.name("instagramProfile");
    By linekdinField = By.name("linkedInProfile");
    By twitterField = By.name("twitterProfile");
    By youtubeField = By.name("youtubeProfile");
    By profile_photo_remove_button = By.cssSelector(".cart__table-btn");
    By save_button = By.cssSelector("button.icon:nth-child(1)");

    public StudentProfile(WebDriver driver){
        this.driver=driver;
    }

    public void setProfile_photo(String path){
        driver.findElement(profile_photo).sendKeys(path);
        HomePage.bekle(2000);
        driver.findElement(pp_upload_button).click();
    }

    public void setTCno(String tcno){
        driver.findElement(tcnoField).sendKeys(tcno);
    }

    public void setgender(String gender){
        driver.findElement(genderField).click();
        HomePage.bekle(1000);
        Actions key = new Actions(driver);
        key.sendKeys(gender).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setAskerlikField(String askerlik){
        driver.findElement(askerlikField).click();
        HomePage.bekle(1000);
        Actions key = new Actions(driver);
        key.sendKeys(askerlik).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setBirthdateField(String date){
        driver.findElement(birthdateField).click();
        HomePage.copy(date);
        driver.findElement(birthdateField).sendKeys(Keys.CONTROL + "v");
        driver.findElement(birthdateField).sendKeys(Keys.ENTER);
    }



    public void setPhoneCountry(String country){
        driver.findElement(phoneCountryField).click();
        Actions key = new Actions(driver);
        key.sendKeys(country).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
        HomePage.bekle(1000);
    }

    public void setPhoneField(String phone){
        driver.findElement(phoneNumberField).sendKeys(phone);
    }

    public void setNationalityField(String nationality){
        driver.findElement(nationalityField).click();
        Actions key = new Actions(driver);
        key.sendKeys(nationality).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setCountryField(String country){
        driver.findElement(countryField).click();
        Actions key = new Actions(driver);
        key.sendKeys(country).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setCityField(String city){
        driver.findElement(cityField).click();
        Actions key = new Actions(driver);
        key.sendKeys(city).build().perform();
        key.sendKeys(Keys.DOWN).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setAdressField(String adress){
        driver.findElement(adressField).sendKeys(adress);
    }

    public void setEmailRaiobutton(String option){
        HomePage.bekle(2000);
        if (option=="y")
            driver.findElement(emailRaiobutton).click();
        else
            driver.findElement(noemailRaiobutton).click();
    }

    public void setSmsRaiobutton(String option){
        if (option=="y")
            driver.findElement(smsRaiobutton).click();
        else
            driver.findElement(nosmsRaiobutton).click();
    }

    public void setDisabledRaiobutton(String option){
        if (option=="y")
            driver.findElement(disabledRaiobutton).click();
        else
            driver.findElement(nodisabledRaiobutton).click();
    }

    public void setGradeField(String grade){
        driver.findElement(gradeField).click();
        Actions key = new Actions(driver);
        key.sendKeys(grade).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setCareerField(String career){
        driver.findElement(careerField).click();
        Actions key = new Actions(driver);
        key.sendKeys(career).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setGraduationDateField(String date){
        driver.findElement(graduationDateField).click();
        HomePage.copy(date);
        driver.findElement(graduationDateField).sendKeys(Keys.CONTROL + "v");
        driver.findElement(graduationDateField).sendKeys(Keys.ENTER);
    }

    public void setGpaField(String gpa){
        driver.findElement(gpaField).sendKeys(gpa);
    }

    public void setFacebookField(String facebook){
        driver.findElement(facebookField).sendKeys(facebook);
    }

    public void setInstagramField(String instagram){
        driver.findElement(instagramField).sendKeys(instagram);
    }

    public void setLinekdinField(String linkedin){
        driver.findElement(linekdinField).sendKeys(linkedin);
    }

    public void setTwitterField(String twitter){
        driver.findElement(twitterField).sendKeys(twitter);
    }

    public void setYoutubeField(String youtube){
        driver.findElement(youtubeField).sendKeys(youtube);
    }

    public void photo_control(String path) {
        if (driver.findElements(profile_photo_remove_button).size() != 0){
            HomePage.bekle(2000);
            driver.findElement(By.cssSelector(".cart__table-btn > svg:nth-child(1)")).click();
            setProfile_photo(path);
        }
        else {
            setProfile_photo(path);
        }
    }

    public void save_button_click(){
        driver.findElement(save_button).click();
    }

}
