/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3.newpackage;

import java.util.Scanner;

/**
 *
 * @author Mr. Acer
 */
public class InputUser {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Inputkan Nilai Angka : ");
        int nilai = input.nextInt(); 
        System.out.println("Kamu Mendapat Nilai");
            
        
            if (nilai>=91) {
                System.out.println("A");
            }else if (nilai >=86 && nilai <=90) {
                System.out.println("A-");
            }else if (nilai >=81 && nilai<=86) {
                System.out.println("B+");
            }else if (nilai >=76 && nilai <=80) {
                System.out.println("B ");
            }else if (nilai >=71 && nilai <=75) {
                System.out.println("B-");
            }else if (nilai >=66 && nilai <=70) {
                System.out.println("C+");
            }else if (nilai >=61 && nilai <=65) {
                System.out.println("C");
            }else if (nilai >=56 && nilai <=60) {
                System.out.println("C-");
            }else if (nilai >=51 && nilai <=55) {
                System.out.println("D");
            }else if (nilai >=0 && nilai <=50) {
                System.out.println("E");
            }
                
            
                
            }
                
            }
    
