Feature: Login Feature

#Scenario: Valid Login
#Given  User is already on login page
#When User enters login credentials
#Then User us is on Home Page

##Scenario: Valid Login
#Given  User is already on login page
##When User enters "tomsmith" and "SuperSecretPassword!"
#Then User us is on Home Page

#Scenario Outline: Valid Login
#Given  User is already on login page
#When User enters "<username>" and "<password>"
#Then User us is on Home Page

#Examples:
#| username | password|
#| test1 | test123 |
#|tomsmith | SuperSecretPassword! |


#Scenario : Valid Login
#Given  User is already on login page
#When User enters login credentials
##	Then User us is on Home Page



Scenario Outline: Valid Login
Given  User is already on login page
When User enters login credentials
	| username | password|
	|tomsmith | SuperSecretPassword! |
	Then User us is on Home Page