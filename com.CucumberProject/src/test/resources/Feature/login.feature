
Feature: facebook application checkup

#Background: user launch url
#@input1
Scenario: facebook application login with valid credential
#Given user needs to launch the url
And user enter the valid username and password
Then  user Click the submit button

#@input2
Scenario Outline: Login to the Facebook
#Given user needs to launch the url
And user enter the valid "<username>" and "<password>"
Then  user Click the submit button


Examples:

|username|password|
|anu123@gmail.com|rajan123@|
|abi234@gmail.com|abi231@|
   