@user1
Feature: As a user I should be able to apply Senior Quality Assurance Engineer position


 Scenario: Accessing Raymond James page searching for  Senior Quality Assurance Engineer position
 Given user is on the home page
   When user verify that title contains "Raymond James | LIFE WELL PLANNED"
   And user scroll down to Carriers tab and clicks on it
   And user navigates to carriers page and clicks on Search Open Positions
   And user types Senior Quality Assurance Engineer in the keyword box
   And user clicks on the magnifier search
   And user clicks on Senior Quality Assurance Engineer link
   And user clicks on Apply Online button
   And user is on the log in page type "Piroska01" and "Csipike1980$"
   And user clicks Login button
   Then user verify Job Search text

