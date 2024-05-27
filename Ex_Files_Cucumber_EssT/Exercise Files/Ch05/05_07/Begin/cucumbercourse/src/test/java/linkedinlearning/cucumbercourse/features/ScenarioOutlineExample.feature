Feature: Final Bill Calculation

Scenario Outline: Customer Bill Amount Calculation
Given I have a Customer
And user enters intial bill amount as <BillAmount>
And Sales Tax Rate is <TaxRate> Percent
Then final bill amount calculated is <CalculatedBillAmount>
Examples:
