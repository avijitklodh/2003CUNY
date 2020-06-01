Feature: Wikipedia Search

	Scenario Outline: Search
		Given The user is on the Wikipedia homepage
		When The user types "<query>" into search bar
		When The user clicks on search button
		Then The title should be "<title>"
		
		Examples:
		|query|title|
		|emu war |Emu War - Wikipedia|
		|football |Football - Wikipedia|
		|guitar |Guitar - Wikipedia|
		
		
