package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentLoggedInPage {

    private WebDriver driver;
    private By email = By.cssSelector("p.dashboard_profile__contact:nth-child(4)");
    private By topbar_avatar_button = By.className("topbar__avatar");
    private By topbar_logout_button = By.cssSelector("a.topbar__link:nth-child(3)");
    private By profile_button = By.cssSelector("div.sidebar__wrapper:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > div:nth-child(2) > button:nth-child(1)");
    private By general_info = By.cssSelector(".show > ul:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
    private By experiences = By.cssSelector(".show > ul:nth-child(1) > div:nth-child(1) > a:nth-child(2)");
    private By education = By.cssSelector(".show > ul:nth-child(1) > div:nth-child(1) > a:nth-child(3)");
    private By cv = By.cssSelector(".show > ul:nth-child(1) > div:nth-child(1) > a:nth-child(4)");
    private By documents = By.cssSelector(".show > ul:nth-child(1) > div:nth-child(1) > a:nth-child(5)");


    public StudentLoggedInPage(WebDriver driver){
        this.driver=driver;
    }

    public String getEmail(){
        HomePage.bekle(1000);
        return driver.findElement(email).getText();
    }

    public StudentProfile clickStudentProfile(){
        clickLink(profile_button);
        clickLink(general_info);
        return new StudentProfile(driver);
    }

    public Experiences clickExperiences(){
        clickLink(profile_button);
        clickLink(experiences);
        return new Experiences(driver);
    }

    public EducationInfo clickEducationInfo(){
        clickLink(profile_button);
        clickLink(education);
        return new EducationInfo(driver);
    }

    public CvPage clickCvPage(){
        clickLink(profile_button);
        clickLink(cv);
        return new CvPage(driver);
    }

    public Documents clickDocuments(){
        clickLink(profile_button);
        clickLink(documents);
        return new Documents(driver);
    }

    private void clickLink(By path){
        HomePage.bekle(1000);
        driver.findElement(path).click();
    }


    public void logOut(){
        driver.findElement(topbar_avatar_button).click();
        driver.findElement(topbar_logout_button).click();
    }

}
