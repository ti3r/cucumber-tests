/**
 * Copyright (c) 2012 Alexandro Blanco <ti3r.bubblenet@gmail.com>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.bestbuy.test.cucumber_test;

import junit.framework.Assert;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

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
