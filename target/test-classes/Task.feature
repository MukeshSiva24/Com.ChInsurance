Feature: ChInsurance

Background: Launch The Application
Given Launch The CHInsurance Application "https://www.chinsurance.cc/"

@Sanity
Scenario Outline: Give Review and View Company Location in Map
When User click the service Module
Then Validate dropdown data
When user Click The personal Insurance
Then Validate The Personal Insurance Page is Navigated
When user Click Policy Review
Then Validate Lets Talk Popup is Visible
And Validate The Address is Visible in popup
When User Click the Map and Satellite
And User Click Full Screen, Zoom in and Zoom Out in Map
And User Enter the Name, Email, Subject and Message "<Name>" "<EmailID>" "<Subject>" "<Message>"
And User Click The Submit
Then Validate The Message is Visible after Submit "<Submit Message>"

Examples:
|Name|EmailID				|Subject	|Message|Submit Message|
|Mani|ma3@gmail.com|Best Point|Good		|Thanks for submitting!|


@Sanity
Scenario Outline: Veriy The Post in Personal Insurance and give Comments
When Click HI-V Blog Module
And Click Personal Insurance
Then Validate Latest Post is Visible in Top
When Click The First Post in Top
Then Validate The Latest Post is Navigated
When Click Like button
Then Validate Number of Like is Visible
When Click The Comment and Enter the Comments "<Comment>"
And Click and Enter The Emoji and GIFI in Comment "<GIFI Search>"
And Click Size in GIFI and Adjust it Compact mode
And Click Aligment and Adjust it left
And Click The Cancel button in Comment
And Click the Discard button
Examples:
|Comment|GIFI Search|
|Hi			|Happy|


@Sanity
Scenario: Verify Office Location
When Click The Contact Moduke
Then Validate Dropdown Data in Contact Module
When Click CGinsurance Syracus,Ny
Then Validate Company Information Page is Navigated
When Click Map and Satellite
And Click Zoom in and Zoom Out
And Click Road View
And Click Full Screen Mode and Click Exit Full Screen


@Sanity
Scenario Outline: Login Functionality
When Click Client Access Module
And Click Csr24 Login Portal
Then Validate Login Page Navigate to new Tab
When Enter The UserName "<UserName>"
And Enter The Password "<Password>"
And Click The Login button
Then Validate Invalide Message is Visible after login
Examples:
|UserName	|Password				|
|Mukesh		|Mukeshsinsn@24|


@Sanity
Scenario Outline: Create New Account
When Click Client Access Module
And Click Csr24 Login Portal
Then Validate Login Page Navigate to new Tab
When Click Create New Account
And Enter The EmailID "<EmailID>"
And Enter The PhoneNo "<PhoneNo>"
And Enter The Policy Number "<PolicyNo>"
And Click Create Account
Then Validate Invalide Message is Visible after CreateAccount


Examples:
|EmailID							|PhoneNo		|PolicyNo|
|mukeshser24@gmail.com|8755848845|875222222222|
















