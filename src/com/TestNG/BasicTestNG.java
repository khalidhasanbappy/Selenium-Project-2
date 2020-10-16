package com.TestNG;


import org.testng.annotations.Test;

public class BasicTestNG {
  @Test
  public void function1() {
	  
	  
	  System.out.println("TestNG 1");
  }
  
  @Test (enabled = false)
  public void function2() {
	 
	  
	  System.out.println("TestNG 2");
  }
}
