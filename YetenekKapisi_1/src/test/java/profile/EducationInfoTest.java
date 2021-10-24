package profile;

import Pages.CvPage;
import Pages.EducationInfo;
import Pages.LoginPage;
import Pages.StudentLoggedInPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EducationInfoTest extends BaseTests {

    private String email = "fatihtalha06@gmail.com";
    private String password = "Fo3>51//15<(@nM5";

    @Test
    public void addEducationInfo(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");

        CvPage cvPage = studentLoggedInPage.clickCvPage();
        cvPage.clickAddCv();

    }

}
