@CollectioEntry
Feature: To Test Collection Entry

  @CreateCollectionEntryByTSM
  Scenario Outline: Checking the functionality of the Creating the Collection Entry
    Given User logs in wth valid email 1082 and password Che@1234
    When user clicks on CollectionEntry Icon
    And user clicks on Create Collection Entry Button
    And user Enters Customer Name as <customer>
    And user Enters Remarks as <customerremarks>
    And user Selects Invoice no as <invoiceno>
    And user Enters Enters Bankndetails <modeofpayment> <bank> <chequeamount> <chequenumber> <chequedate> <utrno> <transactiondate>
    And user clicks on Submit button

    Examples: 
      | customer                   | customerremarks | invoiceno | modeofpayment | bank     | chequeamount | chequenumber | chequedate | paymentremarks | utrno         | transactiondate | onlineamount | amount |
      | AFFORDABLE WATER SOLUTIONS | Testing         | inv       | Online          | somebank |         1000 |         1234 | 23/08/2023 | Testing        | 1234567890123 | 23/08/2023      |         1000 |   1000 |

  @EditCollectionEntry
  Scenario Outline: Checking the functionality of the Editing the Collection Entry
    Given User logs in wth valid email 1082 and password Che@1234
    When user clicks on CollectionEntry Icon
    When user clicks on Edit Icon
    And user updates Remarks as <customerremarks>
    And user updates bank details <modeofpayment> <bank> <chequeamount> <chequenumber> <chequedate> <utrno> <transactiondate>
    And user clicks on Update button

    Examples: 
      | customerremarks | modeofpayment | bank           | chequeamount | chequenumber | chequedate | paymentremarks  | utrno         | transactiondate | onlineamount | amount |
      | Edit Testing    | Online        | diffferentbank |         2000 |         1234 | 23	/08/2023 | Updated Testing | 1234567890123 | 23/08/2023      |         1000 |   1000 |

  @ApproveByBm
  Scenario: Checking the Functionality of the BM aproval flow
    Given User logs in wth valid email 1004 and password Che@1234
    When user clicks on CollectionEntry Icon
    And search For collection Entry
    And user clicks on View Icon
    And click on Approve button

     @ApproveByMIS
  Scenario:  Checking the Functionality of the MIS aproval flow
    Given User logs in wth valid email 1107 and password Che@1234
    When user clicks on CollectionEntry Icon
    And search For collection Entry
    And user clicks on View Icon
    And click on Approve button

    
      