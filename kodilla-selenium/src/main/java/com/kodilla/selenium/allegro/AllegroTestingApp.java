package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement consent = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]"));
        consent.click();

        WebElement category = driver.findElement(By.cssSelector("select.mr3m_1"));
        Select subcategory = new Select(category);
        subcategory.selectByIndex(3);

        WebElement product = driver.findElement(By.cssSelector("input.msts_pt"));
        product.sendKeys("Mavic mini");
        product.submit();
    }
}