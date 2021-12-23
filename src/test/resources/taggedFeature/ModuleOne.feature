@PhaseOne
Feature: CRM Contact and Deals Feature

@RegressionTest
Scenario: Create a Contact
Given User is loggedIn
When User enters contact details

Scenario: View Contact Details
Given User is loggedIn
When User view contact details

@SmokeTest
Scenario: Update a Contact
Given User is loggedIn
When User update contact details

Scenario: Create a Deal
Given User is loggedIn
When User enters Deal details

Scenario: View Deal Details
Given User is loggedIn
When User view Deal details

Scenario: Update a Deal
Given User is loggedIn
When User update Deal details

Scenario: Logout
Given User logged out