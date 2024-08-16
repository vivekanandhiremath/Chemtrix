Feature: To Test Masters

  Background: 
    Given User logs in wth valid email 1024 and password Che@1234

  @MastersEdit
  Scenario Outline: To Edit Customer
    When user Click Master Icon
    Then Clicks on Edit Icon
    And Edit Customer Grading <customergrading>
    And Edit Remarks <remarks>
    And Edit Payment <payment>
    And Edit Volume <volume>
    And Edit Collection <collection>
    And Edit Profitability <profitability>
    And Edit Sales <sales>
    Then Clicks on update button
    And Click on popup

    Examples: 
      | customergrading   | remarks            | payment | volume | collection | profitability | sales |
      | A - Key Customers | no remarks for now |       3 |      2 |          3 |             2 |     3 |
