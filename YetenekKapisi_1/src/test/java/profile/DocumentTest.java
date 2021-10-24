package profile;

import Pages.CvPage;
import Pages.Documents;
import Pages.LoginPage;
import Pages.StudentLoggedInPage;
import base.BaseTests;
import org.testng.annotations.Test;

import javax.print.Doc;
import java.util.Base64;

import static org.testng.Assert.assertTrue;

public class DocumentTest extends BaseTests {


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

        Documents documents = studentLoggedInPage.clickDocuments();
        documents.click_add_button();
        documents.setDocument_type("DİĞER");
        documents.setName("Belge");
        documents.setDocument("C:\\Users\\Talha\\Desktop");
        //documents.click_save_button();
    }



}
