/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import com.util.ProgramUtil;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class ColaImpresora extends ProgramUtil {

  private Queue<String> cola;

  public ColaImpresora() {
    String[] message = {"Ingrese el texto: ", "Texto a imprimir","Cola de imprecion", "Adios!!"};
    init(message);
    this.cola = new LinkedList<String>();
  }

  public void agregarTrabajo() {

    System.out.println(super.MESSAGES[0]);
    String text = super.scanner.next();
    this.cola.add(text);
    System.out.println( super.MESSAGES[2]+ this.cola);
    System.out.println(super.MESSAGES[3]);

  }

  public void procesarTrabajo() {
    System.out.println( super.MESSAGES[1]+ this.cola);
    this.cola.remove();
    System.out.println( super.MESSAGES[2]+ this.cola);
    System.out.println(super.MESSAGES[3]);
  }

}
