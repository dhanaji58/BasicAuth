
Feature: Put request
Scenario: User want to update data using ID
Given User want to update name as "jonny"
And user Want to update address as "latur"
When User wanT to validate  the Data from database using URI "http://localhost:8080/admin/hospital/24"
Then User WAnt to Checks the Status code 200
