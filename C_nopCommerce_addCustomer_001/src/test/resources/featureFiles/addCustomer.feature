@SmokeTest
Feature: Add customer feature

  Scenario Outline: Check whether the customer appears, after Adding Customer in add customer feature and search it by name
    Given user is in login page as "Your store. Login"
    When user should enters the "<email>" and "<password>"
    And user click on login button
    And user is in Dashboard page "Dashboard / nopCommerce administration"
    Then click on customers option
    And click on customers button on customer option
    And click on addnew customer button
    And Fill the valid customer details and save
    And message should shown as "The new customer has been added successfully."
    Then enter the mail id "<mail>" and search it
    And scroll down and take a screenshot

    Examples: 
      | email               | password | mail              |
      | admin@yourstore.com | admin    |google3@gmail.com |
