package profile;

import Pages.Experiences;
import Pages.LoginPage;
import Pages.StudentLoggedInPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ExperienceTest extends BaseTests {

    private String email = "fatihtalha06@gmail.com";
    private String password = "Fo3>51//15<(@nM5";

    @Test
    public void addworkExpTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.select_wordk_exp();
        experiences.click_add_button();
        experiences.setWork_employer("Allah");
        experiences.setWork_position("Kulluk");
        experiences.setWork_start_date("30/10/2001");
        experiences.setWork_status("Devam ediyor");
        experiences.setWork_comment("Rızkımı veren Hüdadır kula minnet eylemem");
        experiences.save();

    }

    @Test
    public void addskillTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.clickaddcompentence();
        experiences.click_add_button();
        experiences.setSkill_name("öğrenci");
        experiences.setSkill_level("İLERİ");
        experiences.setSkill_comment("Sürünüyoruz");
        experiences.save();

    }

    @Test
    public void addprojectTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.clickaddproject();
        experiences.click_add_button();
        experiences.setProject_name("proje 1");
        experiences.setProject_comment("gayet iyi");
        experiences.setProject_url("https://www.youtube.com/");
        experiences.save();

    }

    @Test
    public void addreferenceTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.clickreferences();
        experiences.click_add_button();
        experiences.setReference_name("talha");
        experiences.setReference_surname("tmr");
        experiences.setReference_organisation("gazi üni");
        experiences.setReference_position("öğrenci");
        experiences.setReference_email("email@email.com");
        experiences.save();

    }

    @Test
    public void addlanguageTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.clickLanguages();
        experiences.click_add_button();
        experiences.setLanguage("talhaca");
        experiences.setLanguage_level("C2");
        experiences.setLanguage_certificate("gazi üni");
        experiences.setLanguage_school("hayat okulu");
        experiences.save();

    }

    @Test
    public void addClubTest(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        Experiences experiences = studentLoggedInPage.clickExperiences();
        experiences.clickclub();
        experiences.click_add_button();
        experiences.setClub_university("GAZİ");
        experiences.setClubname("FTT");
        experiences.setClub_role("BAŞKAN");
        experiences.setClub_start_date("20/09/2021");
        experiences.setClub_status("Devam Ediyor");
        experiences.setClub_comment(":D");
        experiences.setClub_website("www.bombabomba.com");
        experiences.setClub_linkedin("https://tr.linkedin.com/in/fatih-talha-t%C3%BCmer-75237b202");
        experiences.setClub_twitter("https://twitter.com/");
        experiences.setClub_youtube("https://www.youtube.com/channel/UC_m9BOlZ4njoL5NToSLOWMg");
        experiences.setClub_facebook("https://www.facebook.com/");
        experiences.setClub_instagram("https://www.instagram.com/?hl=tr");
        experiences.save();

    }
}
