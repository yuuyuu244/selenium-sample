package com.kyyk.seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
    /** WebDriver instance. */
    public WebDriver driver;
    /** test target url. */
    private String url;
    
    public void webTest() {
        
        System.setProperty("webdriver.chrome.driver", "/home/yuki/download/chromedriver");
        driver = new ChromeDriver();
        url = "https://www.google.co.jp/";
        
        driver.get(url);
        
        // serching POST input data
        WebElement serchId = driver.findElement(By.id("lst-ib"));
        serchId.clear();
        serchId.sendKeys("seleniumとかマジでわからんねんけど笑");
        serchId.click();
        
        serchId.submit();
        
        driver.quit();
    }
    
    
    /**
     * only execution.
     * @param args
     */
    public static void main(String... args) {
        SeleniumSample _ = new SeleniumSample();
        _.webTest();
    
        
    }

}
