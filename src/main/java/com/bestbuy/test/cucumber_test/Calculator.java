package com.bestbuy.test.cucumber_test;

/**
 * Class to Manage add functions
 * of integer numbers
 * 
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Calculator {

  private int total = 0;
  
  public void add(int number){
    total += number;
  }
  
  public void reset(){
    total = 0;
  }
  
  public int getTotal(){
    return total;
  }
  
}
