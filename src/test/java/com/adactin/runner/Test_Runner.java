package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Ada_Proj.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


    
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature", glue = "com.adactin.stepdefinition")
    
	public class Test_Runner {

    	public static WebDriver test;
    	@BeforeClass
    	public void set_up() {
    		
    		test = Baseclass.launchbrower("chrome");

		}
    	
    	@AfterClass
    	public void tearDown() {
    		test.close();
    		
    	}

}
