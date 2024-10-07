/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.Modell;
import nezet.Nezet;
import kontroller.Kontroller;

public class Doga_mvc {

    
    public static void main(String[] args) {
        Modell modell= new Modell();
        Nezet nezet = new Nezet();
        new Kontroller(modell, nezet);
    }
    
}
