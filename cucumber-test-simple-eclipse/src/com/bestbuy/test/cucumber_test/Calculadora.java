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


