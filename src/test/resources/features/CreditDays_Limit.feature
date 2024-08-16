Feature: To Test Credit Control Modules

  @CreateCreditLimit
  Scenario Outline: To check the functionality of the Create page
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateCreditLimit Button
    And User Select Customer As <customer>
    And User Enters CreditLimit As <creditlimit>
    And User Enters Remarks As <remark>
    Then User Clicks on Create Button
    And User Clicks on Popup

    Examples: 
      | customer         | creditlimit | remark   |
      | AAKHASH AGENCIES |         453 | hzxgygzg |

  @EditCreditLimit
  Scenario Outline: To Update a credit limit
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateCreditLimit Button
    And User Select Customer As <customer>
    And User Enters CreditLimit As <creditlimit>
    And User Enters Remarks As <remark>
    Then User Clicks on Create Button
    And User Clicks on Popup
    Then User Clicks on Edit Icon
    And User Enters CreditLimit As <creditlimit2>
    Then User Clicks on Update Button
    And User Clicks on Popup

    Examples: 
      | customer         | creditlimit | remark   | creditlimit2 |
      | AAKHASH AGENCIES |         453 | hzxgygzg |          320 |

  @CreateCreditDays
  Scenario Outline: To create a credit days
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    And User Clicks on Create Creditdays
    And User Select Customer As <customer>
    And User Select Chemical Type As <chemicaltype>
    And User Select ProductGroup As <productgroup>
    And User Enters CreditDays As <creditdays>
    And User Enters HighLevelCreditDays As <highLevelcreditdays>
    And User Enters Remarks As <remark>
    Then User Clicks on Create Button
    And User Clicks on Popup

    Examples: 
      | customer         | chemicaltype     | productgroup | creditdays | highLevelcreditdays | remark     |
      | AAKHASH AGENCIES | General Chemical | HCL |         54 |                  68 | No Remarks |

  @EditCreditDays
  Scenario Outline: To Update a credit days
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    And User Clicks on Create Creditdays
    And User Select Customer As <customer>
    And User Select Chemical Type As <chemicaltype>
    And User Select ProductGroup As <productgroup>
    And User Enters CreditDays As <creditdays>
    And User Enters HighLevelCreditDays As <highLevelcreditdays>
    And User Enters Remarks As <remark>
    Then User Clicks on Create Button
    And User Clicks on Popup
    Then User Clicks on Edit Icon
    And User Enters CreditDays As <creditdays2>
    And User Enters HighLevelCreditDays As <highLevelcreditdays2>
    Then User Clicks on Update Button
    And User Clicks on Popup

    Examples: 
      | customer | chemicaltype     | productgroup | creditdays | highLevelcreditdays | remark     | creditdays2 | highLevelcreditdays2 |
      | AAKHASH AGENCIES       | General Chemical | General      |         54 |                  68 | No Remarks |          64 |                   90 |

  @BMSUBMITFORREVIEW
  Scenario Outline: Bm Submit For Review
    Given BM logs in wth valid email 1004 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And User Clicks on SUBMIT FOR REVIEW
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | status | AAKHASH AGENCIES      |

  @CCMAPPROVE
  Scenario Outline: CCM Approve the Crrdit Day
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | status | AAKHASH AGENCIES |

  @CCMReject
  Scenario Outline: CCM Reject the Crrdit Day
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    And Click on RejectPopUp
    And User Clicks on Ok Popup

    Examples: 
      | filter | search | resonforrejection    | rejectionremarks         |
      | status | AAKHASH     | Price increased high | Price has been increased |

  @CCMToMD
  Scenario Outline: CCM Sends Credit Day To MD
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on TO MD CheckBox
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | status | AAKHASH     |

  @MDAPPROVE
  Scenario Outline: MD Approve the Credit Day
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | status | AAKHASH     |

  @MDReject
  Scenario Outline: MD Reject the Credit Day
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    And User Clicks on Ok Popup

    Examples: 
      | filter | search | resonforrejection    | rejectionremarks         |
      | status | AAKHASH     | Price increased high | Price has been increased |

  @MDEnquiry
  Scenario Outline: MD Enquiry the Credit Day
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | status | AAKHASH     | Need More Details |

  @CCMEnquiry
  Scenario Outline: CCM Enquiry the Crrdit Day
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    #And Click on Credit Days MyItems
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | status | AAKHASH     | Need More Details |

  @BMEnquiry
  Scenario Outline: Bm Submit For Review
    Given TSM logs in wth valid email 1004 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    #And Click on Credit Days MyItems
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | status | AAKHASH     | Need More Details |

  @TSMEnquiryReply
  Scenario Outline: Bm Submit For Review
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    #And Click on Credit Days MyItems
    And User Clicks View Icon
    And Enter <Reply> in the Enquiry Reply field
    And Click on Reply
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | Reply             |
      | status | AAKHASH     | Need More Details |

  @MDAPPROVE2
  Scenario Outline: MD Approve the Credit Day
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    And User Clicks on CreateDays option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | status | AAKHASH     |

  @BMSUBMITFORREVIEWCreditLimit
  Scenario Outline: BM Submit Credit Limit for Review
    Given TSM logs in wth valid email 1004 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And Click on MyItems
    And User Clicks View Icon
    And User Clicks on SUBMIT FOR REVIEW
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | Status | AAKHASH     |

  @CCMAPPROVECreditLimit
  Scenario Outline: CCM Approve The Credit Limit
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | Status | AAKHASH     |

  @CCMRejectCreditLimit
  Scenario Outline: CCM Reject The Credit Limit
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    And User Clicks on Ok Popup

    Examples: 
      | filter | search | resonforrejection    | rejectionremarks         |
      | Status | AAKHASH     | Price increased high | Price has been increased |

  @CCMToMDCreditLimit
  Scenario Outline: CCM Send The Credit Limit to MD
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on TO MD CheckBox
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | Status | AAKHASH     |

  @MDAPPROVECreditLimit
  Scenario Outline: MD Approve The Credit Limit
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | Status | AAKHASH     |

  @MDRejectCreditLimit
  Scenario Outline: MD Reject The Credit Limit
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    And User Clicks on Ok Popup

    Examples: 
      | filter | search | resonforrejection    | rejectionremarks         |
      | Status | AAKHASH     | Price increased high | Price has been increased |

  @MDEnquiryCreditLimit
  Scenario Outline: MD Enquiry The Credit Limit
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | Status | AAKHASH     | Need More Details |

  @CCMEnquiryCreditLimit
  Scenario Outline: CCM Enquiry The Credit Limit
    Given CCM logs in wth valid email 1107 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | Status | AAKHASH     | Need More Details |

  @BMEnquiryCreditLimit
  Scenario Outline: BM Enquiry The Credit Limit
    Given BM logs in wth valid email 1004 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | enquiryremark     |
      | Status | AAKHASH     | Need More Details |

  @TsmEnquiryReplyCreditLimit
  Scenario Outline: TSM Enquiry The Credit Limit
    Given TSM logs in wth valid email 1082 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Enter <Reply> in the Enquiry Reply field
    And Click on Reply
    And User Clicks on Ok Popup
    Then Click on Back Button

    Examples: 
      | filter | search | Reply             |
      | Status | AAKHASH     | Need More Details |

  @MDAPPROVECreditLimit2
  Scenario Outline: MD Approve The Credit Limit
    Given MD logs in wth valid email 2043 and password Che@1234
    Then User Clicks on CreditControl icon
    And User Clicks on CreditControl Option
    #And User Select Filter Type As <filter>
    And User Enters Search As <search>
    And User Clicks View Icon
    And Click on Approve Button
    And User Clicks on Ok Popup

    Examples: 
      | filter | search |
      | Status | AAKHASH     |
