Feature: Checking Login Functionality of the Application
Scenario Outline: Checking Login Functionality with Valid Username also
  Given User is on Login Page
  When user Enter the Username in "<userName>" and enter the password "<password>"
  Then should click on Login button
Examples:
| userName | password |
|   Admin  | admin123 |

Scenario: Checking Admin Page Functionality
  Given User click on Admin Page
  Then Then click om Add And Fill user details