package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Electronics extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronicsTab;

    public void mouseHoverOnElectronics(String userName) {
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhonesAndClick;

    public void mouseHoverOnCellPhonesAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhones;

    public String verifyTextCellPhones() {
        return getTextFromElement(verifyTextCellPhones);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronics;

    public void mouseHoverOnElectronics() {
        mouseHoverToElement(mouseHoverOnElectronics);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhones1;

    public void mouseHoverOnCellPhones1() {
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellphones;

    public String verifyTextCellphones() {
        return getTextFromElement(verifyTextCellphones);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListViewTab;

    public void clickOnListViewTab() {
        clickOnElement(clickOnListViewTab);
    }
    @CacheLookup
    @FindBy(xpath = "//img[@alt ='Picture of Nokia Lumia 1020']")
    WebElement clickOnProductNameNokia;

    public void clickOnProductNameNokia() {
       /* try {
            clickOnElement(By.xpath("//img[@alt ='Picture of Nokia Lumia 1020']"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//img[@alt ='Picture of Nokia Lumia 1020']"));
        }*/
        clickOnElement(clickOnProductNameNokia);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;

    public String verifyTextNokiaLumia() {
        return getTextFromElement(verifyTextNokiaLumia);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyNokiaPrice;

    public String verifyNokiaPrice() {
        return getTextFromElement(verifyNokiaPrice);
    }
    //    change quantity and add to cart
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement clearQuantity;
   // By clearQuantity = By.id("");

//    public void clearQuantityToBlank() {
//        clickOnElement(clearQuantity);
//    }
    public void clearQuantity() {
        driver.findElement(By.id("product_enteredQuantity_20")).clear();
    }
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement changeQuantity;

    public void changeQuantityTo2(String text) {
        sendTextToElement(changeQuantity, text);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement updateCart;

    public void clickOnAddToCart() {
        clickOnElement(updateCart);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyGreenBarMessage;

    public String verifyGreenBarMessage() {
        return getTextFromElement(verifyGreenBarMessage);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBar;

    public void clickOnGreenBar() {
        clickOnElement(clickOnGreenBar);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;

    public void hoverAndClickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;

    public String verifyMessageShoppingCart() {
        return getTextFromElement(verifyMessageShoppingCart);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;

    public String verifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement verifyTotal;

    public String verifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    public void clickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcomePlease;

    public String verifyTextWelcomePlease() {
        return getTextFromElement(verifyTextWelcomePlease);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;

    public void clickOnRegister() {
        clickOnElement(clickOnRegister);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTextRegister;

    public String verifyTextRegister() {
        return getTextFromElement(verifyTextRegister);
    }
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement sendTextToFirstNameField;

    public void sendTextToFirstNameField(String firstname) {
        sendTextToElement(sendTextToFirstNameField, firstname);
    }
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement sendTextToLastNameField;

    public void sendTextToLastNameField(String lastname) {
        sendTextToElement(sendTextToLastNameField, lastname);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement sendTextToDay;

    public void sendTextToDay(String day) {
        sendTextToElement(sendTextToDay, day);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement sendTextToMonth;

    public void sendTextToMonth(String month) {
        sendTextToElement(sendTextToMonth, month);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement sendTextToYear;

    public void sendTextToYear(String year) {
        sendTextToElement(sendTextToYear, year);
    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement sendTextToEmailField;

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmailField, email);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement sendTextToPasswordField;

    public void sendTextToPasswordField(String password) {
        sendTextToElement(sendTextToPasswordField, password);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement sendTextToConfirmPasswordField;

    public void sendTextToConfirmPasswordField(String confirmPassword) {
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister1;

    public void clickOnRegister1() {
        clickOnElement(clickOnRegister1);
    }
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMessageYourRegistrationCompleted;

    public String verifyMessageYourRegistrationCompleted() {
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;

    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyTextShoppingCart;

    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox1;

    public void clickOnCheckbox1() {
        clickOnElement(clickOnCheckbox1);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout1;

    public void clickOnCheckout1() {
        clickOnElement(clickOnCheckout1);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;

    public void countryByVisibleText(String name) {
        selectByVisibleTextFromDropDown(selectCountry, name);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement sendTextToCity;

    public void sendTextToCity(String city) {
        sendTextToElement(sendTextToCity, city);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement sendTextToAddress;

    public void sendTextToAddress(String address) {
        sendTextToElement(sendTextToAddress, address);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement sendTextToPostelCode;

    public void sendTextToPostelCode(String postalCode) {
        sendTextToElement(sendTextToPostelCode, postalCode);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement sendTextToPhoneNumber;

    public void sendTextToPhoneNumber(String phoneNumber) {
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue1;

    public void clickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement clickOn2ndDayAir;

    public void clickOn2ndDayAir() {
        clickOnElement(clickOn2ndDayAir);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinue2;

    public void clickOnContinue2() {
        clickOnElement(clickOnContinue2);
    }
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement clickOnCreditCard;

    public void clickOnCreditCard() {
        clickOnElement(clickOnCreditCard);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[1]")
    WebElement clickOnContinue5;

    public void clickOnContinueTab() {
        clickOnElement(clickOnContinue5);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@value='Payments.Manual']")
    WebElement clickOnSelectCreditCard;

    public void clickOnSelectCreditCard() {
        clickOnElement(clickOnSelectCreditCard);
    }
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Visa')]")
    WebElement clickOnVisa;

    public void clickOnVisa() {
        clickOnElement(clickOnVisa);
    }
    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement sendTextToCardholderName;

    public void sendTextToCardholderName(String cardHolderName) {
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement sendTextToCardNumber;

    public void sendTextToCardNumber(String cardNumber) {
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement sendTextToExpirationMonth;

    public void sendTextToExpirationMonth(String expirationMonth) {
        selectByValueFromDropDown(sendTextToExpirationMonth,expirationMonth);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement sendTextToExpirationYear;

    public void sendTextToExpirationYear(String expirationYear) {
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement sendTextToCardCode;

    public void sendTextToCardCode(String cardCode) {
        sendTextToElement(sendTextToCardCode, cardCode);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue3;

    public void clickOnContinue3() {
        clickOnElement(clickOnContinue3);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod;

    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPaymentMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//span[text()[normalize-space()='2nd Day Air']]")
    WebElement verifyShoppingMethod;

    public String verifyShoppingMethod() {
        return getTextFromElement(verifyShoppingMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//strong[text()='$698.00'])[2]")
    WebElement verifyTotalPrice;

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement clickOnConfirm;

    public void clickOnConfirm() {
        clickOnElement(clickOnConfirm);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;

    public String verifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifySuccessfully;

    public String verifySuccessfully() {
        return getTextFromElement(verifySuccessfully);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement clickOnContinue4;

    public void clickOnContinue4() {
        clickOnElement(clickOnContinue4);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToOurStore;

    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStore);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickOnLogout;

    public void clickOnLogout() {
        clickOnElement(clickOnLogout);
    }
    public String verifyCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
