/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontroller;

import modell.Modell;
import nezet.Nezet;



public class Kontroller {
    private Modell modell;
    private Nezet nezet;
    
    public Kontroller(Modell modell, Nezet nezet){
        this.nezet=nezet;
        this.modell=modell;
        strart();
    }

    private void strart() {
        nezet.bekerKor();
        nezet.bekerNev();
        nezet.bekerTanult();
        
    }
    
}
