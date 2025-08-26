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
public class ValidateStorePass {
    private String[] store_pass;
    private Scanner scanner;
    private boolean is_exit = true;
    private String[] MESSAJE = {"Correcta!!", "Incorrecta!!", "Ingrese la clave: ", "Intente nuevamente"};
       
    public ValidateStorePass(String... arr_pass){
        this.scanner = new Scanner(System.in);
        this.store_pass = new String[arr_pass.length];
        System.arraycopy(arr_pass, 0, this.store_pass, 0, arr_pass.length);
    }
    
    private boolean validatePass(String pass){
        for(String value_pass: this.store_pass){
            if (value_pass.equalsIgnoreCase(pass)) {
                   return value_pass.equalsIgnoreCase(pass);
            }
        }
        return false;
    }
    
    public void isValidate(){
        
        while(this.is_exit){
                System.out.println(this.MESSAJE[2]);
            String pass = this.scanner.next();
            if (validatePass(pass)){
                System.out.println(this.MESSAJE[0]);
                this.is_exit=false;
            }else{
                System.out.println(this.MESSAJE[1]);
                System.out.println(this.MESSAJE[3]);
            }
        }       
        this.scanner.close();
    }
    
    
}
