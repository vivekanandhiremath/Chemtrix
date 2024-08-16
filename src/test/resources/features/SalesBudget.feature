@CheckInCheckOut
Feature: To check The functionality of the Slaes Target Module

  Background: 
    Given User logs in with valid email 1082 and password Che@1234 for Sales Target

  @UploadSalesBudgetDocument
  Scenario Outline: Checking the Office visit
    When user clicks on Sales budget Menu
And Click On Upload Button
And user select the document <filepath>
And user Clicks on Submit Button
And user clicks on ok button from alert popup
And user validates existing and new values for the Quantity and Sales Target on the preview page
And user clicks on preview submit button
    Examples: 
      | filepath    |
      | C:\Users\Admin\Downloads\Sales-Budget.xlsx |
