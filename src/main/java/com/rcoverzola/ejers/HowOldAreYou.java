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
public class HowOldAreYou {
    private int OLD_AGE = 18;
    private int ZERO = 0;
    private int MAX_AGE = 150;
    private String[] MESSAGES = {"Cuantos años tienes?: ","Mayor","Menor", "Ingresar solo el numeros que correspondan a tu edad","No es un valor valido!!.","Error: MENSAJES no puede estar vacío", "Adios!!"};
    private Scanner scanner;
    private boolean EXIT = true;
      
    public HowOldAreYou() {
       this.scanner = new Scanner(System.in);
    }
    
    public int validateAge(int age) {
        if (age<=this.ZERO || age>= this.MAX_AGE) {
            System.out.println(this.MESSAGES[4]);
            this.EXIT = false;
            this.scanner.close();
             System.out.println(this.MESSAGES[6]);
        }
            return age;
        
    }
   
    
    private void isOld(int age){
        if(this.OLD_AGE <= age){
            System.out.println("Eres "+this.MESSAGES[1]+" de edad!");
        }else{
            System.out.println("Eres "+this.MESSAGES[2]+" de edad!");
        }
    }
    
    public void ask(){
        
        while (this.EXIT) {
        System.out.println(this.MESSAGES[3]);
        System.out.println(this.MESSAGES[0]);
        
        Integer age = validateAge(this.scanner.nextInt());
        
        if (this.EXIT){
            isOld(age);
        }
        }
        
    }
}
