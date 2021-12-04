# UT-IT Assignemnt

## GROUP 1:

1. Write a code and unit test cases following TDD to check if an email is valid or not. An email is valid if it has 4 parts in the order mentioned below. Only the rules mentioned below needs to be tested:
   * i. Recipient name -  alphanumeric characters (both lower and upper case)
   * ii. @ symbol
   * iii. Domain name – alphanumeric (both lower and upper case)
   * iv. Top-level domain - .com/.net/.org

2. Create an interface with the following methods and a class implementing these methods with unit test cases.
   * i. divide
   * ii. fibonacci

3. Write the unit and integration test cases after completing the implementation of the following classes. The framework has already been created and most of the implementation of methods already exists.

Add the following validation in respective classes.
* a) User Validation Class:
  * i. Checks if company exists in database
  * ii. Checks if email id is valid.
* b) Company Validation Class:
  * i. Company should not already exists in database
  * ii. Checks if email id is valid.
* c) Email Validation Class : Checks if email is valid.

Note:
* Create 2 modules - one module for 1st and 2nd question and another module for 3rd question.
* You have to create User related classes by yourself by taking reference from employee related classes.
* You have to create Unit and Integration test cases for User, Company and Email only. No need to write them for Employee.
* You have to create test cases for all the classes except the case classes in the model package.

