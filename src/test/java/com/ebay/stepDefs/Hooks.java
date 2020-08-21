package com.ebay.stepDefs;

import com.ebay.utilities.ConfigurationReader;
import com.ebay.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void Before(){
        Driver.get().get(ConfigurationReader.getValue("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After("@report")
    public void After(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            //Down Casting
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

}
