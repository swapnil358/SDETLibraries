package com.util.InterviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        int rowNum = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int colNum = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();

        for (int i = 2; i < rowNum; i++) {
            for (int j = 1; j <= colNum; j++) {
                String name = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                if (name.equalsIgnoreCase("Giovanni Rovelli")) {
                    System.out.println("row: "+i+"  "+"col: "+j);
                    break;
                }
            }

        }
        driver.quit();
    }
}
