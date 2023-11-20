Feature: Add cart
  Scenario: Add a product from the Exito store to the cart
    Given User clicks on the category dropdown menu
    And select any subcategory of the product
    When User adds any product to cart
    And click the my cart button
    Then User will be able to view the product in the shopping cart