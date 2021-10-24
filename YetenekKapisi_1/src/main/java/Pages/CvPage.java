package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CvPage {

    WebDriver driver;
    By addCv = By.cssSelector(".btn-sm");
    By name = By.cssSelector("div.form__form-group:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By comment = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");
    By[] educations = {By.cssSelector(".educationSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"),
            By.cssSelector(".educationSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")};
    By work_exp = By.cssSelector(".careerSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By project = By.cssSelector(".projectSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By reference = By.cssSelector(".referenceSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By skill = By.cssSelector(".skillSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By language = By.cssSelector(".languageSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By club = By.cssSelector(".clubSetDto > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By saveCv = By.cssSelector("button.icon:nth-child(1)");


    public CvPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAddCv(){
        driver.findElement(addCv).click();
    }

    public void setName(String name1){
        driver.findElement(name).sendKeys(name1);
    }

    public void setComment(String comment1){
        driver.findElement(comment).sendKeys(comment1);
    }

    public void setEducations(){
        for (By e:educations) {
            driver.findElement(e).click();
        }
    }

    public void setWork_exp(){
        driver.findElement(work_exp).click();
    }

    public void setProject(){
        driver.findElement(project).click();
    }

    public void setReference(){
        driver.findElement(reference).click();
    }

    public void setSkill(){
        driver.findElement(skill).click();
    }

    public void setLanguage(){
        driver.findElement(language).click();
    }

    public void setClub(){
        driver.findElement(club).click();
    }

    public void clickSave(){
        driver.findElement(saveCv).click();
    }
}
