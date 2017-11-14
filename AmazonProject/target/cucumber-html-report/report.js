$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/addBookToAmazonCart.feature");
formatter.feature({
  "line": 1,
  "name": "Add Book to Amazon Cart",
  "description": "",
  "id": "add-book-to-amazon-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6480235646,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "And Book to Amazon Cart",
  "description": "",
  "id": "add-book-to-amazon-cart;and-book-to-amazon-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search Spider Man book on Amazon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I add book to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should see the book is added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.I_Open_Amazon()"
});
formatter.result({
  "duration": 5631068299,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.Search_Book_On_Amazon()"
});
formatter.result({
  "duration": 4438456668,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.Add_Book_To_Cart()"
});
formatter.result({
  "duration": 4506489484,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.Verify_Book_Is_Added_To_Cart()"
});
formatter.result({
  "duration": 4189198692,
  "status": "passed"
});
formatter.after({
  "duration": 1157240161,
  "status": "passed"
});
});