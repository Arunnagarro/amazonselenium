Amazon Website Automation Suit Information:-
To run the Amazon Website Automation Suit from amazon selenium project folder
mvn clean test - pom.xml - it contains the testNG plugins and dependencies.

TestNG files description:-
testng.xml - define two classes

            LoginTest - define the tests related to LoginPage
            BaseTest - defines the test relate to navigate the webpage.
            CreateAccountTest - define the tests related to different pages across the site
Package description
com.amazonselenium.tests : Defining all the pages actions and respective object repository.

com.amazonselenium.Pages : Defining all the pages tests and assertions.

com.amazonselenium.utils : Defining all the utilities needed for the tests.

Tests.java files description
BaseTest: The main class which defines - @BeforeMethod -to open the browser and get the name of the test - @AfterMethod - to quit the browser - @AfterTest - to close the extent report.

LoginTest: Includes test - to verify login when blank email is entered - to verify login when blank email is entered . Includes test - to verify login when invalid password is entered - to verify login when invalid password is entered .

CreateAccountTest: Includes test - to verify register when invalid mobile number is entered - to verify register when invalid mobile number is entered.

Other files description
Screenshot.java : defines functions to take screenshots.

ExtentReport.html : defines function for extent reporting .

createAccountPage.java : defines functions for test register functionality

loginPage.java : defines functions for test login functionality.

BaseTest.java : to read the properties from config.properties.

Reports and Screenshots
Extent report gets generated after run under Reports\ExtentReport.html TestNG report as "emailable-report.html" gets generated under \test-output Screenshots gets placed under \FailedScreenshot folder with testname and test scenarios.



