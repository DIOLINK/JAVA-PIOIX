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
public class Matriz extends ProgramUtil {
  private int[][] m;
  
  public Matriz(int x,int y){
    String[] message = {"Ingrese un numero: ", "No es un valor valido", "El resultado de sumar 1 hasta ", " es: ", "Adios!!"};
    init(message);
    this.m = new int[x][y];
  }
  
  public void file(){}
  
}
