package com.solvd.beamplify.services;

import com.solvd.beamplify.HomePage;
import com.solvd.beamplify.ResultPage;
import org.openqa.selenium.WebDriver;

public interface SearchService {

    default ResultPage goToResult(WebDriver driver, String query) {
        HomePage homePage = new HomePage(driver);
        homePage.setSearchField(query);
        return homePage.performSearch();
    }
}
