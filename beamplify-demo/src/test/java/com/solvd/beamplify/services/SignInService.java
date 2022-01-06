package com.solvd.beamplify.services;

import com.solvd.beamplify.HomePage;
import com.solvd.beamplify.RegisterPage;
import org.openqa.selenium.WebDriver;

public interface SignInService {

    String email = "rcorrea@solvd.com";
    String nickname = "RydiaOM";
    String password = "asd123";

    default HomePage goToLogin(WebDriver driver){
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        return homePage;
    }

    default HomePage testLogin(WebDriver driver){
        HomePage homePage = goToLogin(driver);
        homePage.inputEmailField(email);
        homePage.inputPasswordField(password);
        homePage.submitLogin();
        return homePage;
    }

    default RegisterPage invalidUserPassLogin(WebDriver driver){
        HomePage homePage = goToLogin(driver);
        homePage.inputEmailField(email + "a");
        homePage.inputPasswordField(password + "a");
        homePage.submitLogin();
        return new RegisterPage(driver);
    }

    default RegisterPage emptyEmailLogin(WebDriver driver){
        HomePage homePage = goToLogin(driver);
        homePage.inputPasswordField(password);
        homePage.submitLogin();
        return new RegisterPage(driver);
    }

    default RegisterPage emptyPasswordLogin(WebDriver driver){
        HomePage homePage = goToLogin(driver);
        homePage.inputEmailField(email);
        homePage.submitLogin();
        return new RegisterPage(driver);
    }

}
