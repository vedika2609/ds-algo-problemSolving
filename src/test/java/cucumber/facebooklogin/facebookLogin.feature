Feature: annotation
#This is how background can be used to eliminate duplicate steps

  Background:
  User navigates to Facebook Given
  I am on Facebook login page
	
#Scenario with AND
  Scenario:
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then login should fail

#Scenario with BUT
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then login should fail
    But Relogin option should be available