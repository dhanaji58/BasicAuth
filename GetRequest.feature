Feature: Get all requests
Scenario: user want to read the data from database
When User want to fetch the data from database "http://localhost:8080/admin/hospital"
Then User want to verify the status line "HTTP/1.1 200 "
And user want to verify the status code 200
