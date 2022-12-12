package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage1 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;

    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;

    public void getSelectByValue(String value) {
        selectByValueFromDropDown(selectByValue, value);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;

    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    public void selectProcessorByValue(String value) {
        selectByValueFromDropDown(selectProcessor, value);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    public void selectRamByValue(String value) {
        selectByValueFromDropDown(selectRam, value);
    }
    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDD;

    public void clickOnHDD400GB() {
        clickOnElement(selectHDD);
    }
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;

    public void clickOnOsVistaPremium() {
        clickOnElement(selectOS);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;

    public void clickOnSoftwareTotalCommander() {
        clickOnElement(totalCommander);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;

    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;

    public void closeMessageBar() {
        clickOnElement(closeMsg);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement mouseHover;

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]\");////a[@class='ico-cart']")
    WebElement shoppingCartMessage;
    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;

    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
//    @CacheLookup
//    @FindBy(xpath = "//a[@href='/computers']")
//    WebElement computerMenu;

   // By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;
    public String verifyTotal1(){
        return getTextFromElement(verifyTotal1);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    public String verifyWelcomeText(){
        return getTextFromElement(verifyWelcome);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;
    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;

    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;

    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    // Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
    //        country.selectByVisibleText("United Kingdom
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;

    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;

    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;

    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;

    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;

    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;

    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;

    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement verifyText1;

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;

    public String getVerifyText2() {
        return getTextFromElement(verifyText2);
    }
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyText3;

    public String getVerifyText3() {
        return getTextFromElement(verifyText3);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;

    public void clickOnConformButton() {
        clickOnElement(conform);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement verifyText4;

    public String getVerifyText4() {
        return getTextFromElement(verifyText4);
    }
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyText5;

    public String getVerifyText5() {
        return getTextFromElement(verifyText5);
    }
    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyText6;

    public String getVerifyText6() {
        return getTextFromElement(verifyText6);

    }
}