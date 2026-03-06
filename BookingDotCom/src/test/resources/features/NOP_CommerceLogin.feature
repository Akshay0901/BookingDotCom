#Author: your.email@your.domain.com
 

@tag
Feature: NOP Commerce Demo Login Feature

  @tag1
  Scenario: Login as admin
    Given User is on Landing Page 
    When User enters username
		And User enters password 
		And  User clicks log in 
		Then User can see dashboard
   