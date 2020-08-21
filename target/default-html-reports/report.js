$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/modules.feature");
formatter.feature({
  "name": "user should be able to see the modules",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to see the modules",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@modules"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should verify page title is \"Comprar y Vender Electrónica, Moda, Móviles y mucho más | eBay\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ebay.stepDefs.searchItemStepDefs.user_should_verify_page_title_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see the following modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.stepDefs.modulesStepDefs.user_should_be_able_to_see_the_following_modules(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
});