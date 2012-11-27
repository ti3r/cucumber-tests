package com.bestbuy.test.cucumber_test;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Step definitions for the Calculator
 * features
 * 
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 */
public class CalculatorStepDef {

  Calculator calc = new Calculator();
  
  @Given(value="^I reset the calculator$")
  public void I_reset_the_calculator() throws Throwable{
    calc.reset();
  }
  
  @When(value="^I add (\\d+) to the calculator$")
  public void I_add_to_the_calculator(int number) throws Throwable{
    calc.add(number);
  }
  
  @Then(value="^result should be (\\d+)$")
  public void result_should_be(int number) throws Throwable {
    Assert.assertEquals(number, calc.getTotal());
  }
  
}
