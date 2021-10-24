package profile;
import Pages.LoginPage;
import Pages.StudentLoggedInPage;
import Pages.StudentProfile;
import login.LoginTests;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GeneralInfoTest extends BaseTests {

    private String email = "fatihtalha06@gmail.com";
    private String password = "Fo3>51//15<(@nM5";

    @Test
    public void login_and_fill_profile(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        StudentProfile studentProfile=studentLoggedInPage.clickStudentProfile();
        //studentProfile.setProfile_photo("C:\\Users\\Talha\\Desktop\\images.jpg");
        studentProfile.photo_control("C:\\Users\\Talha\\Desktop\\images.jpg");
        studentProfile.setTCno("16240035450");
        studentProfile.setgender("ERKEK");
        studentProfile.setAskerlikField("TECILLI");
        studentProfile.setBirthdateField("30/10/2001");
        studentProfile.setPhoneCountry("Türkiye");
        studentProfile.setPhoneField("5342007984");
        studentProfile.setNationalityField("TÜRKİYE");
        studentProfile.setCountryField("TÜRKİYE");
        studentProfile.setCityField("Ankara");
        studentProfile.setAdressField("Gazi Üniversitesi Maltepe/Çankaya");
        studentProfile.setEmailRaiobutton("n");
        studentProfile.setSmsRaiobutton("n");
        studentProfile.setDisabledRaiobutton("y");
        studentProfile.setGradeField("3");
        studentProfile.setCareerField("ÖĞRENCİ");
        studentProfile.setGraduationDateField("06/2024");
        studentProfile.setGpaField("3,12");
        studentProfile.setFacebookField("https://www.facebook.com/");
        studentProfile.setInstagramField("https://www.instagram.com/?hl=tr");
        studentProfile.setLinekdinField("https://tr.linkedin.com/in/fatih-talha-t%C3%BCmer-75237b202");
        studentProfile.setTwitterField("https://twitter.com/");
        studentProfile.setYoutubeField("https://www.youtube.com/channel/UC_m9BOlZ4njoL5NToSLOWMg");
        studentProfile.save_button_click();
    }


    @Test
    public void gecicitest(){
        System.out.println("gecici test");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email),"Error");

        StudentProfile studentProfile=studentLoggedInPage.clickStudentProfile();
        studentProfile.photo_control("C:\\Users\\Talha\\Desktop\\images.jpg");

    }
}
