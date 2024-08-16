@VisitPlanning
Feature: To Test Visit Planning

  @CreateWithAllField
  Scenario Outline: Create Visitplanning with All Field
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters phone number<customertype> <PhoneNumber>
    And user entrers email <customertype> <email>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Submit button
    And TSM user check for the Status
    Examples: 
      | customertype | Customer   | purposeVisit   | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry | 27/09/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| sl           | enterprise | Salesorder     | 27/09/202  | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      #| random       | enterprise | Prospect Entry | 27/09/202  | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      #| random       | enterprise | Prospect Entry | 27/09/202  | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      #| random       | enterprise | Prospect Entry | 27/09/202  | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      #| random       | enterprise | Prospect Entry | 27/09/202  | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |

  @CreateWithMandatory
  Scenario Outline: Create Visitplanning with Mandatory Fields
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Submit button
    And TSM user check for the Status

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @ValidationCheck
  Scenario Outline: Check Visitplanning Validation
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And Clicks on Submit button
    And user enters Customer name <customertype> <Customer>
    And Clicks on Submit button
    And select the purpose of visit <purposeVisit>
    And Clicks on Submit button
    And user enters visit date <date>
    And Clicks on Submit button
    And user enters visit time<VisitTime>
    And Clicks on Submit button
    And user enters address <customertype> <address>
    And Clicks on Submit button
    And user enters visitremarks <remarks>
    And Clicks on Submit button
    And TSM user check for the Status

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @SaveAsDraftAllField
  Scenario Outline: Save Visitplanning with SaveAsDraftAllField
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters phone number<customertype> <PhoneNumber>
    And user entrers email <customertype> <email>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Save as Draft button
    And TSM user check for the Status

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @AddEntry
  Scenario Outline: Create Visitplanning with AddEntry
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Add entry button
    And user enters Second Customer name <Customer2>
    And select the Second purpose of visit <purposeVisit2>
    And user enters Second visit date <date2>
    And user enters Second visit time<VisitTime2>
    And user enters Second address <address2>
    And user enters Second remarks <remarks2>
    And Clicks on Submit button

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @EditVisitPlan
  Scenario Outline: To Update Visitplanning
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Submit button
    And Clicks on Edit Icon
    And user enters visit date <date>
    And user edit phone number <PhoneNumber>
    And user edit email <email>
    And Clicks on Update button

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @DataDriven
  Scenario Outline: Create Visitplanning with All Field With Multiple data
    Given User logs in wth valid email 1018 and password Che@1234
    When user clicks on create VisitPlanning button
    And user enters Customer name <customertype> <Customer>
    And select the purpose of visit <purposeVisit>
    And user enters visit date <date>
    And user enters visit time<VisitTime>
    And user enters phone number<customertype> <PhoneNumber>
    And user entrers email <customertype> <email>
    And user enters address <customertype> <address>
    And user enters visitremarks <remarks>
    And Clicks on Submit button

    Examples: 
      | customertype | Customer   | purposeVisit    | date       | VisitTime | PhoneNumber | email                       | address           | remarks                 |
      | random       | enterprise | Prospect Entry  | 30/12/2023 | 08:00     |  6368293892 | RandomCustomer@chemtrix.com | someRandomAddress | Random Customer Remarks |
      | sl           | enterprise | Salesorder      | 30/12/2023 | 08:00     |  6728398292 | s@gmail.com                 | someaddress       | SL Customer someremarks |
      | pl           | altrocks   | Sales Quotation | 30/12/2023 | 08:00     |  6728398292 | something@gmail.com         | someaddress       | PL Custome              |

  @BMApprove
  Scenario Outline: To Approve a Visit Plan
    Given BM logs in wth valid email 1014 and password Che@1234
    When Click on Visit Plan icon
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And Click on Approve Button
    Then Click on PopUp
    And BM user check for the Status

    Examples: 
      | entrytype | cvpno | enquiryremark     |
      | auto      |  1018 | Need More Details |

  @BMReject
  Scenario Outline: To Reject a Visit Plan
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Visit Plan icon
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And Click on View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    Then Click on PopUp
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And BM user check for the Status

    Examples: 
      | resonforrejection    | rejectionremarks         |
      | Price increased high | Price has been increased |

  @BMEnquiry
  Scenario Outline: To enquiry a Visit Plan
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Visit Plan icon
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And Click on View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    Then Click on PopUp
    Then Click on Back Button
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And user check for sales order Enquiry Status

    Examples: 
      | entrytype | cvpno | enquiryremark     |
      | auto      |  1018 | Need More Details |

  @TsmEnquiryReply
  Scenario Outline: Tsm reply for a enquiry in visit plan
    Given User logs in wth valid email 1082 and password Che@1234
    When Click on Visit Plan icon
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And Click on View Icon
    And Enter <enquiryremark> in the Enquiry Reply field
    And Click on Reply
    Then Click on PopUp
    Then Click on Back Button
    Then Search and click on view icon for CvpNo Number <entrytype> <cvpno>
    And user check for sales order Enquiry Status

    Examples: 
     | entrytype | cvpno | enquiryremark     |
      | auto      |  1018 | Need More Details |

  @BMapprovePendingInqueryStatus
  Scenario Outline: To Approve a Visit Plan
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Visit Plan icon
    Then select filter option as <filter>
    And Click on View Icon
    And Click on Approve Button
    Then Click on PopUp
    Then Search for CvpNo Number
    And user check for sales order ApprovedStatus
    Examples:
|filter|
||