Feature: User hould able to search item

  @search @smoke
  Scenario: User should search MSI GE 66 Raider
    Then user should verify page title is "Comprar y Vender Electrónica, Moda, Móviles y mucho más | eBay"
    And user should search "MSI GE 66 Raider" on the search box
    When user click search buttun user should see the results "GE"
