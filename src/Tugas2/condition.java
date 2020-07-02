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
public class condition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int nilai = 50;
        
        if (nilai<0 || nilai>100) {
            System.out.println("INPUT NILAI SALAH");
        }else{
            
            //konversi nilai angka ke nilai huruf
            if (nilai>=91 && nilai <= 100) {
                System.out.println("Nilainya adalah A");
            }else if (nilai >=86 && nilai <91) {
                System.out.println("Nilainya adalah A-");
            }else if (nilai >=81 && nilai<86){
                System.out.println("Nilainya adalah B+");
            }else if (nilai >=75 && nilai <81) {
                System.out.println("nilainya adalah B ");
            }else if (nilai >=71 && nilai <75) {
                System.out.println("nilainya adalah B-");
            }else if (nilai >=66 && nilai <71) {
                System.out.println("nilainya adalah C+");
            }else if (nilai >=61 && nilai <66) {
                System.out.println("nilainya adalah C");
            }else if (nilai >=56 && nilai <61) {
                System.out.println("nilainya adalah c-");
            }else if (nilai >=51 && nilai <56) {
                System.out.println("nilainya adalah D");
            }else if (nilai >=0 && nilai <51) {
                System.out.println("E");
            }
                
            
                
            }
                
            }
    }
    

