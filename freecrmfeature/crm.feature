Feature: scenario outline

Scenario Outline:−Login functionality for testmeapp.

Given user navigates to testmeapp

When I enter Username as "<username1>" and Password as "<password1>"

Then login should be unsuccessful

Examples: −
| username1  | password1  | URL|
| lalitha | password1 | 
| admin | password45 |
|pradeep7725@gmail.com|Pradeep@123|



