Feature: Readmore 

Scenario Outline: Shop-Read More Functionality


Given Click on Shop Menu
When  Click on read more button in home page
Then Read More option indicates the Out Of Stock.
Then User cannot add the product which has read more option as it was out of stock.  
