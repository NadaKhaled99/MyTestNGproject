/*
1) TestNG is a testing framework that is used to manage your tests(inspired from Junit and Nunit)
 --> not only for selenium--> it is for java
    (sign up, log in, search for an item, add it to cart and then checkout)
    those test cases should be run in this order

2) TestNG in selenium provides an option testng-failed.xml --> if you want to run only failed test cases
3) why TestNG>can make priorities that run first, parameterization and easier to use data, parallel in testing
4)<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Practice Suite">
  <test name="Test Basics 1">
      <parameter name="emailid" value="tester456@gmail.com"/>
      <parameter name="password" value="test@123"/>
      <classes>
      <class name="practiceTests.testParameters"/>
      </classes>
  </test> <!-- Test -->

  <test name="Test Basics 2">
      <parameter name="emailid" value="tester789@gmail.com"/>
    <classes>
       <class name="practiceTests.testOptional"/>
    </classes>

  </test> <!-- Test -->
</suite> <!-- Suite -->
5)TestNG. xml file is a configuration file that helps in organizing our tests.
It allows testers to create and handle multiple test classes,
define test suites and tests.
It makes a tester's job easier by controlling the execution of tests by putting all the test cases together
and run it under one XML file.
6)Priority is an attribute that tells TestNG which order the tests need to follow.
When we have multiple test cases and want to execute them in a particular order,
the TestNG priority attribute helps in executing the test cases in that order.
The test cases get executed in ascending order of the priority list.
7)Cyprus is a very modern way of writing text.
 */

