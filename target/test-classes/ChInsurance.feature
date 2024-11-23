Feature: CHInsurance


Background: Launch Url 
Given Launch The Application "https://www.chinsurance.cc/"

Scenario Outline: Service Personl Insurace
When Validate Service with Mouse Over Action
And Validate Personal Insurance is Clickable
And Validate Review button is Clickable
Then Validate System Behaviour when Valid Mail id and Mandatory field "<Valid Name>" "<Valid Email>" "<Valid Subject>" "<Valid Message>"
Then Validate System Behaviour when Invalid Mail id and Mandatory field "<InValid Name>" "<InValid Email>" "<InValid Subject>" "<InValid Message>"
When Validate Satellite Map is Clickable
When Validate Full Screen is Clickable
When Validate Plus button is Clickable in Map

Examples:
|Valid Name	|Valid Email		|Valid Subject|Valid Message														|InValid Name	|InValid Email|InValid Subject|InValid Message|
|Raja				|raja@gmail.com	|Good 				|The Persona Insurance Policy is so useful|Raja					|raja					|Nill						|Nill  					|


Scenario: Service Commercial Insurance
When Validate Commercial Insurance is Clickable
And Validate Talk Business Insurance is Clickable

Scenario Outline: Service Liability Insurance
When Validate Liability Insurance is Clickable
And Validate System behaviour when Valid First Name,Last Name,Email,Phone and Message "<Valid First Name>" "<Valid Last Name>" "<Valid Email>" "<Valid Phone>" "<Valid Message>"
And Validate System Behaviour when Invalid First Name,Last Name,Email,Phone and Message "<InValid First Name>" "<InValid Last Name>" "<InValid Email>" "<InValid Phone>" "<InValid Message>"

Examples:
|Valid First Name	|Valid Last Name|Valid Email				|Valid Phone|Valid Message	|InValid First Name	|InValid Last Name|InValid Email|InValid Phone|InValid Message|
|Raja							|Rajan					|rajarajan@gmail.com|85456466		|Pass My Message|Raj								|Kumar						|rajkumar			|8754878			|Nill						|

Scenario: Service Data Breach
When Validate Data Breach is Clickable
And Validate Cyber Security is Clickable


Scenario: Service Workers Compensation
When Validate Workers Compensation is Clickable
And Validate Talk to Tony is Clickable


Scenario: Service Human Resources
When Validate Human Resources is Clickable
And Validate All Click Here is Clickable

Scenario: Service Errors and Omissions
When Validate Errors and Omissions is Clickable
And Validate Online Application is Clickable
And Validate Apply Now is Clickable
And Validate Full Application is Clickable
And Validate System Behaviour with Valid Mandatory fields
And Validate System Behaviour with Invalid Mandatory fields
And Validate Home is Clickable






Scenario Outline: Client Access
When Validate The 24/7 Client Access is Clickable
When Validate The Login Portal is Clickable
When Validate System Behaviour when Valid User Name and Password "<Valid User Name>" "<Valid Password>"
And Validate System Behaviour when Invalid User Name and Password "<InValid User Name>" "<InValid Password>"
And Validate System Behaviour when valid Email , Password and Policy Number "<Valid Email>" "<Valid Password>" "<Valid Policy Number>"
And Validate System Behaviour when Invalid Email, Password and Policy Number "<InValid Email>" "<InValid Password>" "InValid Policy Number>"
And Validate Back button is Clickable
And Validate The Trouble button is Clickable
And Validate System Behaviour when Valid Username and Password "<Valid User Name>" "<Valid Password>"
And Validate System Behaviour when Invalid Username and Password "<InValid User Name>" "<InValid Password>"
And Validate Forgot Username is Clickable
And Validate System Behaviour when Valid Email and Password "<Valid Email>" "<Valid Password>"
And Validate System Behaviour when Invalid Email and Password "<InValid Email>" "<InValid Password>"
And Validate Contact Support is Clickable
And Validate Ok button is Clickable
And Validate Return button is Clickable

Examples: 
|Valid User Name	|Valid Password	|Valid Email				|Valid Policy Number	|InValid User Name	|InValid Password	|InValid Email	|InValid Policy Number	|
|RamKumar					|85468952   		|ramkumar@gmail.com	|5555555							|Ram								|87540@dc					|ramkumar				|8555855								|


Scenario: About
When Validate About with Mouse Over Action
And Validate The CH Promise is Clickable
And Validate Meet Our Team is Clickable
And Validate In Your Corner is Clickable
And Validate Resume is Clickable
And Validate Share is Clickable
And Validate Community Corner is Clickable
And Validate Employment is Clickable
And Validate Pause is Clickable
And Validate Send Resume is Clickable


Scenario: HI -5 BLOG
When Validate HI -5 BLOG is Clickable
And Validate More is Located
And Vlidate Risk Management is Clickable
And Validate COVID -19 Post is Clickable

Scenario: Boost Image
When Validate Boost image is Clickable
And Validate Video Pause button is Clickable
And Validate Video Unmute button is Clickable
And Validate Video Subtitle button is Clickable
And Validate Full Screen is Clickable
And Validate Next button is Clickable


Scenario: More
When Validate More with Mouse Over Action
And Validate Locations is Clickable
And Validate Map is Visible
And Validate Satellite Map is Clickable
And Validate Map Full Screen is Clickable
And Validate Plus button is Clickable in Map



						
