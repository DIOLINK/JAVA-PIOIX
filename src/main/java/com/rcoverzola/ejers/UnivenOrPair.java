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
public class UnivenOrPair {

  private String[] MESSAJE = {"Es ", "Par!!", "Inpar!!", "Ingrese un nuemero entero: ", "Intente nuevamente", "Desa continuar Si ~ No: ", "Adios!!"};
  private Scanner scanner;
  private int ZERO = 0;
  private boolean is_exit = true;
  private char VALUE_EXIT = 's';
  private static int CRITERION = 2;

  public UnivenOrPair() {
    this.scanner = new Scanner(System.in);
    
  }

  private void onExit() {
    System.out.println(this.MESSAJE[5]);
    String value = this.scanner.next();
    if (!value.equalsIgnoreCase(String.valueOf(VALUE_EXIT))) {
      System.out.println(this.MESSAJE[6]);
      this.is_exit = false;
    }
  }

  public void isPair() {
    while (this.is_exit) {
      System.out.println(this.MESSAJE[3]);
      Integer value = this.scanner.nextInt();
      String res = this.MESSAJE[2];
      if (value % this.CRITERION == this.ZERO) {
        res = this.MESSAJE[1];
      }
      System.out.println(this.MESSAJE[0]+res);
      onExit();
    }

  }

}
