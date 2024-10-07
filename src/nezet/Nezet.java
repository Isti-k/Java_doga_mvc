/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;


public class Nezet {
    public static final Scanner sc = new Scanner(System.in);
    
    public String bekerNev(){
        System.out.println("Kérem adja meg a nevét!: ");
        String nev = sc.nextLine();
        return nev;
        
    }
    
    public int bekerKor(){
        System.out.println("Kérem adja meg a korát!: ");
        int kor = sc.nextInt();
        int szul_ido = kor;
        if(kor == szul_ido){
            kor++;
        }else{
            System.out.println("Nincs születésnapja!");
        }
        return kor;
        
    }
    
    public String bekerTanult(){
        System.out.println("Kérem adja meg a tanult nyelvet!: ");
        String tanult = sc.nextLine();
        return null;
        
    }
}
