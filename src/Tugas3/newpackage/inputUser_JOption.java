/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3.newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Mr. Acer
 */
public class inputUser_JOption {
    public static void main(String[] args) {
        
        //Input User JOption
        String nilai = JOptionPane.showInputDialog("Masukan Nilai Angka");
        //konversi String ke Integer
        int nilaiBaru = Integer.parseInt(nilai);
        
        //copy paste tugas 2 if else
        if (nilaiBaru>=86 && nilaiBaru <90) {
        JOptionPane.showMessageDialog(null, "nilai A-");
        }else if (nilaiBaru>=81 && nilaiBaru <85) {
        JOptionPane.showMessageDialog(null, "nilai B+");
        }else if (nilaiBaru>=76 && nilaiBaru <80) {
        JOptionPane.showMessageDialog(null, "nilai B");
        }else if (nilaiBaru>=71 && nilaiBaru <75) {
        JOptionPane.showMessageDialog(null, "nilai C+");
        }else if (nilaiBaru>=66 && nilaiBaru <70) {
        JOptionPane.showMessageDialog(null, "nilai C");
        }else if (nilaiBaru>=61 && nilaiBaru <65) {
        JOptionPane.showMessageDialog(null, "nilai C-");
        }else if (nilaiBaru>=56 && nilaiBaru <60) {
        JOptionPane.showMessageDialog(null, "nilai C");
        }else if (nilaiBaru>=51 && nilaiBaru <55) {
        JOptionPane.showMessageDialog(null, "nilai D");
        }else if (nilaiBaru>=0 && nilaiBaru <50) {
            JOptionPane.showMessageDialog(null, "nilai E");
                
                }
            
            //konversi nilaiBaru angka ke nilaiBaru huruf
            if (nilaiBaru>=91 && nilaiBaru <= 100) {
                System.out.println("Kamu Mendapatkan : A");
            }else if (nilaiBaru >=86 && nilaiBaru <=90) {
                System.out.println("Kamu Mendapatkan : A-");
            }else if (nilaiBaru >=81 && nilaiBaru<=86){
                System.out.println("Kamu Mendapatkan : B+");
            }else if (nilaiBaru >=76 && nilaiBaru <=80) {
                System.out.println("Kamu Mendapatkan : B ");
            }else if (nilaiBaru >=71 && nilaiBaru <=75) {
                System.out.println("Kamu Mendapatkan : B-");
            }else if (nilaiBaru >=66 && nilaiBaru <=70) {
                System.out.println("Kamu Mendapatkan : C+");
            }else if (nilaiBaru >=61 && nilaiBaru <=65) {
                System.out.println("Kamu Mendapatkan : C");
            }else if (nilaiBaru >=56 && nilaiBaru <=60) {
                System.out.println("Kamu Mendapatkan : c-");
            }else if (nilaiBaru >=51 && nilaiBaru <=55) {
                System.out.println("Kamu Mendapatkan : D");
            }else if (nilaiBaru >=0 && nilaiBaru <=50) {
               
            }
            
            
        }
    }


    

