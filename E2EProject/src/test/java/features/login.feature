Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://rahulshettyacademy.com/#/index" site
And Click on login link in home page to land on secure sign in page
When User enters <username> and <password> and Logs in
Then Verify that user is successfully logged in
And close all browsers

Examples:
|username 		   | password |
|test99@gmail.com  | 123456	  |
|test123@gmail.com | 12345    |


