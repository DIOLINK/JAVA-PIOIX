/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import com.util.ProgramUtil;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class SumNumber extends ProgramUtil {

  private static int ZERO = 0;

  public SumNumber() {
    String[] message = {"Ingrese un numero entero positivo, cero para salir: ", "No es un valor valido", "El resultado de sumar 1 hasta ", " es: ", "Adios!!"};
    init(message);
  }

  private void onError() {
    System.out.println(super.MESSAGES[1]);
  }

  public void cal() {
    while (super.EXIT) {
      int aux = 0;
      System.out.println(super.MESSAGES[0]);
      Integer value = super.scanner.nextInt();
      if (value < this.ZERO) {
        onError();
      } else if (value == this.ZERO) {
        super.EXIT = false;
      } else {
        for (int i = 1; i <= value; i++) {
          aux += i;
        }
        System.out.println(super.MESSAGES[2] + value + super.MESSAGES[3] + aux);
      }
    }
    System.out.println(super.MESSAGES[4]);
  }
}
