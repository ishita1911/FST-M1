@activity1
Feature: Google Search

  Scenario: Search cheese in google Page
      Given User is on Google Home Page
      When User types in Cheese and hits ENTER
      Then Show how many search results were shown
      And Close the browser