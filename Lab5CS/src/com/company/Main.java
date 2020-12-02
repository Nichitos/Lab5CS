package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://amazon.com/");
        WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("computer");

        WebElement header =driver.findElement(By.xpath("//div[@id='navbar']"));

        System.out.println(header.isDisplayed());

        driver.close();
    }
}
