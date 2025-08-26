package com.util;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Coverzola Bogado
 */
public class ProgramUtil {
    public boolean EXIT = true;
    
    public Scanner scanner;

    public String[] MESSAGES;

    public void init(String... messajes) {
        this.scanner = new Scanner(System.in);
        this.MESSAGES = new String[messajes.length];
        System.arraycopy(messajes, 0, this.MESSAGES, 0, messajes.length);
    }
}

