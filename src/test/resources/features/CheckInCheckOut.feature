@CheckInCheckOut
Feature: CheckIn/CheckOut

  Background: 
    Given User logs in wth valid email 1024 and password Che@1234

  @OfficeVisit
  Scenario Outline: Checking the Office visit
    When user clicks on CheckInCheckOuticon
    And selects VisitType <visittype>
    And click on Office In button
    And click on Office Out button

    Examples: 
      | visittype    |
      | office visit |

  @CustomerVisit
  Scenario Outline: Checking the Customer visit
    When user clicks on CheckInCheckOuticon
    And selects VisitType <visittype>
    And selects Customer<customer>
    And selects CVP No <cvpno>
    And Check the RadioButton<cvno>
    And Click on CheckIn button
    And enter the Remarks as <remarks>
    And upload File <filepath>
    And Click on CheckOut button

    Examples: 
      | visittype      | customer      | cvpno | cvno | remarks | filepath                                                     |
      | customer visit | 3K ENTERPRISE |  6854 | 1094 | testing | C:\\Users\\Admin\\Downloads\\7.Cucumber Group Tags 9 (4).png |
