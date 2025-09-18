/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import com.util.ProgramUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class ArraySort extends ProgramUtil {

  private static int ZERO = 0;

  private ArrayList<Integer> arrInt;
  private ArrayList<String> shoppingList;
  private ArrayList<String> MenuList;
  private List<Object> arrResp;
  private String menuOption;

  private record DataPoint(String name, int value) {

    @Override
    public String toString() {
      return "[\"" + name + "\"," + value + "]";
    }
  }

  ;


  public ArraySort() {
    String[] message = {"Ingrese un numero entero, o el cero para salir: ", "La lista ordenada es: ", "Adios!!", "La aparicion de los numeros son: ", "Que quieres comprar: ", "Cual quieres Eliminar: ", "Lista de compras limpia.", "Lista compras: ", "Seleccione un valor del siguiente menu: "};
    init(message);
    this.arrInt = new ArrayList<>();
    this.shoppingList = new ArrayList<>();
    this.MenuList = new ArrayList<>();
    this.arrResp = new ArrayList<>();
    this.MenuList.add("Finalizar / Salir");
    this.MenuList.add("Agregar Compra");
    this.MenuList.add("Eliminar Compra");
    this.MenuList.add("Limpiar Compras");
  }

  public void run() {
    if (!this.arrInt.isEmpty()) {
      this.arrInt.clear();
    }
    while (super.EXIT) {
      System.out.println(super.MESSAGES[0]);
      Integer value = super.scanner.nextInt();

      if (value == this.ZERO) {
        super.EXIT = false;
      } else {
        this.arrInt.add(value);
      }
    }
    if (!this.arrInt.isEmpty()) {
      Collections.sort(this.arrInt);
      System.out.println(super.MESSAGES[1] + this.arrInt.toString());
      this.countNumbers();
    } else {
      super.scanner.close();
      System.out.println(super.MESSAGES[2]);
    }
  }

  public void countNumbers() {
    if (this.arrInt.isEmpty()) {
      super.EXIT = false;
      super.scanner.close();
      System.out.println(super.MESSAGES[2]);
    } else {
      System.out.println(this.arrInt.toString());
      if (!this.arrResp.isEmpty()) {
        this.arrResp.clear();
      }
      for (Integer num : this.arrInt) {
        String nameToFind = num.toString();
        boolean found = false;

        for (int i = 0; i < this.arrResp.size(); i++) {
          Object obj = this.arrResp.get(i);

          if (obj instanceof DataPoint) {
            DataPoint dataPoint = (DataPoint) obj;
            if (dataPoint.name().equals(nameToFind)) {
              DataPoint updatedDataPoint = new DataPoint(dataPoint.name(), dataPoint.value() + 1);
              this.arrResp.set(i, updatedDataPoint);
              found = true;
              break;
            }
          }
        }

        if (!found) {
          this.arrResp.add(new DataPoint(nameToFind, 1));
        }
      }
      System.out.println(super.MESSAGES[3] + this.arrResp.toString());
      super.EXIT = true;
      this.run();
    }
  }

  private void addItem() {
    System.out.println(super.MESSAGES[4]);
    String text = super.scanner.nextLine();
    this.shoppingList.add(text);
    return;
  }

  private void removeItem() {
    if (this.shoppingList.isEmpty()) {
      System.out.println(super.MESSAGES[6] + this.shoppingList.toString());
      return;
    } else {
      System.out.println(super.MESSAGES[5] + this.shoppingList.toString());
      String text = super.scanner.nextLine();
      if (this.shoppingList.contains(text)) {
        this.shoppingList.remove(this.shoppingList.indexOf(text));
      }
      return;
    }
  }

  private void clearItems() {
    this.shoppingList.clear();
    System.out.println(super.MESSAGES[6] + this.shoppingList.toString());
    return;

  }

  public void menuList() {
    System.out.println(super.MESSAGES[8]);
    for (String menuItem : this.MenuList) {
      System.out.println(this.MenuList.indexOf(menuItem) + "). " + menuItem);
    }
    this.menuOption = super.scanner.nextLine();
    switch (this.menuOption) {
      case "0":
        super.EXIT = false;
        super.scanner.close();
        System.out.println(super.MESSAGES[2]);
        return;
      case "1":
        this.addItem();
        return;
      case "2":
        this.removeItem();
        return;
      case "3":
        this.clearItems();
        return;
      default:
        return;
    }
  }

  public void shopping() {
    while (super.EXIT) {
      this.menuList();
      if (!this.shoppingList.isEmpty()) {
        System.out.println(super.MESSAGES[7] + this.shoppingList.toString());
      }
    }
  }
}
