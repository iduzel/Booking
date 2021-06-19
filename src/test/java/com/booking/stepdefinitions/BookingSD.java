package com.booking.stepdefinitions;

import com.booking.pages.BookingPage;
import com.booking.utilities.ConfigurationReader;
import com.booking.utilities.Driver;
import io.cucumber.java.en.Given;
import com.booking.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BookingSD {

    BookingPage book = new BookingPage();

    @Given("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Thread.sleep(500);

    }

    @Given("Hotel linkine tiklar")
    public void hotel_linkine_tiklar() throws InterruptedException {
        book.selectHotel.click();
        Thread.sleep(500);


    }




    @Given("Kutuya New York yazar")
    public void kutuya_new_york_yazar() throws InterruptedException {
        book.searchBoxWhere.sendKeys("New York");
        Thread.sleep(500);
        book.akzeptieren.click();
        Thread.sleep(500);


    }
    @Given("CheckIn-Out linkine tiklar")
    public void check_in_out_linkine_tiklar() throws InterruptedException {
        book.CheckInOut.click();
        Thread.sleep(500);

        book.checkInDate.click();
        Thread.sleep(500);

        book.checkOutDate.click();
        Thread.sleep(500);


    }

    @Given("adult-children-room linkine tiklar ve bilgileri girer")
    public void adult_children_room_linkine_tiklar_ve_bilgileri_girer() throws InterruptedException {

        book.howManyPeople.click();
        Thread.sleep(500);

        book.childPlusButton.click();
        Thread.sleep(500);

        book.ageNeeded.click();Thread.sleep(500);

        Select select = new Select(book.ageNeeded);

       select.selectByValue("12");
       Thread.sleep(500);
    }

    @Given("kullanici search butonuna tiklar")

    public void kullanici_search_butonuna_tiklar() throws InterruptedException {

        book.searchButton.click();
        Thread.sleep(500);

        book.lowestFirst.click();
        Thread.sleep(500);

        List<WebElement> list= Driver.getDriver().findElements(By.xpath("//*[@id='hotellist_inner']/div//h3/a/span[1]"));

         for (WebElement w : list){

             System.out.println(w.getText());
         }

         List<WebElement> priceList = Driver.getDriver().findElements(By.xpath("//div[@class='prco-inline-block-maker-helper']"));

         for(WebElement wPrice : priceList){
             System.out.println(wPrice.getText());
         }



    }

}
