Feature: Login Action

Scenario Outline: Test  login with valid credentials
    Given open browser and start application
    When I enter valid Username as "<uName>" and valid Password as "<pwd>"
    Then User should be able to login successful
    And Close the Browser 
Examples: 
    |uName|pwd|
    |manohar.sureshbabu@cns-inc.com|XXXXXX|
    
#Scenario: Login Negative Case
	#Given open browser and start application
    #When I enter valid username and password
    #Then Login should be failed
