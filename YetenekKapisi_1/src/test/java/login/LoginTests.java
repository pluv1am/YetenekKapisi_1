package login;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    private String email = "fatihtalha06@gmail.com";
    private String password = "Fo3>51//15<(@nM5";

    @Test
    public void testSuccessfulLogin(){
        System.out.println("test1");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");
        //studentLoggedInPage.logOut();
    }

    @Test
    public void testSuccessfulLoginVisiblePassword(){
        System.out.println("test2");
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickshowPass();
        StudentLoggedInPage studentLoggedInPage=loginPage.clickLoginButton();
        System.out.println(studentLoggedInPage.getEmail().toString());
        assertTrue(studentLoggedInPage.getEmail().toString().equals(email)
                ,"Error");
        HomePage.bekle(2000);
        studentLoggedInPage.logOut();
    }

}
