package com.solvd.beamplify.tests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.beamplify.CreateAccountPage;
import com.solvd.beamplify.HomePage;
import com.solvd.beamplify.RegisterPage;
import com.solvd.beamplify.ResultPage;
import com.solvd.beamplify.services.SignInService;
import com.solvd.beamplify.services.SignUpService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BaseTest implements IAbstractTest, SignUpService, SignInService {

    @DataProvider(name = "phoneBrand")
        public Object [][] brands(){
            return new Object[][]{{"Samsung"}, {"Apple"}, {"Huawei"}, {"Nokia"}};
    }

    @DataProvider(name = "specificModel")
        public Object[][] models(){
            return new Object[][] {{"A51"}, {"iPhone X"}, {"P20"}, {"1100"}};
    }

    @Test
    public void invalidEmailSignUp() {
        CreateAccountPage createAccountPage = invalidEmailSignUp(getDriver());
        //Assert.assertTrue(createAccountPage.getErrorMessage().equals("Reason: You need to provide valid " + "email."));
    }

    @Test
    public void testEmptyName() {
        RegisterPage registerPage = emptyNameSignUp(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: Email/password validation error. Please try again.",
                "Alert Text Incorrect");
    }

    @Test
    public void testEmptyEmail() {
        RegisterPage registerPage = emptyEmailSignUp(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: Email/password validation error. Please try again.", "Alert Text Incorrect");
    }

    @Test
    public void testNonValidatedChecks() {
        RegisterPage registerPage = nonValidatedChecksSignUp(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: Email/password validation error. Please try again.",
                "Alert Text Incorrect");
    }

    @Test
    public void testLogin() {
        HomePage homePage = testLogin(getDriver());
    }

    @Test
    public void invalidUserPassLogin() {
        RegisterPage registerPage = invalidUserPassLogin(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: User record not found."
                ,
                "Alert Text Incorrect");
    }

    @Test
    public void testEmptySignInEmail() {
        RegisterPage registerPage = emptyEmailLogin(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: Email/password validation error. Please try again."
                ,
                "Alert Text Incorrect");
    }

    @Test
    public void testEmptySignInPassword(){
        RegisterPage registerPage = emptyPasswordLogin(getDriver());
        Assert.assertEquals(registerPage.getInvalidEmailText(), "Reason: Email/password validation error. Please try again."
                ,
                "Alert Text Incorrect");
    }

    @Test(dataProvider = "phoneBrand")
    public void testBrandSearch(String brand){
        ResultPage result = goToResult(getDriver(), brand);
        Assert.assertNotEquals(result.getErrorMessage(), "We're sorry, we found no results", "ERROR");

    }

    @Test(dataProvider = "specificModel")
    public void testModelSearch(String model){
        ResultPage result = goToResult(getDriver(), model);
        Assert.assertNotEquals(result.getErrorMessage(), "We're sorry, we found no results", "ERROR");
    }

    @Test
    public void testErrorMessage(){
        ResultPage result = goToResult(getDriver(), "jasjdak");
        Assert.assertEquals(result.getErrorMessage(), "We're sorry, we found no results", "ERROR");
    }

    private ResultPage goToResult(WebDriver driver, String brand) {
        HomePage homePage = new HomePage(driver);
        homePage.setSearchField(brand);
        return homePage.performSearch();
    }

}


