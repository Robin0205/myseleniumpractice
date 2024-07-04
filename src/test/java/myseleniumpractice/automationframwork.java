package myseleniumpractice;
/*
 * 
 * framework---------Data drive framework,Keyboard driven by using page object model
 *  
 * 
 * packages---- we have to separate the packages for both tests and pages .All the web page releated classes comes under pages packages
 * and all the test related classes that comes under tets package.
 * For example,payment page and login page have separate classes to store element locators.
 * 
 * 
 * properties files---This files (config.properties) stores the information that remains static through the framework  such as browser
 * specific info,application URL,development,tetsing URL ,screenshots path,security questions and answers,username,password,tetsing url et
 *  
 * 
 *  Maven----maven is a  open source build autoamtion tool developed by Apache group of software.
 *  used primarly for java projects.it can be also used to build and manage ,deploy ,pulblish  several  projects at once for better project 
 *  managment 
 *  it also supports to wtite different programming languagesjava ,c++,Ruby,Scala.
 *  in maven software project is developed using its POM wich includes the information about project and cofiguration such as directory,
 *  source directory,test source directory,dependency,plugins.etc
 *  
 *  
 * Jenkins----maven is buildin tool  for developing and writing the code 
 * whereas jenkins is open source automation tool created with java it extensively used as a CI and CD tool
 * it work with multiple programming languages and can run on multiple platforms(windows,linux,macos)
 * whenever an error appears during the test,developers receive immediate feedback and can fix issues in the code at the moment.
 * By using jenkins tool,we execute test cases on a daily bases and also for nightly basis based on the schedule.
 * test results will be sent to peers using jenkins.
 * 
 * 
 * 
 * Verison control tool-- we use git as a repository to store our test scripts.
 * 
 * 
 * 
 * Test base class--- test base class deals with all the common functions used by all the pages.This class is responsible
 * for loading the configuration from properties files,initializing the webdriver,implicty wait,explicity wait etc.
 */

public class automationframwork {

}
