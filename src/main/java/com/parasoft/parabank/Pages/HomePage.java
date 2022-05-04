package com.parasoft.parabank.Pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]");
    By signupPageText = By.xpath("//body[1]/div[1]/div[3]/div[2]/h1[1]");

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

   public String userSuccessfullyNavigateToSignUpPage() {
        return getTextFromElement(signupPageText);
    }

}
