
@tag
Feature: Login 
  I want to use this template for my feature file

  @tag1
  Scenario: Login with Correct Credentials 
  Given User is on Landing Page 
  When user dismisses popup
  When user clicks Sign In
  When user enter username
  Then user closes browser 	
    