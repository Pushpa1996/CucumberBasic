Feature: To check gmail app
Scenario: To check signin with valid username and password
Given: user lauch the browser
When   user enter url "gmail.com"
And user enter username as "pushdwdvfdpa@gmail.com"
And user enter password as "test123"
And user click signin button
Then page title should be "gmail.com"
