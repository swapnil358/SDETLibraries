package com.util.owner;

import com.util.enums.BrowserType;
import org.aeonbits.owner.Config;

import java.util.List;
import java.util.concurrent.TimeUnit;

//this is hardcode path, in other systems it might not work
//@Config.Sources(value="file:D:/Automation/SDETLibrary/src/test/resources/FrameworkConfig.properties")

//To avoid the hardcode path
//@Config.Sources(value="file:${user.dir}/src/test/resources/FrameworkConfig.properties")

//Incase if you want to merge the two property file
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/FrameworkConfig.properties",
        "file:${user.dir}/src/test/resources/Grid.properties"
})


public interface FrameworkConfig extends Config {

String browser();

@Config.Key("grid.url")
String gridUrl();

//@Default value only pick when there is no value defined in properties file
@DefaultValue("SECONDS")
TimeUnit value();

@DefaultValue("15")
Long timeout();

//@key value is used to map with key defined in the property file
@Key("takesscreenshot")
boolean takescreenshot();

List<String> favtools();

}
