package com.ebay.stepDefs;

import com.ebay.pages.BasePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class modulesStepDefs {
BasePage bp=new BasePage();
    @Then("user should be able to see the following modules")
    public void user_should_be_able_to_see_the_following_modules(List<String> modulesName) {
          for (int i=0; i<modulesName.size(); i++){
             // System.out.print(modulesName.get(i)+" ");
             // System.out.println(bp.modulesName.get(i).getText());
              Assert.assertEquals("Module name is not matching.",modulesName.get(i),bp.modulesName.get(i).getText());
          }
    }
}
