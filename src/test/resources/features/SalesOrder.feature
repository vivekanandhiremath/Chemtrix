@SalesOrder
Feature: To Test Sales Order

  @CreateSalesOrder
  Scenario Outline: To Create a Sales Order With All Field
    Given TSM logs in wth valid email 1018 and password Che@1234
    When User Clicks on Sales Order icon
    And Clicks on Create Sales order button
    And Enter <customer> in the Customer Bill To text field
    And Enter <porefno> in the POREFNo text field
    And Enter <porefnoDate> in the PoRef DatePicker
    And Enter <pandf> in the PandF num field
    And Select the <discountType> from the Discount Type
    And Enter <insurance> in the Insurance num field
    And Select the <deliveryterms> from the Delivery Terms
    And Enter <proformainvoice> in the ProformaInvoice field
    And Select the <modeofshipment> from the ModeOfShipment
    And Enter <freight> in the Freight num field
    And Select the <freightmode> from the FreightMode
    And Select the <freightstatus> from the FreightStatus
    And Select the <insurancemode> from the InsuranceMode
    And Enter <productgroup> in the search product group field
    And Enter <product> in the search product field
    And Click on Add button
    And Select the <paymentterms> from the Payment Terms
    And Enter <quantity> in the Quantity field
    And Enter <rate> in the rate field
    And Enter <committeddt> in the Committed Date DatePicker
    And Enter <custreqdt> in the Customer Req Date DatePicker
    And Click on Create Button
    Then Click on PopUp
    And user check for sales order no

    Examples: 
      | customer | porefno | porefnoDate | committeddt | custreqdt  | pandf | discountType   | insurance | deliveryterms | proformainvoice | paymentterms | agent | modeofshipment | freight | freightmode | freightstatus | insurancemode | transporton | productgroup | product   | quantity | rate |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Gen          | AN1kg0001 |        2 | 1000 |

  @EditSalesOrder
  Scenario Outline: To Update a Sales Order
    Given TSM logs in wth valid email 1082 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on Edit Icon
    And Enter <porefno> in the POREFNo text field
    And Enter <porefnoDate> in the PoRef DatePicker
    And Enter <pandf> in the PandF num field
    And Select the <discountType> from the Discount Type
    And Enter <insurance> in the Insurance num field
    And Select the <deliveryterms> from the Delivery Terms
    And Enter <proformainvoice> in the ProformaInvoice field
    And Select the <modeofshipment> from the ModeOfShipment
    And Enter <freight> in the Freight num field
    And Select the <freightmode> from the FreightMode
    And Select the <freightstatus> from the FreightStatus
    And Select the <insurancemode> from the InsuranceMode
    And Select the <transporton> from the Transport On
    #And Enter <productgroup> in the search product group field
    #And Enter <product> in the search product field
    #And Click on Add button
    #Then Click on PopUp
    And Select the <paymentterms> from the Payment Terms
    #And Enter <quantity> in the Quantity field
    #And Enter <rate> in the rate field
    #And Enter <committeddt> in the Committed Date DatePicker
    #And Enter <custreqdt> in the Customer Req Date DatePicker
    And Click on Update Button

    Examples: 
      | customer | porefno | porefnoDate | committeddt | custreqdt  | pandf | discountType   | insurance | deliveryterms | proformainvoice | paymentterms | agent | modeofshipment | freight | freightmode | freightstatus | insurancemode | transporton | productgroup | product | quantity | rate |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        40 | FOB           | abc123          | 60 Days      | 3k    | By Sea         |      30 | Auto        | Pending       | By Us         | Company     | Gen          | AN      |        4 | 2000 |

  @CreateSalesOrderWithMandatory
  Scenario Outline: To Create a Sales order With Mandatory field
    Given TSM logs in wth valid email 1018 and password Che@1234
    When User Clicks on Sales Order icon
    And Clicks on Create Sales order button
    And Enter <customer> in the Customer Bill To text field
    And Enter <porefno> in the POREFNo text field
    And Enter <porefnoDate> in the PoRef DatePicker
    And Select the <modeofshipment> from the ModeOfShipment
    And Select the <freightmode> from the FreightMode
    And Select the <freightstatus> from the FreightStatus
    And Select the <deliveryterms> from the Delivery Terms
    And Select the <transporton> from the Transport On
    And Enter <productgroup> in the search product group field
    And Enter <product> in the search product field
    And Click on Add button
    And Enter <quantity> in the Quantity field
    And Enter <rate> in the rate field
    And Enter <committeddt> in the Committed Date DatePicker
    And Enter <custreqdt> in the Customer Req Date DatePicker
    And Click on Create Button
    Then Click on PopUp
    And user check for sales order no

    Examples: 
      | customer | porefno | porefnoDate | committeddt | custreqdt  | pandf | discountType   | insurance | deliveryterms | proformainvoice | paymentterms | agent | modeofshipment | freight | freightmode | freightstatus | insurancemode | transporton | productgroup | product    | quantity | rate |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |

  @SalesOrderSaveAsDraft
  Scenario Outline: To Save A Sales Order in Draft
    Given TSM logs in wth valid email 1014 and password Che@1234
    When User Clicks on Sales Order icon
    And Clicks on Create Sales order button
    And Enter <customer> in the Customer Bill To text field
    And Enter <porefno> in the POREFNo text field
    And Enter <porefnoDate> in the PoRef DatePicker
    And Enter <pandf> in the PandF num field
    And Select the <discountType> from the Discount Type
    And Enter <insurance> in the Insurance num field
    And Select the <deliveryterms> from the Delivery Terms
    And Enter <proformainvoice> in the ProformaInvoice field
    #And Enter <agent> in the Agent text field
    And Select the <modeofshipment> from the ModeOfShipment
    And Enter <freight> in the Freight num field
    And Select the <freightmode> from the FreightMode
    And Select the <freightstatus> from the FreightStatus
    And Select the <insurancemode> from the InsuranceMode
    And Select the <transporton> from the Transport On
    And Enter <productgroup> in the search product group field
    And Enter <product> in the search product field
    And Click on Add button
    #And Select the <paymentterms> from the Payment Terms
    And Enter <quantity> in the Quantity field
    And Enter <rate> in the rate field
    And Enter <committeddt> in the Committed Date DatePicker
    And Enter <custreqdt> in the Customer Req Date DatePicker
    And Click on Save AS Draft
    Then Click on PopUp
    And user check for sales order no

    Examples: 
      | customer | porefno | porefnoDate | committeddt | custreqdt  | pandf | discountType   | insurance | deliveryterms | proformainvoice | paymentterms | agent | modeofshipment | freight | freightmode | freightstatus | insurancemode | transporton | productgroup | product   | quantity | rate |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Sanitizer    | ANOTHE0009 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |
      | ACV      | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Nitric Acid  | ANOTHE0001 |        2 | 1000 |

  @SalesOrderValidation
  Scenario Outline: To Check for validation in Sales Order
    Given TSM logs in wth valid email 1082 and password Che@1234
    When User Clicks on Sales Order icon
    And Clicks on Create Sales order button
    And Click on Create Button
    And Enter <customer> in the Customer Bill To text field
    And Click on Create Button
    And Enter <porefno> in the POREFNo text field
    And Click on Create Button
    And Enter <porefnoDate> in the PoRef DatePicker
    And Click on Create Button
    And Select the <modeofshipment> from the ModeOfShipment
    And Click on Create Button
    And Select the <freightmode> from the FreightMode
    And Click on Create Button
    And Select the <deliveryterms> from the Delivery Terms
    And Click on Create Button
    And Select the <freightstatus> from the FreightStatus
    And Click on Create Button
    And Select the <transporton> from the Transport On
    And Click on Create Button
    And Enter <productgroup> in the search product group field
    And Click on Create Button
    And Enter <product> in the search product field
    And Click on Add button
    And Enter <quantity> in the Quantity field
    And Click on Create Button
    And Enter <rate> in the rate field
    And Click on Create Button
    And Enter <committeddt> in the Committed Date DatePicker
    And Click on Create Button
    And Enter <custreqdt> in the Customer Req Date DatePicker
    And Click on Create Button
    Then Click on PopUp
    And user check for sales order no

    Examples: 
      | customer | porefno | porefnoDate | committeddt | custreqdt  | pandf | discountType   | insurance | deliveryterms | proformainvoice | paymentterms | agent | modeofshipment | freight | freightmode | freightstatus | insurancemode | transporton | productgroup | product   | quantity | rate |
      | 3k e     | po123   | 2023-06-10  | 2023-08-12  | 2023-09-04 |    10 | After Discount |        30 | CIF           | abc123          | 60 Days      | 3k    | By Road        |      30 | Van         | Pending       | By Customer   | Company     | Gen          | AN1kg0001 |        2 | 1000 |

  @Approve
  Scenario Outline: To Approve a Sales Order
    Given BM logs in wth valid email 1014 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Click on Approve Button
    Then Click on PopUp
    Then Search for Saleorder Number
    And user check for sales order ApprovedStatus

  @BMReject
  Scenario Outline: To Reject a Sales Order
    Given BM logs in wth valid email 1014 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    Then Click on PopUp
    Then Search for Saleorder Number
    And user check for sales order RejectStatus

    Examples: 
      | resonforrejection    | rejectionremarks         |
      | Price increased high | Price has been increased |

  @BMForceClosed
  Scenario Outline: To ForceClose a Sales Order
    Given BM logs in wth valid email 1014 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Click on ForceClose Button
    Then Click on Yes PopUp
    Then Click on PopUp
    Then Search for Saleorder Number
    And user check for sales order ForceclosedStatus

  @BMEnquiry
  Scenario Outline: To Enquiry a Sales Order
    Given BM logs in wth valid email 1014 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    Then Click on PopUp
    Then Click on Back Button
    Then Search for Saleorder Number
    And user check for sales order Enquiry Status

    Examples: 
      | enquiryremark     |
      | Need More Details |

  @TsmEnquiryReply
  Scenario Outline: Tsm Reply for Enquiry
    Given TSM logs in wth valid email 1082 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Enter <enquiryremark> in the Enquiry Reply field
    And Click on Reply
    Then Click on PopUp
    Then Click on Back Button
    Then Search for Saleorder Number
    And user check for sales order Enquiry Status

    Examples: 
      | enquiryremark              |
      | That is all details I have |

  @TsmForceClosed
  Scenario Outline: Tsm ForceClose for Enquiry
    Given TSM logs in wth valid email 1082 and password Che@1234
    When User Clicks on Sales Order icon
    Then Search for Saleorder Number
    And Click on View Icon
    And Click on ForceClose Button
    Then Click on Yes PopUp
    Then Click on PopUp
    Then Search for Saleorder Number
    And user check for sales order ForceclosedStatus
