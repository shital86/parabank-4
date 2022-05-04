package com.parasoft.parabank.Pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerLink=By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]");
//    By signupPageText = By.linkText("Signing up is easy!");
    By firstName = By.xpath("//input[@id='customer.firstName']");
    By lastName = By.xpath("//input[@id='customer.lastName']");
    By firstLineOfAddress = By.xpath("//input[@id='customer.address.street']");
    By cityName = By.xpath("//input[@id='customer.address.city']");
    By stateName = By.xpath("//input[@id='customer.address.state']");
    By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNumber = By.xpath("//input[@id='customer.phoneNumber']");
    By ssnNumber = By.xpath("//input[@id='customer.ssn']");
    By userName = By.xpath("//input[@id='customer.username']");
    By passWord = By.xpath("//input[@id='customer.password']");
    By repeatPassword = By.xpath("//input[@id='repeatedPassword']");
    By clickOnRegisterButton = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    By actualSuccessfulRegisterMsg = By.xpath("//div[@id='mainPanel']/div[3]/div[2]/p");
    By welcomeMsg=By.xpath("//h1[@class='title']");
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

//    public String userSuccessfullyNavigateToSignUpPage() {
//        return getTextFromElement(signupPageText);
//    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterFirstLineOfAddress(String firstLineAddress) {
        sendTextToElement(firstLineOfAddress, firstLineAddress);
    }

    public void enterCityName(String cityname) {
        sendTextToElement(cityName, cityname);
    }

    public void enterStateName(String statename) {
        sendTextToElement(stateName, statename);
    }

    public void enterZipCode(String zipcode) {
        sendTextToElement(zipCode, zipcode);
    }

    public void enterPhoneNumbet(String phonenumber) {
        sendTextToElement(phoneNumber, phonenumber);
    }

    public void enterSsnNumber(String ssnnumber) {
        sendTextToElement(ssnNumber, ssnnumber);
    }

    public void enterUsername(String username) {
        sendTextToElement(userName, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passWord, password);
    }

    public void enterRepeatPassword(String repeatpassword) {
        sendTextToElement(repeatPassword, repeatpassword);
    }

    public void clickOnRegisterBtn() {
        clickOnElement(clickOnRegisterButton);
    }

    public String verifyingUserSuccessFullyRegister() {
        return getTextFromElement(actualSuccessfulRegisterMsg);
    }
public String getWelcomeText(){
        return getTextFromElement(welcomeMsg);
}

}
