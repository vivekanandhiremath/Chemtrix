@ProspectEntry
Feature: To Test Prospect Entry

  Background: 
    Given User logs in wth valid email 1082 and password Che@1234

  @CreateProspect
  Scenario Outline: Creating Prospect Entry
    Then User Clicks on Prospect Entry Icon
    And User Clicks on Create Collection Entry button
    And User Enters company Name as <companyName>
    And User Enters contact person Name as <contactPersonName>
    And User Enters mobile number as <mobileNumber>
    And User Enters address1 as <address1>
    And User Enters address2 as <address2>
    And User Enters address3 as <address3>
    And User Enters city as <city>
    And User selects industry as <industry>
    And User enters email address as <emailAddress>
    And User enters remarks as <remarks>
    And User Uploads photo document as <photo>
    And User enters monthly potential quantity as <monthlyPotentialQuantity>
    And User enters overall potential quantity as <overallPotentialQuantity>
    And User selects uom as <uom>
    And User enters competitor name as <competitorname>
    And User enters gst number as <gstnumber>
    And User enters pan number as <pannumber>
    And User selects state as <state>
    Then User Clicks on Create Button
    And User Clicks on PopUp

    Examples: 
      | companyName | contactPersonName | mobileNumber | address1  | address2   | address3 | city      | industry | emailAddress     | remarks     | photo                                   | monthlyPotentialQuantity | overallPotentialQuantity | uom | competitorname | gstnumber | pannumber | country | state      |
      | automation | senthil           | 636244389477 | tamilnadu | coimbatore | tatbad   | coimbtore | Chemical | Ambani@gmail.com | someremarks | D:\Mylaptop\Asia Crystal\Mobile\ProspectEntry-Create 4.png |                      100 |                      100 | m³  | someCompetitor | 123eeer   | sad12323  | INDIA   | Tamil Nadu |

  @CreateProspectWithAllField
  Scenario Outline: Creating Prospect Entry With All Field
    Then User Clicks on Prospect Entry Icon
    And User Clicks on Create Collection Entry button
    And User Enters company Name as <companyName>
    And User Enters contact person Name as <contactPersonName>
    And User Enters mobile number as <mobileNumber>
    And User Enters address1 as <address1>
    And User Enters address2 as <address2>
    And User Enters address3 as <address3>
    And User Enters city as <city>
    And User selects industry as <industry>
    And User enters email address as <emailAddress>
    And User enters remarks as <remarks>
    And User Uploads photo document as <photo>
    And User enters monthly potential quantity as <monthlyPotentialQuantity>
    And User enters overall potential quantity as <overallPotentialQuantity>
    And User selects uom as <uom>
    And User enters competitor name as <competitorname>
    And User enters gst number as <gstnumber>
    And User enters pan number as <pannumber>
    And User selects state as <state>
    Then User Clicks on Create Button
    And User Clicks on PopUp

    Examples: 
      | companyName | contactPersonName | mobileNumber | address1  | address2   | address3 | city      | industry | emailAddress     | remarks     | photo                                   | monthlyPotentialQuantity | overallPotentialQuantity | uom | competitorname | gstnumber | pannumber | country | state      |
      | automation | senthil           | 636244389477 | tamilnadu | coimbatore | tatbad   | coimbtore | Chemical | Ambani@gmail.com | someremarks | D:\Mylaptop\Asia Crystal\Mobile\ProspectEntry-Create 4.png |                      100 |                      100 | m³  | someCompetitor | 123eeer   | sad12323  | INDIA   | Tamil Nadu |

  @CreateProspectWithMandatoryField
  Scenario Outline: Creating Prospect Entry With Mandatory Field
    Then User Clicks on Prospect Entry Icon
    And User Clicks on Create Collection Entry button
    And User Enters company Name as <companyName>
    And User Enters contact person Name as <contactPersonName>
    And User Enters address1 as <address1>
    And User Enters address2 as <address2>
    And User Enters address3 as <address3>
    And User Enters city as <city>
    And User selects industry as <industry>
    And User enters remarks as <remarks>
    And User Uploads photo document as <photo>
    And User enters gst number as <gstnumber>
    And User enters pan number as <pannumber>
    And User selects state as <state>
    Then User Clicks on Create Button
    And User Clicks on PopUp

    Examples: 
      | companyName | contactPersonName | mobileNumber | address1 | address2 | address3 | city | industry | emailAddress     | remarks     | photo                                   | monthlyPotentialQuantity | overallPotentialQuantity | uom | competitorname | gstnumber | pannumber | country | state      |
      | automation | Ambhani           | 636244389477 | Mumbai   | fa       | asd      | as   | Chemical | Ambani@gmail.com | someremarks | D:\Mylaptop\Asia Crystal\Mobile\ProspectEntry-Create 4.png |                      100 |                      100 | m³  | someCompetitor | 123eeer   | sad12323  | INDIA   | Tamil Nadu |

  @CreateProspectValidation
  Scenario Outline: To Check Prospect Entry Validation
    Then User Clicks on Prospect Entry Icon
    And User Clicks on Create Collection Entry button
    Then User Clicks on Create Button
    And User Enters company Name as <companyName>
    Then User Clicks on Create Button
    And User Enters contact person Name as <contactPersonName>
    Then User Clicks on Create Button
    And User Enters mobile number as <mobileNumber>
    Then User Clicks on Create Button
    And User Enters address1 as <address1>
    Then User Clicks on Create Button
    And User Enters address2 as <address2>
    Then User Clicks on Create Button
    And User Enters address3 as <address3>
    Then User Clicks on Create Button
    And User Enters city as <city>
    Then User Clicks on Create Button
    And User selects industry as <industry>
    Then User Clicks on Create Button
    And User enters email address as <emailAddress>
    Then User Clicks on Create Button
    And User enters remarks as <remarks>
    Then User Clicks on Create Button
    And User Uploads photo document as <photo>
    Then User Clicks on Create Button
    And User enters monthly potential quantity as <monthlyPotentialQuantity>
    Then User Clicks on Create Button
    And User enters overall potential quantity as <overallPotentialQuantity>
    Then User Clicks on Create Button
    And User selects uom as <uom>
    Then User Clicks on Create Button
    And User enters competitor name as <competitorname>
    Then User Clicks on Create Button
    And User enters gst number as <gstnumber>
    Then User Clicks on Create Button
    And User enters pan number as <pannumber>
    Then User Clicks on Create Button
    And User selects state as <state>
    Then User Clicks on Create Button
    And User Clicks on PopUp

    Examples: 
      | companyName | contactPersonName | mobileNumber | address1 | address2 | address3 | city | industry | emailAddress     | remarks     | photo                                   | monthlyPotentialQuantity | overallPotentialQuantity | uom | competitorname | gstnumber | pannumber | country | state      |
      | automation | Ambhani           | 636244389477 | Mumbai   | fa       | asd      | as   | Chemical | Ambani@gmail.com | someremarks |D:\Mylaptop\Asia Crystal\Mobile\ProspectEntry-Create 4.png |                      100 |                      100 | m³  | someCompetitor | 123eeer   | sad12323  | INDIA   | Tamil Nadu |

  @ProspectEdit
  Scenario Outline: To Update Prospect Entry
    Then User Clicks on Prospect Entry Icon
    And user click EditIcon
    And User Enters company Name as <companyName>
    And User Enters contact person Name as <contactPersonName>
    And User Enters mobile number as <mobileNumber>
    And User Enters address1 as <address1>
    And User Enters address2 as <address2>
    And User Enters address3 as <address3>
    And User Enters city as <city>
    And User selects industry as <industry>
    And User enters email address as <emailAddress>
    And User enters remarks as <remarks>
    And User Uploads photo document as <photo>
    And User enters monthly potential quantity as <monthlyPotentialQuantity>
    And User enters overall potential quantity as <overallPotentialQuantity>
    And User selects uom as <uom>
    And User enters competitor name as <competitorname>
    And User enters gst number as <gstnumber>
    And User enters pan number as <pannumber>
    And User selects state as <state>
    Then user click Update
    And User Clicks on PopUp

    Examples: 
      | companyName | contactPersonName | mobileNumber | address1 | address2 | address3 | city | industry | emailAddress     | remarks     | photo                                   | monthlyPotentialQuantity | overallPotentialQuantity | uom | competitorname | gstnumber | pannumber | country | state      |
      | automation | Ambhani           | 636244389477 | Mumbai   | fa       | asd      | as   | Chemical | Ambani@gmail.com | someremarks | D:\Mylaptop\Asia Crystal\Mobile\ProspectEntry-Create 4.png |                      100 |                      100 | m³  | someCompetitor | 123eeer   | sad12323  | INDIA   | Tamil Nadu |
