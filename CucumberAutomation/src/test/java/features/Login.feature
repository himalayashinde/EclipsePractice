Feature: Application Login

Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with "jin" and "1234"
Then Homepage is populated 
And Cards displayed are "true"


Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with "john" and "4321"
Then Homepage is populated 
And Cards displayed are "False"

