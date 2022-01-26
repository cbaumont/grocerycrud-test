# grocerycrud-test

This is a sample project which uses Selenium WebDriver, WebDriverManager and others, with some good development practices, in order to help you create your automated E2E front-end tests.

The web application under test can be found at https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v5

1. [Test creation](#Test_creation)
    1. [Example](#Example)
2. [Local execution](#Local_execution)
3. [Properties file](#Properties_file)
3. [Logs and test reports](#Logs_and_test_reports)

## Test creation

The test creation is simple and fast, and should follow the patterns below:
 * Test class must be on the path `/src/test/java`
 * Test class must inherit from `BaseTest`
 
### Example

```java
public class MyTest extends BaseTest {

    @Test
    public void shouldLoadSamplePage() {
        
        /*
         * Test code:
         *  - using the Page Objects
         *  - assertions to verify the results
         */
    }
}
```  

## Local execution

This project uses the WebDriverManager library to automatically download the browser's driver during execution.
More info at https://github.com/bonigarcia/webdrivermanager

```xml
 <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>${bonigarcia.version}</version>
 </dependency>
```

You can run your tests through your IDE or running the command  `mvn test` via command line.

## Properties File

This project uses **config.properties**  file to define the base URL of the application under test.

`````properties
# Base URL
url.base = https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v5
`````

[Properties model](src/main/resources/config.properties)

## Logs and test reports

This project uses Log4J 2 for console logging during the test execution, and Extent Reports to automatically generate a test report after the execution.
