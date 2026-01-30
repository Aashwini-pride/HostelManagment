Feature: Hostel Form Registration 

As a student 
I want to fill the hostel form
so that I can request accomodation on hostel


Background:
Given the user is logged in


@reg
  Scenario: Successfuly fill and submit the hostel form
  
  Given User is on Hostel form page
  When  User Enter LocalGuardianName "Rajesh"
  And   User Enter the GaurdianContactNo "7689098767"
  And   User Enter the LocalGuardianAlternateNo "3456789876"
  And   User able to click on check box of decleration
  And   User able to click on check box of undertaking
 
  
 
  
  
  