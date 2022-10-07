@Cart
Feature: Cart

  Scenario: Verify that Items are added to cart correctly
    Given A user Go to "https://www.amazon.ae/"
    When  Go to Today’s Deals
    Then  Click on 2nd category
    Then  Click on 1st item in this category
    Then Add it to cart with Qty = 3
    Then Go to cart
    Then Verify correct items are added (name, price, qty and subtotal is correct)