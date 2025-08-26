/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import java.util.Scanner;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class Divide {

  private Scanner scanner;
  private boolean is_exit = true;
  private double ZERO = 0;
  private String[] MESSAJE = {"El resultado de la divicion entre ", "a: ", "b: ", " y ", " es: ", "Valor no valido!!", "Ingrese la un valor para ", "Intente nuevamente!!", "Desa continuar Si ~ No: ", "Adios!!"};
  private char VALUE_EXIT = 's';

  public Divide() {
    this.scanner = new Scanner(System.in);
  }

  private boolean isValidValue(double value) {
    if (value == this.ZERO || Double.isNaN(value)) {
      return false;
    }
    return true;
  }

  private void onExit() {
    System.out.println(this.MESSAJE[8]);
    String value = this.scanner.next();
    if (!value.equalsIgnoreCase(String.valueOf(VALUE_EXIT))) {
      System.out.println(this.MESSAJE[9]);
      this.is_exit = false;
    }
  }

  public void divideAtoB() {
    while (this.is_exit) {
      System.out.println(this.MESSAJE[6] + this.MESSAJE[1]);
      Double a = this.scanner.nextDouble();

      System.out.println(this.MESSAJE[6] + this.MESSAJE[2]);
      Double b = this.scanner.nextDouble();

      if (isValidValue(b)) {
        Double resul = a / b;
        System.out.println(this.MESSAJE[0] + this.MESSAJE[1] + a + this.MESSAJE[3] + this.MESSAJE[2] + b + this.MESSAJE[4] + resul);
        onExit();
      } else {
        System.out.println(this.MESSAJE[5]);
        System.out.println(this.MESSAJE[7]);
      }

    }

    this.scanner.close();
  }

}
