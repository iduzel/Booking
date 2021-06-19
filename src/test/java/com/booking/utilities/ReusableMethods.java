package com.booking.utilities;

public class ReusableMethods {

    public static void amazonMainPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public static void wait(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
