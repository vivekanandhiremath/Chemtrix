@SalesQuotation
Feature: To Test Sales Quotaion

  @CreateSalesQuotation
  Scenario Outline: To Crete SalesQuotation
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    And Click on create Sales Quotation
    And Enters customer field <customer>
    And Enters CustomerReference field <customerreference>
    And Enters ValidDate <date>
    And Select Transporter <transporter>
    And Select Bank <bank>
    And Select LoadingPort <loadingPort>
    And Select DestinationPort <destinationPort>
    And Select InsuranceType <insuranceType>
    And Search for Productgroup <searchproductgroup>
    And Search for SearchProduct <searchproduct>
    And clicks on ADD
    And Enters InvoiceQuantity <invoicequantity>
    And Enters Rate <rate>
    And Enters Remarks <remarks>
    And Enters P_F_Value <p_f_Value>
    And Enters FreightValue <freightvalue>
    And Enters Internal_Remarks <internal_remarks>
    And Enters External_Remarks <external_remarks>
    And clicks on CREATE button
    And clicks on Popup

    Examples: 
      | customer | customerreference | date       | transporter | bank  | loadingPort | destinationPort | insuranceType | searchproductgroup | searchproduct | invoicequantity | rate | remarks | p_f_Value | freightvalue | internal_remarks | external_remarks |
      | ENT      | asygasdgy         | 30/12/2023 | TO PAY      | ICICI | IRAQ        | NEPAL           | By Us         | Gen                | An            |              45 |  650 | sdasfas |       443 |          345 | axvfa            | automation       |

  @CreateSalesQuotationWithAllField
  Scenario Outline: To Crete SalesQuotation With All Field
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    And Click on create Sales Quotation
    And Enters customer field <customer>
    And Enters CustomerReference field <customerreference>
    And Enters ValidDate <date>
    And Select Transporter <transporter>
    And Select Bank <bank>
    And Select LoadingPort <loadingPort>
    And Select DestinationPort <destinationPort>
    And Select InsuranceType <insuranceType>
    And Search for Productgroup <searchproductgroup>
    And Search for SearchProduct <searchproduct>
    And clicks on ADD
    And Enters InvoiceQuantity <invoicequantity>
    And Enters Rate <rate>
    And Enters Remarks <remarks>
    And Enters P_F_Value <p_f_Value>
    And Enters FreightValue <freightvalue>
    And Enters Internal_Remarks <internal_remarks>
    And Enters External_Remarks <external_remarks>
    And clicks on CREATE button
    And clicks on Popup

    Examples: 
      | customer | customerreference | date       | transporter | bank  | loadingPort | destinationPort | insuranceType | searchproductgroup | searchproduct | invoicequantity | rate | remarks | p_f_Value | freightvalue | internal_remarks | external_remarks |
      | ENT      | asygasdgy         | 30/12/2023 | TO PAY      | ICICI | IRAQ        | NEPAL           | By Us         | Gen                | An            |              45 |  650 | sdasfas |       443 |          345 | axvfa            | automation       |

  @CreateSalesQuotationWithMandatory
  Scenario Outline: To Crete SalesQuotation With Mandatory Field
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    And Click on create Sales Quotation
    And Enters customer field <customer>
    And Enters ValidDate <date>
    And Select Transporter <transporter>
    And Select InsuranceType <insuranceType>
    And Search for Productgroup <searchproductgroup>
    And Search for SearchProduct <searchproduct>
    And clicks on ADD
    And Enters InvoiceQuantity <invoicequantity>
    And Enters Rate <rate>
    And clicks on CREATE button
    And clicks on Popup

    Examples: 
      | customer | customerreference | date       | transporter | bank  | loadingPort | destinationPort | insuranceType | searchproductgroup | searchproduct | invoicequantity | rate | remarks | p_f_Value | freightvalue | internal_remarks | external_remarks |
      | ENT      | asygasdgy         | 30/12/2023 | TO PAY      | ICICI | IRAQ        | NEPAL           | By Us         | Gen                | An            |              45 |  650 | sdasfas |       443 |          345 | axvfa            | automation       |

  @CreateSalesQuotationValidation
  Scenario Outline: To Test Validation check for SalesQuotatio
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    And Click on create Sales Quotation
    And clicks on CREATE button
    And Enters customer field <customer>
    And clicks on CREATE button
    And Enters CustomerReference field <customerreference>
    And clicks on CREATE button
    And Enters ValidDate <date>
    And clicks on CREATE button
    And Select Transporter <transporter>
    And clicks on CREATE button
    And Select Bank <bank>
    And clicks on CREATE button
    And Select LoadingPort <loadingPort>
    And clicks on CREATE button
    And Select DestinationPort <destinationPort>
    And clicks on CREATE button
    And Select InsuranceType <insuranceType>
    And clicks on CREATE button
    And Search for Productgroup <searchproductgroup>
    And clicks on CREATE button
    And Search for SearchProduct <searchproduct>
    And clicks on CREATE button
    And clicks on ADD
    And Enters InvoiceQuantity <invoicequantity>
    And clicks on CREATE button
    And Enters Rate <rate>
    And clicks on CREATE button
    And clicks on Popup

    Examples: 
      | customer | customerreference | date       | transporter | bank  | loadingPort | destinationPort | insuranceType | searchproductgroup | searchproduct | invoicequantity | rate | remarks | p_f_Value | freightvalue | internal_remarks | external_remarks |
      | ENT      | asygasdgy         | 30/12/2023 | TO PAY      | ICICI | IRAQ        | NEPAL           | By Us         | Gen                | An            |              45 |  650 | sdasfas |       443 |          345 | axvfa            | automation       |

  @CreateSalesQuotationSaveAsDraft
  Scenario Outline: To SaveAsDraft The SaleQuotation
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    And Click on create Sales Quotation
    And Enters customer field <customer>
    And Enters CustomerReference field <customerreference>
    And Enters ValidDate <date>
    And Select Transporter <transporter>
    And Select Bank <bank>
    And Select LoadingPort <loadingPort>
    And Select DestinationPort <destinationPort>
    And Select InsuranceType <insuranceType>
    And Search for Productgroup <searchproductgroup>
    And Search for SearchProduct <searchproduct>
    And clicks on ADD
    And Enters InvoiceQuantity <invoicequantity>
    And Enters Rate <rate>
    And Enters Remarks <remarks>
    And Enters P_F_Value <p_f_Value>
    And Enters FreightValue <freightvalue>
    And Enters Internal_Remarks <internal_remarks>
    And Enters External_Remarks <external_remarks>
    And clicks on SAVEASDRAFT
    And clicks on Popup

    Examples: 
      | customer | customerreference | date       | transporter | bank  | loadingPort | destinationPort | insuranceType | searchproductgroup | searchproduct | invoicequantity | rate | remarks | p_f_Value | freightvalue | internal_remarks | external_remarks |
      | ENT      | asygasdgy         | 30/12/2023 | TO PAY      | ICICI | IRAQ        | NEPAL           | By Us         | Gen                | An            |              45 |  650 | sdasfas |       443 |          345 | axvfa            | automation       |

  @BMApprove
  Scenario Outline: To Approve Sales Quotation
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Click on Approve Button
    Then clicks on Popup
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order ApprovedStatus

    Examples: 
      | entrytype | salesquotationno |
      | auto      | SQ-1028          |

  @BMReject
  Scenario Outline: To Reject sales Quotation
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Click on Reject Button
    And Select the <resonforrejection> from the  Resonforrejection
    And Enter <rejectionremarks> in the Rejection remarks field
    Then Click on RejectPopUp
    Then clicks on Popup
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order RejectStatus

    Examples: 
      | entrytype | salesquotationno | resonforrejection    | rejectionremarks         |
      | auto    | SQ-1028          | Price increased high | Price has been increased |

  @BMForceClosed
  Scenario Outline: To ForceClosed sales Quotation
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Click on ForceClose Button
    Then Click on Yes PopUp
    Then Click on PopUp
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order ForceclosedStatus

    Examples: 
      | entrytype | salesquotationno |
      | auto      | SQ-1028          |

  @BMEnquiry
  Scenario Outline: To Enquiry sales Quotation
    Given BM logs in wth valid email 1004 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Enter <enquiryremark> in the Enquiry Remark field
    And Click on Enquiry Button
    Then clicks on Popup
    Then Click on Back Button
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order Enquiry Status

    Examples: 
      | entrytype | salesquotationno | enquiryremark     |
      | auto    | SQ-1028          | Need More Details |

  @TsmEnquiryReply
  Scenario Outline: Tsm Reply for Enquiry
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Enter <enquiryremark> in the Enquiry Reply field
    And Click on Reply
    Then clicks on Popup
    Then Click on Back Button
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order Enquiry Status

    Examples: 
      | entrytype | salesquotationno | enquiryremark              |
      | auto    | SQ-1028          | That is all details I have |

  @TsmForceClosed
  Scenario Outline: Tsm ForceClosed for Enquiry
    Given User logs in with valid email 1082 and password Che@1234
    When Click on Sales Quotation icon
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And Click on ForceClose Button
    Then Click on Yes PopUp
    Then clicks on Popup
    Then Search for SalesQuotation <entrytype> <salesquotationno>
    And user check for sales order ForceclosedStatus

    Examples: 
      | entrytype | salesquotationno |
      | auto      | SQ-1028          |
