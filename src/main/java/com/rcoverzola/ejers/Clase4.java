/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcoverzola.ejers;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Roger Coverzola Bogado
 */
public class Clase4 {
  private LinkedList<String> list;
  private Stack<String> fifo;
  public Clase4(){
    this.list = new LinkedList<String>();
    this.fifo = new Stack<String>();
  }
  
 public void run1(){
   
   this.list.add("Emma");
   this.list.add("Richar");
   this.list.add("Juli");
   
   System.out.println(this.list);
 }
 public void run2(){
   
   this.fifo.push("Pedro");
   this.fifo.push("Marcelo");
   this.fifo.push("Augusto");
   
   System.out.println(this.fifo);
   System.out.println(this.fifo.peek());
   
 }
  
}
