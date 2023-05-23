package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_Cookies = "//div[contains(@class, \"_4-i2 _pig _al5h _al7j _50f4\")]/div/button[2]";
    public static final String XPATH_Create_Account = "//div[contains(@class, \"_6luv _52jv\")]/form/div[5]/a";
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_Cookies)).click();
        driver.findElement(By.xpath(XPATH_Create_Account)).click();

        Thread.sleep(2000);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectDayOfBirth = new Select(selectComboDay);
        selectDayOfBirth.selectByIndex(10);

        Select selectMonthOfBirth = new Select(selectComboMonth);
        selectMonthOfBirth.selectByIndex(10);

        Select selectYearOfBirth = new Select(selectComboYear);
        selectYearOfBirth.selectByIndex(10);
    }
}
