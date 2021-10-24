package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Experiences {

    WebDriver driver;

    By work_exp = By.cssSelector("#tab-tab1");
    By add_button = By.cssSelector(".btn-sm");
    By work_employer = By.cssSelector("div.form__form-group:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By work_position = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By work_start_date = By.cssSelector(".startDate");
    By work_status = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1)");
    By work_end_date = By.cssSelector(".endDate");
    By work_comment = By.cssSelector("div.form__form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");
    By save_button = By.cssSelector("button.icon:nth-child(1)");

    By competence = By.cssSelector("#tab-tab2");
    By skill_name = By.cssSelector("div.form__form-group:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By skill_level = By.cssSelector(".css-tr8wj9-placeholder");
    By skill_comment = By.cssSelector("div.form__form-group:nth-child(3) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");

    By project = By.cssSelector("#tab-tab3");
    By project_name = By.cssSelector("div.form__form-group:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By project_comment = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");
    By project_url = By.cssSelector("div.form__form-group:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");

    By references = By.cssSelector("#tab-tab4");
    By reference_name = By.cssSelector("div.form__form-group:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By reference_surname = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By reference_organisation = By.cssSelector("div.form__form-group:nth-child(3) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By reference_position = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By reference_email = By. cssSelector("div.form__form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");

    By languages = By.cssSelector("#tab-tab5");
    By language = By.cssSelector("div.form__form-group:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By language_level = By.cssSelector(".css-tr8wj9-placeholder");
    By language_certificate = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By language_school = By.cssSelector("div.form__form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");

    By clubs = By.cssSelector("#tab-tab6");
    By club_university = By.cssSelector(".universityDto > div:nth-child(1)");
    By clubname = By.cssSelector("div.form__form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By club_role = By.cssSelector(".studentClubStatusDto > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By club_start_date = By.cssSelector(".startDate");
    By club_status = By.cssSelector(".careerStatus > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By club_comment = By.cssSelector("div.form__form-group:nth-child(8) > div:nth-child(2) > div:nth-child(1) > textarea:nth-child(1)");
    By club_website = By.cssSelector("div.form__form-group:nth-child(9) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
    By club_linkedin = By.cssSelector("li.form__form-group:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
    By club_twitter = By.cssSelector("li.form__form-group:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
    By club_youtube = By.cssSelector("li.form__form-group:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
    By club_facebook = By.cssSelector("li.form__form-group:nth-child(4) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
    By club_instagram = By.cssSelector("li.form__form-group:nth-child(5) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");

    public Experiences(WebDriver driver){
        this.driver=driver;
    }

    public void select_wordk_exp(){
        driver.findElement(work_exp).click();
    }

    public void click_add_button(){
        driver.findElement(add_button).click();
    }

    public void setWork_employer(String employer){
        driver.findElement(work_employer).sendKeys(employer);
    }

    public void setWork_position(String position){
        driver.findElement(work_position).sendKeys(position);
    }

    public void setWork_start_date(String date){
        driver.findElement(work_start_date).click();
        HomePage.copy(date);
        driver.findElement(work_start_date).sendKeys(Keys.CONTROL + "v");
        driver.findElement(work_start_date).sendKeys(Keys.ENTER);
    }

    public void setWork_status(String status){
        driver.findElement(work_status).click();
        Actions key = new Actions(driver);
        key.sendKeys(status).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setWork_end_date(String date){
        driver.findElement(work_end_date).click();
        HomePage.copy(date);
        driver.findElement(work_end_date).sendKeys(Keys.CONTROL + "v");
        driver.findElement(work_end_date).sendKeys(Keys.ENTER);
    }

    public void setWork_comment(String comment){
        driver.findElement(work_comment).sendKeys(comment);
    }

    public void save(){
        driver.findElement(save_button).click();
    }

    //skill
    public void clickaddcompentence(){
        driver.findElement(competence).click();
    }

    public void setSkill_name(String skill){
        driver.findElement(skill_name).sendKeys(skill);
    }

    public void setSkill_level(String level){
        driver.findElement(skill_level).click();
        Actions key = new Actions(driver);
        key.sendKeys(level).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setSkill_comment(String comment){
        driver.findElement(skill_comment).sendKeys(comment);
    }


    //project
    public void clickaddproject(){
        driver.findElement(project).click();
    }

    public void setProject_name(String name){
        driver.findElement(project_name).sendKeys(name);
    }

    public void setProject_comment(String comment){
        driver.findElement(project_comment).sendKeys(comment);
    }

    public void setProject_url(String url){
        driver.findElement(project_url).sendKeys(url);
    }

    //references

    public void clickreferences(){
        driver.findElement(references).click();
    }

    public void setReference_name(String name){
        driver.findElement(reference_name).sendKeys(name);
    }

    public void setReference_surname(String surname){
        driver.findElement(reference_surname).sendKeys(surname);
    }

    public void setReference_organisation(String organisation){
        driver.findElement(reference_organisation).sendKeys(organisation);
    }

    public void setReference_position(String position){
        driver.findElement(reference_position).sendKeys(position);
    }

    public void setReference_email(String email){
        driver.findElement(reference_email).sendKeys(email);
    }

    //languages
    public void clickLanguages(){
        driver.findElement(languages).click();
    }

    public void setLanguage(String name){
        driver.findElement(language).sendKeys(name);
    }

    public void setLanguage_level(String level){
        driver.findElement(language_level).click();
        Actions key = new Actions(driver);
        key.sendKeys(level).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setLanguage_certificate(String certificate){
        driver.findElement(language_certificate).sendKeys(certificate);
    }

    public void setLanguage_school(String school){
        driver.findElement(language_school).sendKeys(school);
    }

    //clubs
    public void clickclub(){
        driver.findElement(clubs).click();
    }

    public void setClub_university(String uni){
        driver.findElement(club_university).click();
        Actions key = new Actions(driver);
        key.sendKeys(uni).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setClubname(String name){
        driver.findElement(clubname).sendKeys(name);
    }

    public void setClub_role(String role){
        driver.findElement(club_role).click();
        Actions key = new Actions(driver);
        key.sendKeys(role).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setClub_start_date(String date){
        driver.findElement(club_start_date).click();
        HomePage.copy(date);
        driver.findElement(club_start_date).sendKeys(Keys.CONTROL + "v");
        driver.findElement(club_start_date).sendKeys(Keys.ENTER);
    }

    public void setClub_status(String status){
        driver.findElement(club_status).click();
        Actions key = new Actions(driver);
        key.sendKeys(status).build().perform();
        key.sendKeys(Keys.ENTER).build().perform();
    }

    public void setClub_comment(String comment){
        driver.findElement(club_comment).sendKeys(comment);
    }

    public void setClub_website(String website){
        driver.findElement(club_website).sendKeys(website);
    }
    public void setClub_linkedin(String link){
        driver.findElement(club_linkedin).sendKeys(link);
    }

    public void setClub_twitter(String link){
        driver.findElement(club_twitter).sendKeys(link);
    }

    public void setClub_youtube(String link){
        driver.findElement(club_youtube).sendKeys(link);
    }

    public void setClub_facebook(String link){
        driver.findElement(club_facebook).sendKeys(link);
    }

    public void setClub_instagram(String link){
        driver.findElement(club_instagram).sendKeys(link);
    }




}
