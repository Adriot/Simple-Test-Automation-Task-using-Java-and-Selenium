# Simple-Test-Automation-Task-using-Java-and-Selenium

Automate the following:

Scenario 1 (Verify that user cannot log in with valid but not registered email)
1. Go to https://www.amazon.ae/
2. Verify user can’t login with valid but not registered email

Scenario 2 ( Verify that Items are added to cart correctly
1. Go to https://www.amazon.ae/
2. Go to Today’s Deals
3. Click on 2nd category
4. Click on 1st item in this category
5. Add it to cart with Qty = 3
6. Go to cart
7. Verify correct items are added (name, price, qty and subtotal is correct)

Scenario 3: (Verify that you cannot see “Your Orders” and “Your Addresses” pages if you are not logged in. But you can see “Your Lists” intro screen)
1. Go to https://www.amazon.ae/
2. Click on “Hello, sign in Account & Lists” at the top right corner
3. Select “Your orders”
4. Make sure user can’t see orders when not signed in
5. Select “Your Addresses”
6. Make sure user can’t see orders when not signed in
7. Select “Your Lists”
8. Make sure user can see the screen

Make sure:
1. Assertions are present for each scenario
2. Report is generated after test run (you can use any report)
3. Screenshots are added when test is failed (You can intentionally fail the test case to check this)
4. Please write detailed steps how to execute tests with report in a word file.

