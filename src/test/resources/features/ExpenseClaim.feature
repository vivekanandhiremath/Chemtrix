@ExpenseClaim
Feature: To Test Expense claim

  @CreateExpenseClaim
  Scenario Outline: To check the  Create functionality of the Expense Claim module
    Given TSM logs in with valid email 1018 and password Che@1234
    When User Clicks on ExpenseClaim icon
    And Clicks on Create Expense Claim button
    And User select the Date Of Customer Visit <dateofcustomervisit>
    And User select the VehicleType <vehicletype>
    And User enters the VehicleNo <vehicleno>
    And User enters the StartKM <startkm>
    And user Uploads the Startkm Document <startkmfile>
    And User enters the EndKM <endkm>
    And user Uploads the Endkm Document <endkmfile>
    And User select the VehicleType2 <vehicletype2>
    And User enters the TravelFare2 <travelfare2>
    And User Clicks On the BreakFast CheckBox and uploads document <breakfastbill>
    And User Clicks On the Lodging CheckBox and selects the LodgingCity uploads document <lodgingcity> <lodgingbill>
    And user enters details of other expense <detailsofotherexpense>
    And user enters the Other expense amount and uploads bill <otherexpenseamount> <otherexpensebill>
    And user enters remarks <remarks>
    And User clicks on Submit button

    Examples: 
      | dateofcustomervisit | vehicletype | vehicleno | startkm | startkmfile                                                    | endkm   | endkmfile                                                      | vehicletype2 | travelfare2 | breakfastbill                                                  | lodgingcity    | lodgingbill                                                    | detailsofotherexpense | otherexpenseamount | otherexpensebill                                               | remarks      |
      | 2023-09-06          | Two Wheeler | 32asdas   |   12312 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | 1231244 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | Four Wheeler |        1234 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | Lodging City A | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | asdasdasdas           |                123 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | some remarks |

  @EditExpenseClaim
  Scenario Outline: To Check The Edit Functionality of the Expense Claim module
    Given TSM logs in with valid email 1018 and password Che@1234
    When User Clicks on ExpenseClaim icon
    And Clicks on Edit icon
    And User select the VehicleType <vehicletype>
    And User enters the VehicleNo <vehicleno>
    And User enters the StartKM <startkm>
    And user Uploads the Startkm Document <startkmfile>
    And User enters the EndKM <endkm>
    And user Uploads the Endkm Document <endkmfile>
    And User select the VehicleType2 <vehicletype2>
    And User enters the TravelFare2 <travelfare2>
    And user enters details of other expense <detailsofotherexpense>
    #And user enters the Other expense amount and uploads bill <otherexpenseamount> <otherexpensebill>
    And user enters remarks <remarks>
    And User clicks on update button

    Examples: 
      | vehicletype | vehicleno | startkm | startkmfile                                                    | endkm   | endkmfile                                                      | vehicletype2 | travelfare2 | breakfastbill                                                  | lodgingcity  | lodgingbill                                                    | detailsofotherexpense | otherexpenseamount | otherexpensebill                                               | remarks      |
      | Two Wheeler | 32asdas   |   12312 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | 1231244 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | Four Wheeler |        1234 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | LodgingCityA | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | asdasdasdas           |                123 | D:\\Mylaptop\\Asia Crystal\\Mobile\\ProspectEntry-Create 4.png | some remarks |

  @ApproveByBm
  Scenario Outline: To Check The Edit Functionality of the Expense Claim module
    Given BM logs in with valid email 1004 and password Che@1234
    When User Clicks on ExpenseClaim icon
    And Clicks on view icon <entrytype> <expenseclaimno>
    And clicks on Approve

    Examples: 
      | entrytype | expenseclaimno |
      | auto      |          10010 |
      
      
      @ApproveByEAP
  Scenario Outline: To Check The Edit Functionality of the Expense Claim module
    Given EAP logs in with valid email 1053 and password Che@1234
    When User Clicks on ExpenseClaim icon
    And Clicks on view icon <entrytype> <expenseclaimno>
    And clicks on Approve

    Examples: 
      | entrytype | expenseclaimno |
      | auto      |          9009 |
      
      
      
