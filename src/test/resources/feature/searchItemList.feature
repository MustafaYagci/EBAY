Feature: user should able to search multiple items
@smoke @multiSearch @report
 Scenario Outline: user should be able to search multiple items
   Then user should verify page title is "Comprar y Vender Electrónica, Moda, Móviles y mucho más | eBay"
   And user should search "<item>" on the search box
   When user click search buttun user should see the results "<results>"
    Examples:

   |item      |  results |
   | Messi    |     Messi|
   | Ronaldo  |   Ronaldo|
   |Basketball|Basketball|