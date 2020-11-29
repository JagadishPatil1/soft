package com.mavendemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	@org.testng.annotations.Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
		System.out.println("Test passed");
		System.out.println("New change made");
		System.out.println("*******************************pulllllllll*****88****");
		System.out.println("Helo im newluy added ");
	}
}


//Apache Maven Compiler Plugin
//The Compiler Plugin is used to compile the sources of your project.

//Maven Surefire Plugin
//Maven Surefire MOJO in maven-surefire-plugin.   for reports 


//WebDriverManager » 4.2.2
//Automatic Selenium WebDriver binaries management in runtime for Java

//Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

//7104   // 0624 inprogress