package register;

import Pages.LoginPage;
import Pages.StudentRegisterPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert.*;

public class RegisterTests extends BaseTests {

    @Test
    public void testSuccessfullregister(){
        StudentRegisterPage studentRegisterPage = homePage.clickStuReg();

        studentRegisterPage.setName("Fatih Talha");
        studentRegisterPage.setSurname("Tümer");
        studentRegisterPage.setEmail("fatihtalha065@gmail.com");
        studentRegisterPage.setPhoneCountry();
        studentRegisterPage.setPhoneField("5342007984");
        studentRegisterPage.setCountry("TÜRKİYE");
        studentRegisterPage.setEducationtypeField("LİSANS");
        studentRegisterPage.setUniversityField("GAZİ ÜNİVERSİTESİ");
        studentRegisterPage.setDepartmentField("BİLGİSAYAR MÜHENDİSLİĞİ");
        studentRegisterPage.setStudentStatusField("ÖĞRENCİ");
        studentRegisterPage.setGradeField("3");
        studentRegisterPage.clickCheckBox();
        studentRegisterPage.chooseConsent();
        studentRegisterPage.registerButtonClick();

        LoginPage loginPage = homePage.clickLogin();
        Assert.assertTrue(loginPage.getMessage().contains("E-posta adresinize ve telefon numaranıza bilgilendirme gönderildi.")
        ,"Kayıt başarısız.");
    }
}
