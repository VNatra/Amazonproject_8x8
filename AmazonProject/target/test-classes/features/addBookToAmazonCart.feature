Feature: Add Book to Amazon Cart

Scenario: And Book to Amazon Cart
Given I am on Amazon
When I search Spider Man book on Amazon
And I add book to the cart
Then I should see the book is added to the cart