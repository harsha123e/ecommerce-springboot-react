# ecommerce-springboot-react
E-commerce website using spring boot and react

## Table of Contents
- [Key Features](#Key-Features)
- [User Stories](#User-Stories)
- [Test Cases](#Test-Cases)

## Key-Features

User Registration and Authentication

Search and Browse Products

Add Products to Cart

Place Orders

Order Tracking

Account Management

Customer Support

Product Reviews and Ratings

Promotions and Discounts

## User-Stories
As a user, I want to be able to see various products when I open website, so that I can explore various products

[User Functionalities](#User-Functionalities) 
- [Guest](#Guest)
- [Buyer](#Buyer)
- [Seller](#Seller)
- [Admin](#Admin)

[General Functionalities](#General-Functionalities) 
- [Search](#Search)
- [Security](#Security)
- [Localization](#Localization)
- [Notifications](#Notifications)

## User Functionalities

## Guest

As a guest, I want to be able to view various products on the website, so I can browse and explore the available options

As a guest, I want to be able to search for products, so I can find specific products I am interested in purchasing

As a guest, I want to be able to add different products to guest cart, so I can buy products I am interested in purchasing

As a guest, I want to sign up for an account, so I can access additional features like buying or selling products

## Buyer

As a buyer, I want to sign in to my account, so I can browse and view various products and my orders and account details

As a buyer, I want to update my profile information and manage my settings, so I can keep my account details up to date and customize my experience

As a buyer, I want to be able to view various products on the website, so I can browse and explore the available options

As a buyer, I want to be able to search for products, so I can find specific products I am interested in purchasing

As a buyer, I want to add products to my shopping cart, so I can collect the products I wish to purchase

As a buyer, I want to be able to review and modify the contents of my shopping cart, so I can adjust quantities or remove products if needed

As a buyer, I want to proceed to the checkout process, so I can provide the necessary shipping and payment details for my purchase

As a buyer, I want to securely complete my payment through integration with a trusted payment gateway, so I can have a smooth and secure transaction experience

As a buyer, I want to view my order history, so I can track my past purchases and check the status of my orders

As a buyer, I want to leave reviews and ratings for products I have purchased, so I can share my feedback with others

As a buyer, I want the website to be responsive and optimized for different devices, so I can easily browse and make purchases from my preferred device

As a buyer, I want to be able to share products or my shopping experience on social media platforms, so I can recommend products to others and engage with the community

## Seller

As a seller, I want to be able to post products to the website, so I can offer them for sale

As a seller, I want to manage my inventory by editing or deleting my posted products, so I can keep my product listings up to date

As a seller, I want to manage incoming orders by reviewing and updating their status, so I can process them accordingly add or update the existing user stories and make it complete

As a seller, I want to be able to track stock levels for my products and receive notifications when inventory is low, ensuring that I can manage my inventory effectively and avoid overselling

As a seller, I want the ability to create and manage promotional campaigns, including discounts, coupons, and special offers, to attract buyers and increase sales

As a seller, I want access to detailed analytics and reports on my product performance, sales, and revenue, empowering me to make data-driven decisions and optimize my business strategy

## Admin

As an admin, I want to have access to a dashboard that provides an overview of website performance, sales, and user activity

As an admin, I want to manage user accounts by approving new registrations, blocking or suspending accounts if necessary, and managing user roles

As an admin, I want to manage product categories and attributes, so I can ensure proper organization and filtering of products

As an admin, I want to manage seller accounts and their associated permissions, so I can maintain control over the sellers on the platform

As an admin, I want to generate reports on sales, revenue, and product popularity, so I can analyze and make data-driven decisions

As an admin, I want to implement fraud prevention measures to detect and prevent fraudulent activities, ensuring a secure and trustworthy environment for users

As an admin, I want a user-friendly content management system (CMS) to manage static website content, such as landing pages, FAQs, and policies, enabling me to update and customize the website easily

## Search
As a user, I want the search functionality to be fast and efficient, providing accurate results even for large product catalogs

## Security

As a user, I want my personal and payment information to be securely encrypted and protected, so I can have peace of mind while making transactions

As a user, I want to be able to reset my password if I forget it, so I can regain access to my account

## Localization

As a user, I want the website to support multiple languages and currencies, so I can have a localized experience based on my preferences

As a user, I want the website to display relevant information based on my location, such as shipping options and availability of products

## Notifications

As a user, I want to receive email notifications for order confirmations, shipment updates, and important account-related information, so I can stay informed about my purchases

As a user, I want to receive personalized recommendations or offers based on my browsing and purchase history, so I can discover new products or promotions

## Test Cases

[User Functionalities Test Cases](#User-Functionalities-Test-Cases) 
- [Guest](#Guest-Test-Cases)
- [Buyer](#Buyer-Test-Cases)
- [Seller](#Seller-Test-Cases)
- [Admin](#Admin-Test-Cases)

[General Functionalities Test Cases](#General-Functionalities-Test-Cases) 
- [Search](#Search-Test-Cases)
- [Security](#Security-Test-Cases)
- [Localization](#Localization-Test-Cases)
- [Notifications](#Notifications-Test-Cases)

## User Functionalities Test Cases

## Guest Test Cases

**User Story: Guest - View Various Products**
 Test Case: Verify that the website displays a list of products when accessed as a guest
   - Steps:
      Open the website as a guest user
      Observe the displayed products
   - Expected Outcome: The website shows a list of various products

**User Story: Guest - Search for Products**
 Test Case: Verify that the guest user can search for products
   - Steps:
      Open the website as a guest user
      Enter a search query in the search bar
      Click on the search button
   - Expected Outcome: The website displays the search results matching the entered query

**User Story: Guest - Add Products to Guest Cart**
 Test Case: Verify that the guest user can add products to the guest cart
   - Steps:
      Open the website as a guest user
      Browse the products
      Click on the "Add to Cart" button for a product
   - Expected Outcome: The selected product is added to the guest cart

**User Story: Guest - Sign up for an Account**
 Test Case: Verify that the guest user can sign up for an account
   - Steps:
      Open the website as a guest user
      Click on the "Sign Up" button
      Fill in the required information in the sign-up form
      Submit the form
   - Expected Outcome: The user is successfully signed up and can access additional features

## Buyer Test Cases

**User Story: Buyer - Sign In to Account**
 Test Case: Verify that the buyer can successfully sign in to their account
   - Steps:
      Navigate to the website
      Click on the "Sign In" button
      Enter valid credentials (username and password) for an existing buyer account
      Click on the "Sign In" button
   - Expected Outcome: The buyer is logged in and directed to their account dashboard

**User Story: Buyer - Update Profile Information**
 Test Case: Verify that the buyer can update their profile information
   - Steps:
      Sign in to the buyer account
      Navigate to the account settings or profile page
      Make changes to the profile information (eg, name, email, address)
      Click on the "Save" or "Update" button
   - Expected Outcome: The profile information is successfully updated

**User Story: Buyer - View Various Products**
 Test Case: Verify that the buyer can view various products on the website
   - Steps:
      Sign in to the buyer account (optional)
      Navigate to the product listing page or homepage
      Browse through the displayed products
   - Expected Outcome: The buyer can see a variety of products on the website

**User Story: Buyer - Search for Products**
 Test Case: Verify that the buyer can search for products
   - Steps:
      Sign in to the buyer account (optional)
      Locate the search bar on the website
      Enter a search query for a specific product
      Click on the search button or press Enter
   - Expected Outcome: The website displays the search results matching the entered query

**User Story: Buyer - Add Products to Shopping Cart**
 Test Case: Verify that the buyer can add products to their shopping cart
   - Steps:
      Sign in to the buyer account (optional)
      Browse through the available products
      Click on the "Add to Cart" button for a desired product
   - Expected Outcome: The product is successfully added to the buyer's shopping cart

**User Story: Buyer - Modify Shopping Cart Contents**
 Test Case: Verify that the buyer can review and modify the contents of their shopping cart
   - Steps:
      Sign in to the buyer account (optional)
      Navigate to the shopping cart page
      Review the products listed in the cart
      Modify the quantities or remove unwanted products if needed
      Click on the "Update Cart" or similar button
   - Expected Outcome: The shopping cart is updated with the desired modifications

**User Story: Buyer - Proceed to Checkout**
 Test Case: Verify that the buyer can proceed to the checkout process
   - Steps:
      Sign in to the buyer account (optional)
      Ensure that there are products in the shopping cart
      Click on the "Checkout" or similar button
   - Expected Outcome: The buyer is directed to the checkout page

**User Story: Buyer - Complete Secure Payment**
 Test Case: Verify that the buyer can securely complete the payment process
   - Steps:
      Sign in to the buyer account (optional)
      Add products to the shopping cart and proceed to checkout
      Enter the necessary shipping and payment details
      Select a trusted payment gateway option


      Complete the payment process as per the selected payment method
   - Expected Outcome: The payment is processed securely, and the buyer receives a confirmation of the successful transaction

**User Story: Buyer - View Order History**
 Test Case: Verify that the buyer can view their order history
   - Steps:
      Sign in to the buyer account
      Navigate to the order history or account settings page
      Locate and click on the "Order History" or similar option
   - Expected Outcome: The buyer can see a list of their past purchases and order details

**User Story: Buyer - Leave Reviews and Ratings**
 Test Case: Verify that the buyer can leave reviews and ratings for products they have purchased
    - Steps:
       Sign in to the buyer account
       Navigate to the product details page of a purchased product
       Find the option to leave a review or rating
       Enter the review text or select a rating
       Submit the review
    - Expected Outcome: The review and rating are successfully submitted and displayed for the respective product

**User Story: Buyer - Responsive and Optimized Website**
 Test Case: Verify that the website is responsive and optimized for different devices
    - Steps:
       Access the website from various devices (eg, desktop, mobile, tablet)
       Browse through the website and perform typical actions
    - Expected Outcome: The website adapts to different screen sizes and provides a user-friendly experience on all tested devices

**User Story: Buyer - Share Products and Shopping Experience on Social Media**
 Test Case: Verify that the buyer can share products or their shopping experience on social media platforms
    - Steps:
       Sign in to the buyer account (optional)
       Find a product or an option to share the shopping experience
       Click on the share or social media icon/button
       Follow the prompts to share the desired content
    - Expected Outcome: The buyer can successfully share the selected product or shopping experience on the chosen social media platform

## Seller Test Cases

**User Story: Seller - Post Products to the Website**
 Test Case: Verify that the seller can successfully post products to the website
   - Steps:
      Sign in to the seller account
      Navigate to the product management or seller dashboard
      Click on the "Add Product" or similar button
      Enter the necessary product details (eg, title, description, price, images)
      Click on the "Post" or "Publish" button
   - Expected Outcome: The product is successfully posted and available for sale on the website

**User Story: Seller - Manage Inventory by Editing or Deleting Products**
 Test Case: Verify that the seller can manage their inventory by editing or deleting posted products
   - Steps:
      Sign in to the seller account
      Navigate to the product management or seller dashboard
      Locate the desired product in the inventory list
      Click on the "Edit" or "Delete" button for the product
   - Expected Outcome:
     - Edit: The seller can modify the product details and save the changes successfully
     - Delete: The product is removed from the inventory and no longer available for sale

**User Story: Seller - Manage Incoming Orders**
 Test Case: Verify that the seller can manage incoming orders by reviewing and updating their status
   - Steps:
      Sign in to the seller account
      Navigate to the order management or seller dashboard
      Find the list of incoming orders
      Select an order to review the details
      Update the order status (eg, pending, processing, shipped)
      Save the changes
   - Expected Outcome: The order status is updated successfully, reflecting the seller's actions

**User Story: Seller - Track Stock Levels and Receive Low Inventory Notifications**
 Test Case: Verify that the seller can track stock levels and receive notifications when inventory is low
   - Steps:
      Sign in to the seller account
      Navigate to the inventory management or seller dashboard
      Locate the stock level information for a product
      Monitor the stock level and ensure it reaches a low threshold
   - Expected Outcome: The seller receives a notification (eg, email, dashboard alert) indicating low inventory for the product

**User Story: Seller - Create and Manage Promotional Campaigns**
 Test Case: Verify that the seller can create and manage promotional campaigns, including discounts, coupons, and special offers
   - Steps:
      Sign in to the seller account
      Navigate to the promotion or marketing section
      Create a new promotional campaign by setting discount percentages, coupon codes, or special offers
      Save the campaign settings
      Monitor the campaign's performance and make necessary adjustments
   - Expected Outcome: The promotional campaign is successfully created and applied to eligible products, attracting buyers and increasing sales

**User Story: Seller - Access Detailed Analytics and Reports**
 Test Case: Verify that the seller can access detailed analytics and reports on product performance, sales, and revenue
   - Steps:
      Sign in to the seller account
      Navigate to the analytics or reporting section
      Select the desired metrics or reports to view
      Apply any filters or date ranges if available
      Generate the report or view the analytics
   - Expected Outcome: The seller can access and view the requested analytics and reports, providing insights into product performance, sales, and revenue

## Admin Test Cases

**User Story: Admin - Access Dashboard for Website Performance**
 Test Case: Verify that the admin can access the dashboard providing an overview of website performance, sales, and user activity
   - Steps:
      Sign in to the admin account
      Navigate to the admin dashboard
      Check if the dashboard displays relevant information such as website performance metrics, sales data, and user activity
   - Expected Outcome: The admin can view the dashboard with accurate and up-to-date information on website performance, sales, and user activity

**User Story: Admin - Manage User Accounts**
 Test Case: Verify that the admin can manage user accounts by approving new registrations, blocking or suspending accounts, and managing user roles
   - Steps:
      Sign in to the admin account
      Navigate to the user management section
      Approve a new user registration
      Block or suspend a user account
      Update the role of a user (eg, promote to a higher role or demote to a lower role)
   - Expected Outcome:
     - New user registration is approved and the user can access their account
     - Blocked or suspended user account is unable to log in or perform actions
     - User role is updated accordingly

**User Story: Admin - Manage Product Categories and Attributes**
 Test Case: Verify that the admin can manage product categories and attributes to ensure proper organization and filtering of products
   - Steps:
      Sign in to the admin account
      Navigate to the product management section
      Add a new product category
      Edit an existing product category
      Add attributes to a category (eg, size, color, material)
   - Expected Outcome:
     - The new product category is successfully added and available for selection
     - The existing product category is modified with the updated information
     - Attributes are associated with the respective product category

**User Story: Admin - Manage Seller Accounts and Permissions**
 Test Case: Verify that the admin can manage seller accounts and their associated permissions
   - Steps:
      Sign in to the admin account
      Navigate to the seller management section
      Approve or reject a seller account registration
      Update seller account permissions (eg, granting or revoking specific privileges)
   - Expected Outcome:
     - Approved seller accounts can access the platform and start selling
     - Rejected seller accounts are unable to access the platform
     - Seller account permissions are updated as per the admin's actions

**User Story: Admin - Generate Reports on Sales, Revenue, and Product Popularity**
 Test Case: Verify that the admin can generate reports on sales, revenue, and product popularity
   - Steps:
      Sign in to the admin account
      Navigate to the reporting or analytics section
      Select the desired metrics or reports related to sales, revenue, and product popularity
      Apply any filters or date ranges if available
      Generate the report or view the analytics
   - Expected Outcome: The admin can access and view the requested reports with accurate and insightful data on sales, revenue, and product popularity

**User Story: Admin - Implement Fraud Prevention Measures**
 Test Case: Verify that the admin can implement fraud prevention measures to detect and prevent fraudulent activities
   - Steps:
      Sign in to the admin account
      Navigate to the fraud prevention section
      Enable fraud detection

 algorithms or services
      Set up rules or thresholds for detecting suspicious activities (eg, multiple failed login attempts, unusual purchase patterns)
      Monitor and review flagged activities or transactions
   - Expected Outcome:
     - Fraud detection measures are successfully implemented and activated
     - Suspicious activities or transactions are flagged for further investigation or action by the admin

**User Story: Admin - User-Friendly Content Management System (CMS)**
 Test Case: Verify that the admin can use the user-friendly content management system (CMS) to manage static website content
   - Steps:
      Sign in to the admin account
      Navigate to the CMS section
      Edit and update static website content such as landing pages, FAQs, and policies
      Save the changes and verify that the updated content is reflected on the website
   - Expected Outcome: The admin can easily update and customize the static website content using the CMS, and the changes are successfully reflected on the website

## General Functionalities Test Cases

## Search Test Cases

**User Story: Search - Fast and Efficient Search Functionality**
 Test Case: Verify that the search functionality provides fast and efficient results, even for large product catalogs
   - Steps:
      Access the website as a user
      Perform a search for a popular product
      Measure the time taken to display the search results
   - Expected Outcome: The search results are displayed within an acceptable time frame, even for large product catalogs

## Security Test Cases

**User Story: Security - Secure Encryption and Protection of Personal and Payment Information**
 Test Case: Verify that personal and payment information is securely encrypted and protected
   - Steps:
      Navigate to the website's registration or account creation page
      Enter personal and payment information
      Submit the information
      Verify that the data is encrypted during transmission (eg, HTTPS protocol)
      Inspect the database to ensure that the stored data is securely encrypted
   - Expected Outcome:
     - The website uses a secure HTTPS connection for data transmission
     - The personal and payment information is stored securely and is not easily accessible or readable

**User Story: Security - Password Reset**
 Test Case: Verify that users can reset their password if forgotten
   - Steps:
      Access the website's login page
      Click on the "Forgot Password" link
      Enter the registered email address
      Follow the instructions provided in the password reset email
      Set a new password
      Attempt to log in using the new password
   - Expected Outcome: The user is able to successfully reset their password and log in with the new password

## Localization Test Cases

**User Story: Localization - Support for Multiple Languages and Currencies**
 Test Case: Verify that the website supports multiple languages and currencies
   - Steps:
      Access the website as a user
      Change the language preference to a different supported language
      Verify that the website content and user interface are displayed in the selected language
      Change the currency preference to a different supported currency
      Verify that product prices and currency symbols are displayed in the selected currency
   - Expected Outcome: The website content and user interface are localized according to the selected language, and product prices are displayed in the selected currency

**User Story: Localization - Display Relevant Information Based on User's Location**
 Test Case: Verify that the website displays relevant information based on the user's location
   - Steps:
      Access the website as a user
      Allow the website to access the user's location
      Verify that shipping options and availability of products are tailored to the user's location
   - Expected Outcome: The website provides shipping options and displays product availability based on the user's location

## Notifications Test Cases

**User Story: Notifications - Email Notifications for Order Confirmations, Shipment Updates, and Account Information**
 Test Case: Verify that users receive email notifications for order confirmations, shipment updates, and important account-related information
   - Steps:
      Place an order on the website
      Verify that an email notification is sent for order confirmation
      Track the shipment status of the order
      Verify that email notifications are sent for shipment updates
      Update account information (eg, email address, password)
      Verify that email notifications are sent for account-related changes
   - Expected Outcome:
     - The user receives email notifications for order confirmation, shipment updates, and account-related information
     - The email notifications are sent to the correct email address

**User Story: Notifications - Personalized Recommendations or Offers Based on Browsing and Purchase History**
 Test Case: Verify that users receive personalized recommendations or offers based on their browsing and purchase history
   - Steps:
      Browse and view several products on the website
      Make a few purchases
      Return to the homepage or product listing page
      Verify that personalized recommendations or offers are displayed based on the browsing and purchase history
   - Expected Outcome: The user is presented with personalized recommendations or offers that are relevant to their browsing and purchase history