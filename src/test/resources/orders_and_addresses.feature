@OrdersAndAddresses
Feature: Orders And Addresses

  Scenario: Verify that you cannot see “Your Orders” and “Your Addresses” pages if you are not logged in. But you can see “Your Lists” intro screen
    Given A user Go to "https://www.amazon.ae/"
    When  Click on “Hello, sign in Account & Lists” at the top right corner
    Then  Select “Your orders”
    Then  Make sure user can’t see orders when not signed in
    Then Select “Your Addresses”
    Then Make sure user can’t see orders when not signed in
    Then Select “Your Lists”
    Then Make sure user can see the screen