Feature: Delete Request
Scenario: User want to delete user by ID
When user want to delete user by using URI "http://localhost:8080/admin/hospital?id=10"
Then user Want tO VeriFy the StatusLine "HTTP/1.1 200 "
And  User should able to get StatusCode 200