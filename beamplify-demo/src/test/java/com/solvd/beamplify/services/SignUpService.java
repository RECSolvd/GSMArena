package com.solvd.beamplify.services;

import com.solvd.beamplify.CreateAccountPage;
import com.solvd.beamplify.HomePage;
import com.solvd.beamplify.RegisterPage;
import org.openqa.selenium.WebDriver;

public interface SignUpService {

    default CreateAccountPage goToSignUp(WebDriver driver){
        return new HomePage(driver).clickSignUpButton();
    }

    default CreateAccountPage invalidEmailSignUp(WebDriver driver){
        CreateAccountPage createAccountPage = goToSignUp(driver);
        createAccountPage.setYourNicknameField("RydiaOM");
        createAccountPage.setYourEmailField("ricardo@a");
        createAccountPage.setYourPasswordField("asd123");
        createAccountPage.clickRoundCheckBox1();
        createAccountPage.clickRoundCheckBox2();
        createAccountPage.clickSubmitButton();
        return createAccountPage;
    }

    default RegisterPage emptyNameSignUp(WebDriver driver){
        CreateAccountPage createAccountPage = goToSignUp(driver);
        createAccountPage.setYourEmailField("ricardo@a");
        createAccountPage.setYourPasswordField("asd123");
        createAccountPage.clickRoundCheckBox1();
        createAccountPage.clickRoundCheckBox2();
        RegisterPage registerPage = createAccountPage.clickSubmitButton();
        return registerPage;
    }

    default RegisterPage emptyEmailSignUp(WebDriver driver){
        CreateAccountPage createAccountPage = goToSignUp(driver);
        createAccountPage.setYourNicknameField("RydiaOM");
        createAccountPage.setYourPasswordField("asd123");
        createAccountPage.clickRoundCheckBox1();
        createAccountPage.clickRoundCheckBox2();
        RegisterPage registerPage = createAccountPage.clickSubmitButton();
        return registerPage;
    }

    default RegisterPage nonValidatedChecksSignUp(WebDriver driver){
        CreateAccountPage createAccountPage = goToSignUp(driver);
        createAccountPage.setYourNicknameField("RydiaOM");
        createAccountPage.setYourEmailField("ricardo@a");
        createAccountPage.setYourPasswordField("asd123");
        RegisterPage registerPage = createAccountPage.clickSubmitButton();
        return registerPage;
    }
}
