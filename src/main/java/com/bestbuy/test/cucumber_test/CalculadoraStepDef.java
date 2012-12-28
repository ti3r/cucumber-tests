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

import com.bestbuy.test.cucumber_test.Calculadora.OPERACIONES;

import junit.framework.Assert;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Cuando;

/**
 * Step definitions for the Calculator
 * features
 * 
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 */
public class CalculadoraStepDef {

  Calculadora calc = new Calculadora();
  
  @Dado(value="^Ejecuto Limpiar la Calculadora$")
  public void I_reset_the_calculator() throws Throwable{
    calc.reset();
  }
  
  @Cuando(value="^escribo (\\d+) en la calculadora$")
  public void I_add_to_the_calculator(int number) throws Throwable{
    calc.escribirDigito(number);
  }
  
  @Cuando(value="^presiono la tecla (.?)$")
  public void I_press_key(String key) throws Throwable{
    if ("+".equalsIgnoreCase(key)){
      calc.setOperacion(OPERACIONES.SUMA);
    }else if ("-".equalsIgnoreCase(key)){
      calc.setOperacion(OPERACIONES.RESTA);
    }else if ("*".equalsIgnoreCase(key)){
      calc.setOperacion(OPERACIONES.MULTIPLICACION);
    }else if ("/".equalsIgnoreCase(key)){
      calc.setOperacion(OPERACIONES.DIVISION);
    } else if ("=".equalsIgnoreCase(key)){
      
      if (calc.getOperacion() != null){
        calc.ejecutarOperacion();
      }else{
        calc.setOperacion(OPERACIONES.IGUAL);
      }
      
    }
  }
  
  @Entonces(value="^El resultado sera (.*)$")
  public void result_should_be(double number) throws Throwable {
    Assert.assertEquals(number, calc.getTotal());
  }
  
}
