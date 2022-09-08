Feature: Add to Basket
@basket
Scenario Outline: Add-to-Basket View-Basket Functionality

Given click on Shop menu
When Click on the Add To Basket button which adds that book to your basket
Then User can view that Book in the Menu item with price .
Then Now click on View Basket link which navigates to proceed to check out page.
Then Now user can find total and subtotal values just above the Proceed to Checkout button.
And The total always < subtotal because taxes are added in the subtotal
And Now click on Proceed to Check out button which navigates to payment gateway page.
Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
Then Now click on Place Order button to complete process
And On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.