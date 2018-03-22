Feature: Login Action

Scenario: Test  login with valid credentials
    Given open browser and start application
    When I enter valid Username as "manohar.sureshbabu@cns-inc.com" and valid Password as "XXXX"
    Then User should be able to login successful
    And Close the Browser 
    #Examples:
   
    
#Scenario: Login Negative Case
	#Given open browser and start application
    #When I enter valid username and password
    #Then Login should be failed
