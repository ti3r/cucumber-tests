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

public class Calculadora {

  private double total;
  private OPERACIONES operacion; 
  private double digitoActual;
  
  
  public void ejecutarOperacion(){
    if (operacion == null)
      throw new IllegalStateException("Ninguna operacion ha sido especificada");
    
    switch (operacion) {
      case SUMA:
          total += digitoActual;
        break;
      case RESTA:
          total -= digitoActual;
        break;
      case MULTIPLICACION:
          total *= digitoActual;
        break;
      case DIVISION:
          total /= digitoActual;
        break;
      case IGUAL:
          total = digitoActual;
    }
    operacion = null;
  }
  
  public void setOperacion(OPERACIONES op){
    this.operacion = op;
  }
  
  public void escribirDigito(double digito){
    this.digitoActual = digito;
    if (total <= 0)//Calculadora reseteada, guarda el total
      this.total = digito;
  }
  
  public double getTotal(){
    return total;
  }
  
  public void reset(){
    total = 0.0;
  }
  
  public OPERACIONES getOperacion() {
    return this.operacion;
  }
  
  /**
   * Enumeracion para especificar las operaciones 
   * disponibles en la calculadora
   * 
   * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
   */
  enum OPERACIONES{
    SUMA,
    RESTA,
    MULTIPLICACION,
    DIVISION,
    IGUAL
  }
  
}


