package com.tests.owner;

import com.util.owner.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class RunnerWithOwner {

    //Property file and equivalent interface = same package

    public static void main(String[] args) {

        FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        System.out.println(config.browser());


        System.out.println(config.browser());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println(config.timeout());
        driver.manage().timeouts().implicitlyWait(config.timeout(), config.value());

        System.out.println(config.gridUrl());

        List<String> favtools = config.favtools();
        for (String s: favtools) {
            System.out.println(s);
        }

        if(config.takescreenshot()){
            //write code to take screenshot
           }


    }
}
