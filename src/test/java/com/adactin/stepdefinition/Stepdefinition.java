package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Ada_Proj.Baseclass;
import com.Ada_Proj.Loginpagerepo;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	
	public static WebDriver test = Test_Runner.test;
	
	public static Loginpagerepo login = new Loginpagerepo(test);
	
	
	
	



}
