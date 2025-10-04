Feature:Adding data in send quote
Scenario:verifying the data in send quote
Given User gives application URL 
Then the home page title should be displayed correctly
When user enters vehicle data
And clicks on next button to go to insurant data page
And user enters the insurant details
And clicks on next button to go to product data page
And user enters the product details
And clicks on next button to go to price option page
Then the price option page should display the available prices correctly
And clicks on the next button
Then users enter send quote details
And clicks on the send button