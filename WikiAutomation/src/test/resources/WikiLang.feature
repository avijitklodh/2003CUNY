Feature: Wikipedia Languages

	Background: On Home Page
		Given The user is on the Wikipedia homepage

	Scenario: English Wikipedia		
		When The user clicks on English
		Then The user should be on the Enlish home page
		
	Scenario: Spanish Wikipedia
		When The user clicks on Spanish
		Then The user should be on the Spanish homepage