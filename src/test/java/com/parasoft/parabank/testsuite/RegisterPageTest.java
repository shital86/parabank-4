package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.Pages.HomePage;
import com.parasoft.parabank.Pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void verifyingUserShouldNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
        String expectedMessage="Signing up is easy!";
        String actualMessage=homePage.userSuccessfullyNavigateToSignUpPage();
       Assert.assertEquals(expectedMessage,actualMessage);
        registerPage.enterFirstName("Paula");
        registerPage.enterLastName("Marsh");
        registerPage.enterFirstLineOfAddress("3 avenue");
        registerPage.enterCityName("Pune");
        registerPage.enterStateName("Maharashtra");
        registerPage.enterZipCode("12345");
        registerPage.enterPhoneNumbet("9823456789");
        registerPage.enterSsnNumber("20202");
        registerPage.enterUsername("Paula");
        registerPage.enterPassword("Happy1234ab");
        registerPage.enterRepeatPassword("Happy1234ab");
        registerPage.clickOnRegisterBtn();
        String expectedMsg ="Welcome Paula";
        String actualMsg=registerPage.getWelcomeText();
        Assert.assertEquals(expectedMsg,actualMsg);


    }
}
