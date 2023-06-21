
Feature: LinkedIn application testing
Scenario: Search for a job
Given I am logged in to LinkedIn
When I search for a job with keyword "Software Engineer" and location "Hyderabad"


Scenario: Search for a company
Given I am logged in to LinkedIn
When I search for a company with keyword "Google"
Then I should see the company page for Google

Scenario: Search for a friend and send a connection request

When I search for a friend with keyword "John Doe"
And I send a connection request to John Doe
Then John Doe should receive my connection request