/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import com.util.ProgramUtil;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class AgeTaxAction extends ProgramUtil {

  private LocalDate dateCurrent;
  private HashMap<String, String> objects;
  private static int OLD_AGE = 18;
  private static int MAX_AGE = 150;
  private int CONT = 1;
  private static int LIMIT_TRX = 1000000;
  private int monthCurrent;

  public AgeTaxAction() {
    String[] message = {"Ingrese su fecha de nacimiento (dd/mm/yyyy): ", "Igrese el ingreso para el mes ", "Fecha de naciomiento no valida", "Si, ", "No, ", "debe tributar","Adios!!"};
    init(message);
    this.objects = new HashMap<String, String>();
    this.dateCurrent = LocalDate.now();
    this.monthCurrent = dateCurrent.getMonthValue();
  }

  private void onErrorDate() {
    System.out.println(super.MESSAGES[2]);
    super.EXIT = false;
  }

  private String getNameMoths(int numMohth) {
    switch (numMohth) {
      case 1:
        return "Enero";
      case 2:
        return "Febrero";
      case 3:
        return "Marzo";
      case 4:
        return "Abril";
      case 5:
        return "Mayo";
      case 6:
        return "Junio";
      case 7:
        return "Julio";
      case 8:
        return "Agosto";
      case 9:
        return "Septiembre";
      case 10:
        return "Octubre";
      case 11:
        return "Noviembre";
      case 12:
        return "Diciembre";
      default:
        super.EXIT = false;
        return null;
    }
  }

  private void cal() {
    Double aux = 0.0;
    String res = super.MESSAGES[4];
    for (String value : this.objects.values()) {
      aux += Double.valueOf(value);
    }
    if (aux >= this.LIMIT_TRX) {
      res=super.MESSAGES[3];
    } 
      System.out.println(res+super.MESSAGES[5]);
  }

  public void calTaxAction() {
    System.out.println(super.MESSAGES[0]);
    String birthDateStr = super.scanner.nextLine();

    LocalDate birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    Period dif = Period.between(birthDate, this.dateCurrent);
    if (dif.getYears() < this.OLD_AGE || dif.getYears() >= this.MAX_AGE) {
      onErrorDate();
    }
    while (this.EXIT) {
      System.out.println(super.MESSAGES[1] + getNameMoths(this.CONT) + ":");
      Double value = super.scanner.nextDouble();
      this.objects.put(getNameMoths(this.CONT), String.valueOf(value));
      if (this.CONT == this.monthCurrent) {
        cal();
        super.scanner.close();
        System.out.println(this.objects.toString());
        System.out.println(this.MESSAGES[6]);
        this.EXIT = false;
      } else {
        this.CONT += 1;
      }
    }

  }

}
