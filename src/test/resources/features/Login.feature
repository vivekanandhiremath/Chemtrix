Feature: Login functionality

  @sanity
  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User enters valid email address <username> into email field
    And User enters valid password <password> into password field
    And User clicks on Login button
    Then User should get successfully logged in

    Examples: 
      | username | password |
      |     1024 | Che@1234 |
      |     1077 | Che@1234 |
      |     1010 | Che@1234 |
      |     1082 | Che@1234 |

  @sanity
  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters invalid email address into email field
    And User enters invalid password "Che@1234" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  @sanity
  Scenario: Login with valid email and invalid password
    Given User navigates to login page
    When User enters valid email address "1024" into email field
    And User enters invalid password "1234567890" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  @sanity
  Scenario: Login with invalid email and valid password
    Given User navigates to login page
    When User enters invalid email address into email field
    And User enters valid password "Che@1234" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  @sanity
  Scenario: Login without providing any credentails
    Given User navigates to login page
    When User dont enter email address into email field
    And User dont enter password into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch
 #@regression
    #Scenario:Login with valid credential
        #Given User logs in wth valid email 1024 and password Che@1234
    #
