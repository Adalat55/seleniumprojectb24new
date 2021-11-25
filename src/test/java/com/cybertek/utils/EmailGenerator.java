package com.cybertek.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailGenerator {
    public static String emailGenerator(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://generator.email/");

        WebElement firstHalf = driver.findElement(By.id("email_ch_text"));

        String email = firstHalf.getText();
        driver.quit();
        return email;

    }
}
