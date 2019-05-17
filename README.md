#  JSONplaceholder exercise

## Development Setup

**Required tools**

* JDK 8
* Git
* Maven 

**To run**

1. Clone : https://github.com/fuadexercise/apidemo.git
2. At the project root, run the following command:  **mvn clean test**

**Framework design**

* The Framework is developed in Java, REST Assured, Maven and TestNG.
* Maven is used to manage dependencies, run test commands in terminal and can be scaled to run on Jenkins for CI/CD
* The TestConfig class manages the Request Specifications. Currently its defaulting to the JSONPlaceholder request Specification but can also contain other API's
* The EndPoint interface stores all the EndPoints to be consumed by the tests. This avoids repetition
and code error if the end point names later change.

**Test Layer**
* The tests are written in BDD(Given, When, Then) to support visibility between different stakeholders
* Currently there are three end points being tested, namely: Albums, Comments and Posts
* TestNG is used to manage the tests that are being run and these instructions are defined in the testng.xml file

**Test Result**

* There are eight tests running in total with three of the tests failing
* The failed tests relate to the /Posts/ end point. 
* The failed tests relate to, user being unable to create post, unable to update existing post or being able to view deleted deals.

