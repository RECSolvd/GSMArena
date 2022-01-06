package com.solvd.beamplify;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetQuotePage extends AbstractPage {

    @FindBy(xpath = "//button[@class='ButtonHoc_buttonHoc__3iHD9 ButtonNext_ButtonNext__2_EXb false']")
    private ExtendedWebElement nextButton;

    @FindBy(xpath = "//div[text()='Why are you looking for life insurance?']")
    private ExtendedWebElement lifeInsuranceMessage;


    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private ExtendedWebElement payOffMyDebtsCheckbox;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private ExtendedWebElement leaveAnInheritanceCheckbox;

    @FindBy(xpath = "//div[text()='What’s your date of birth']")
    private ExtendedWebElement dateOfBirthMessage;


    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    private ExtendedWebElement dateOfBirthField;

    @FindBy(xpath = "//div[text()='What’s your gender?']")
    private ExtendedWebElement genderMessage;


    @FindBy(xpath = "//button[contains(text(), 'Female')]")
    private ExtendedWebElement femaleButton;

    @FindBy(xpath = "//div[text()='What’s your zip code?']")
    private ExtendedWebElement zipCodeMessage;


    @FindBy(xpath = "//input[@placeholder='XXXXX']")
    private ExtendedWebElement zipCodeField;

    @FindBy(xpath = "//div[text()='What is your annual household income?']")
    private ExtendedWebElement householdMessage;


    @FindBy(xpath = "//div[@Class=' css-gg2x63']")
    private ExtendedWebElement annualHouseholdAndHeightDropdown;

    @FindBy(xpath = "//*[contains(text(), '$30,000')]")
    private ExtendedWebElement annualHouseholdValue;


    @FindBy(xpath = "(//div[@class='Input_Input__zKd7A  ']/input)[7]")
    private ExtendedWebElement occupationField;

    @FindBy(xpath = "(//div[@class='Font_FontAvenirDemi__iGvw6 '])[13]")
    private ExtendedWebElement comfortableAmountMessage;


    @FindBy(className = "SelectRange_track__3BNBE")
    private ExtendedWebElement amountRange;

    @FindBy(xpath = "//div[text()='Height']")
    private ExtendedWebElement heightLabel;

    @FindBy(xpath = "//div[text()='Weight']")
    private ExtendedWebElement weightLabel;


    @FindBy(xpath = "(//div[@class='Input_Input__zKd7A  ']/input[@type='text'])[4]")
    private ExtendedWebElement weightField;

    @FindBy(xpath = "//div[text()='Have you used tobacco, nicotine, or cannabis products in the last 3 years?']")
    private ExtendedWebElement cannabisMessage;


    @FindBy(xpath = "//button[@class='ButtonOutlined_ButtonOutlined__1PCBN false' and text()='No']")
    private ExtendedWebElement noButton;

    @FindBy(xpath = "//div[text()='Have you been diagnosed with any of the following conditions in the last 10 years?']")
    private ExtendedWebElement conditionsMessage;


    @FindBy(xpath = "//div[text()='None of the above']")
    private ExtendedWebElement noneOfTheAboveButton;

    @FindBy(xpath = "//div[text()='Have you had DUI, moving violation, or suspended license in the last 5 years?']")
    private ExtendedWebElement movingViolationMessage;

    /**/
    @FindBy(xpath = "(//input[@type='text' and @value=''])[1]")
    private ExtendedWebElement firstNameField;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private ExtendedWebElement phoneField;

    @FindBy(xpath = "//button[@type='submit' and text()='Save']")
    private ExtendedWebElement saveButton;
    /**/
    @FindBy(xpath = "//div[text()='Recommended option']")
    private ExtendedWebElement recommendedOptionMessage;

    @FindBy(xpath = "//button[text()='Get Pre-Approved']")
    private ExtendedWebElement preliminaryQuotesButton;


    @FindBy(xpath = "(//div[@class='SelectRange_track__3BNBE'])[1]")
    private ExtendedWebElement yearsCoverageRange;

    @FindBy(xpath = "(//div[@class='SelectRange_track__3BNBE'])[2]")
    private ExtendedWebElement coveragePeriodRange;

    @FindBy(xpath = "//div[text()='Get pre-approved for the best rates! ']")
    private ExtendedWebElement preApprovedMessage;


    @FindBy(xpath = "(//div[@class='Input_Input__zKd7A  ']/input)[5]")
    private ExtendedWebElement firstNameFormField;

    @FindBy(xpath = "(//div[@class='Input_Input__zKd7A  ']/input)[6]")
    private ExtendedWebElement lastNameFormField;

    @FindBy(xpath = "//div[@class='CheckBox_CheckBox__2bo8X ']/input")
    private ExtendedWebElement authorizationCheckBox;

    @FindBy(xpath = "//button[@class='Button_Button__2_RQ2 undefined' and text()='Next']")
    private ExtendedWebElement nextFormButton;

    @FindBy(xpath = "//div[text()='Almost there!']")
    private ExtendedWebElement almostThereMessage;


    @FindBy(xpath = "(//div[@class=' css-12q0e1x-control']//div[@Class=' css-gg2x63'])[1]")
    private ExtendedWebElement dateDropdown;

    @FindBy(xpath = "(//div[@class=' css-12q0e1x-control']//div[@Class=' css-gg2x63'])[2]")
    private ExtendedWebElement hourDropdown;

    @FindBy(xpath = "//div[@style='align-self: center;']/button[text()='Submit']")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//div[text()='Family life insurance plan']")
    private ExtendedWebElement familyLifeMessage;


    @FindBy(xpath = "//div[@class=' css-1hn1kj7-control']//div[@Class=' css-gg2x63']")
    private ExtendedWebElement relationshipDropdown1;

    @FindBy(xpath = "//div[text()='Add another one']")
    private ExtendedWebElement addAnotherOneButton;

    @FindBy(xpath = "(//div[@class=' css-1hn1kj7-control']//div[@Class=' css-gg2x63'])[2]")
    private ExtendedWebElement relationshipDropdown2;

    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
    private ExtendedWebElement dateOfBirth2;

    @FindBy(xpath = "//div[@class='DonePage_submit__12Cf8']/button[text()='Submit']")
    private ExtendedWebElement lastSubmitButton;

    @FindBy(xpath = "//div[text()='Thank you!']")
    private ExtendedWebElement thaksUMessage;

    @FindBy(xpath = "//div[contains(text(), 'Your scheduled call')]")
    private ExtendedWebElement scheduledCallMessage;


    public GetQuotePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void switchToQuoteWindow(String tabTitle){
        var windows = driver.getWindowHandles();

        for (String window : windows) {
            driver.switchTo().window(window);

            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void clickNextButton(){
        nextButton.click();
    }

    public String getlifeInsuranceMessage(){
        return lifeInsuranceMessage.getText();
    }

    public void selectCheckBoxes(){
        payOffMyDebtsCheckbox.click();
        leaveAnInheritanceCheckbox.click();
    }

    public String getDateOfBirthMessage(){
        return dateOfBirthMessage.getText();
    }

    public void setDateOfBirth(String date){
        dateOfBirthField.type(date);
    }
    public String getGenderMessage(){
        return genderMessage.getText();
    }

    public void clickFemaleButton(){
        femaleButton.click();
    }

    public String getZipCodeMessage(){
        return zipCodeMessage.getText();
    }

    public void setZipCode(){    
        zipCodeField.click();
        zipCodeField.sendKeys(Keys.NUMPAD3);
        zipCodeField.sendKeys(Keys.NUMPAD3);
        zipCodeField.sendKeys(Keys.NUMPAD1);
        zipCodeField.sendKeys(Keys.NUMPAD0);
        zipCodeField.sendKeys(Keys.NUMPAD1);
    }

    public String getHouseholdMessage(){
        new WebDriverWait(driver, 7).until(ExpectedConditions.visibilityOf(householdMessage.getElement()));
        return householdMessage.getText();
    }

    public void selectAnnualHouseholdDropdown(){
        annualHouseholdAndHeightDropdown.click();
        Actions select = new Actions(driver);

        //driver.findElement(By.cssSelector("#react-select-4-option-3"));
        //select.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void selectAnnualHouseholdIncome(){
        annualHouseholdValue.click();
    }

    public void setOccupationField(String occupation){
        occupationField.type(occupation);
    }

    public String getComfortableAmountMessage(){
        return comfortableAmountMessage.getText();
    }

    public void moveAmountRange(int range){
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(amountRange.getElement(), range, 0).build();
        action.perform();
    }

    public String getHeightMessage(){
        new WebDriverWait(driver, 7).until(ExpectedConditions.visibilityOf(heightLabel.getElement()));
        return heightLabel.getText();
    }

    public String getWeightMessage(){
        new WebDriverWait(driver, 7).until(ExpectedConditions.visibilityOf(weightLabel.getElement()));
        return weightLabel.getText();
    }

    public void selectHeightDropdown(){
        annualHouseholdAndHeightDropdown.click();
        Actions select = new Actions(driver);
        select.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void setWeightField(String weight){
        weightField.type(weight);
    }

    public String getCannabisMessage(){
        new WebDriverWait(driver, 4).until(ExpectedConditions.visibilityOf(cannabisMessage.getElement()));
        return cannabisMessage.getText();
    }

    public void clickNoButton(){
        noButton.click();
    }

    public String getConditionsMessage(){
        return conditionsMessage.getText();
    }

    public void clickNoneOfTheAboveButton(){
        noneOfTheAboveButton.click();
    }

    public String getMovingViolationMessage(){
        return movingViolationMessage.getText();
    }

    public void setFirstNameField(String firstName){
        firstNameField.type(firstName);
    }
    
    public void setEmailField(String email){
        emailField.type(email);
    }
    
    public void setPhoneField(){
        phoneField.click();
        phoneField.sendKeys(Keys.NUMPAD3);
        phoneField.sendKeys(Keys.NUMPAD3);
        phoneField.sendKeys(Keys.NUMPAD3);
        phoneField.sendKeys(Keys.NUMPAD7);
        phoneField.sendKeys(Keys.NUMPAD7);
        phoneField.sendKeys(Keys.NUMPAD7);
        phoneField.sendKeys(Keys.NUMPAD4);
        phoneField.sendKeys(Keys.NUMPAD3);
        phoneField.sendKeys(Keys.NUMPAD2);
        phoneField.sendKeys(Keys.NUMPAD1);
    }
    
    public void clickSaveButton(){
        saveButton.click();
    }

    public String getRecommendedOptionMessage(){
        recommendedOptionMessage.clickIfPresent(50000);
        return recommendedOptionMessage.getText();
    }

    public String getPreliminaryQuotesButtonMessage(){
        return preliminaryQuotesButton.getText();
    }

    public void moveYearCoverageRange(int range){
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(yearsCoverageRange.getElement(), range, 0).build();
        action.perform();
    }

    public void moveCoveragePeriodRange(int range){
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(coveragePeriodRange.getElement(), range, 0).build();
        action.perform();
    }

    public void clickPreliminaryQuotesButton(){
        preliminaryQuotesButton.click();
    }

    public String getPreApprovedMessage(){
        return preApprovedMessage.getText();
    }

    public void setFirstNameFormField(String firstName){
        firstNameFormField.type(firstName);
    }

    public void setLastNameFormField(String lastName){
        lastNameFormField.type(lastName);
    }

    public void clickAuthorizationCheckBox(){
        authorizationCheckBox.click();
    }

    public String getAlmostThereMessage(){
        return almostThereMessage.getText();
    }

    public void clickNextFormButton(){
        nextFormButton.click();
    }

    public void selectDateCall(){
        dateDropdown.click();
        Actions select = new Actions(driver);
        select.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void selectHourCall(){
        hourDropdown.clickIfPresent(15);
        hourDropdown.click();
        Actions select = new Actions(driver);
        select.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public String getFamilyLifeMessage(){
        familyLifeMessage.clickIfPresent(10);
        return familyLifeMessage.getText();
    }

    public void selectRelationshipDropdown1(){
        relationshipDropdown1.click();
        Actions select = new Actions(driver);
        select.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
    }

    public void clickAddAnotherOneButton(){
        addAnotherOneButton.click();
    }

    public void selectRelationshipDropdown2(){
        relationshipDropdown2.click();
        Actions select = new Actions(driver);
        select.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    public void setDateOfBirth2(String date){
        dateOfBirth2.type(date);
    }

    public void clickLastSubmitButton(){
        lastSubmitButton.click();
    }

    public String getThanksUMessage(){
        return thaksUMessage.getText();
    }

    public String getScheduleCallMessage(){
        return scheduledCallMessage.getText();
    }

}
