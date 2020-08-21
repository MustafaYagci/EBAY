package com.ebay.stepDefs;

import com.ebay.pages.BasePage;
import com.ebay.pages.SearchPage;
import com.ebay.utilities.ConfigurationReader;
import com.ebay.utilities.Driver;
import com.ebay.utilities.ShortCuts;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class searchItemStepDefs {

    BasePage bp=new BasePage();
    SearchPage sp=new SearchPage();

    @Given("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        Driver.get().get(ConfigurationReader.getValue("url"));
        ShortCuts.staticWait(1);
        bp.cookies.click();
    }

    @Then("user should verify page title is {string}")
    public void user_should_verify_page_title_is(String expectedTitle) {
        ShortCuts.staticWait(2);
      String actualTitle=ShortCuts.pageTitle();
        Assert.assertEquals("The page title is not expected",expectedTitle,actualTitle);


    }

    @Then("user should search {string} on the search box")
    public void user_should_search_on_the_search_box(String item) {
        bp.searchBox.sendKeys(item+ Keys.ENTER);

    }

    @When("user click search buttun user should see the results {string}")
    public void user_click_search_buttun_user_should_see_the_results(String itemName) {
        ShortCuts.staticWait(3);
       Assert.assertTrue(sp.firstAnswer.getText().contains(itemName));
    }
}
