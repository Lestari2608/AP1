/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Mr. Acer
 */
public class condition_swich {
        public static void main(String[] args) {
        
    String nilai = "E" ;
        
  
        
        // konversi nilai huruf ke nilai angka
    switch (nilai)  {
        case "A":
            System.out.println("nilai >= 91");
            break;
        case "A-" :
            System.out.println("nilai >= 86");
            break;
        case "B+":
            System.out.println("nilai >= 81");
            break;
        case "B":
            System.out.println("nilai >= 75");
            break;
        case "B-":
            System.out.println("nilai >= 71");
            break;
        case "C+":
            System.out.println("nilai >= 66");
            break;
        case "C" :
            System.out.println("nilai >= 61");
            break;
        case "C-" :
            System.out.println("nilai >= 56");
            break;
        case "D" :
            System.out.println("nilai >= 51");
            break;
        case "E":
            System.out.println("nilai >= 0");
        
                     
}
    }
}