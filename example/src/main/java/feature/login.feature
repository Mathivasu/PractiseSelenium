Feature:Bookcart application demo


Scenario:Login should be success

Given User should navigate to the application
And User click on the login link
And User enter the username as ortoni
And User enter the password as Pass1234
When User click the login button
Then login should be success

Scenario:Login should be fail

Given User should navigate to the application
And User click on the login link
And User enter the username as vasumathi
And User enter the password as Pass123456
When User click the login button
Then login should be fail

