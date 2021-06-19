package com.booking.pages;

import com.booking.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

    public BookingPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//nav[2]/ul/li[1]")
    public WebElement selectHotel;

    @FindBy (id = "ss")
    public WebElement searchBoxWhere;

   @FindBy(xpath = "//div[@class='xp__dates-inner']")
    public WebElement CheckInOut;

    @FindBy(xpath = "//*[text()='Akzeptieren']")
    public WebElement akzeptieren;

   @FindBy(xpath = "//*[@aria-label='10 Juli 2021']")
    public WebElement checkInDate;

    @FindBy(xpath = "//*[@aria-label='17 Juli 2021']")
    public WebElement checkOutDate;

    @FindBy(id = "xp__guests__toggle")
    public WebElement howManyPeople;

    @FindBy(xpath = "//*[@aria-label='Erwachsene: Anzahl erhöhen']")
    public WebElement adultPlusButton;

    @FindBy(xpath = "//*[@aria-label='Kinder: Anzahl erhöhen']")
    public WebElement childPlusButton;

    @FindBy(xpath = "//*[@name='age']")
    public WebElement ageNeeded;

    @FindBy(xpath = "//*[@aria-label='Kind 1 Alter']/option[@value='12']")
    public WebElement childAge12;

    @FindBy(xpath = "//*[@*='xp__button']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@data-id='price']")
    public WebElement lowestFirst;




}
