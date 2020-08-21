Feature: user should be able to see the modules

  @modules @smoke
  Scenario: user should be able to see the modules
    Given  user should verify page title is "Comprar y Vender Electrónica, Moda, Móviles y mucho más | eBay"
    Then user should be able to see the following modules
    |Portada|
    |Favoritos|
    |Electrónica|
    |Casa y Jardín|
    |Moda|
    |Motor|
    |Deportes|
    |Ocio|
    |Arte y coleccionismo|
    |PyME|
    |eBay Solidario|
    |Ofertas de eBay|
    |Por menos de 10€|
