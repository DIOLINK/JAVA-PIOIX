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
public class SumAllNum extends ProgramUtil {

  private static int ZERO = 0;

  public SumAllNum() {
    String[] message = {"Ingrese numeros enteros positivo, ó ingesar un numero negativo para salir: ", "El resultado de la suma es: ", "Adios!!"};
    init(message);
  }

  public void cal() {
    int aux = 0;
    while (super.EXIT) {
      System.out.println(super.MESSAGES[0]);
      Integer value = super.scanner.nextInt();
      if (value < this.ZERO) {
        super.EXIT = false;
      } else {
        aux += value;
      }
    }
    System.out.println(super.MESSAGES[1] + aux);
    System.out.println(super.MESSAGES[2]);
  }

}
