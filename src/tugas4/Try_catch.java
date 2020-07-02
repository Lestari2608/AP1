/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import javax.swing.JOptionPane;

/**
 *
 * @author Mr. Acer
 */
public class Try_catch {
     public static void main(String[] args) {
  try{
     // Menampilkan Menu Pilihan Bangun Datar
     String PilihanBangunDatar = JOptionPane.showInputDialog("Selamat Datang Di Program Menghitung Luas Bangun Datar yang Akan Dihitung Luasnya  : \n 1. Luas Persegi Panjang \n 2.Luas Trapesium \n 3. Luas Lingkaran");
     int PBangunDatar = Integer.parseInt(PilihanBangunDatar);
    
         if(PBangunDatar == 1){
         // Menghitung Luas Persegi Panjang
         // mengambil input dari user
         String PanjangPersegi = JOptionPane.showInputDialog("Masukan Panjang Persegi : ");
         double PPersegi = Double.valueOf(PanjangPersegi);
         
         String LebarPersegi = JOptionPane.showInputDialog("Masukan Lebar Persegi : ");
         double LPersegi = Double.valueOf(LebarPersegi);
         
         // proses menghitung luas 
         double Luas = PPersegi * LPersegi ;
         
         JOptionPane.showMessageDialog(null, "Jadi Luas Persegi Panjang Adalah : " + Luas );
     }else if(PBangunDatar == 2){
         //Menghitung Luas Trapesium
         //mengambil input dari user
         String PanjangRusukSatu = JOptionPane.showInputDialog("Masukan Panjang Rusuk Satu : ");
         double PRusukSatu = Double.valueOf(PanjangRusukSatu);
         
         String PanjangRusukDua = JOptionPane.showInputDialog("Masukan Panjang Rusuk Dua : ");
         double PRusukDua = Double.valueOf(PanjangRusukDua);
         
         String TingiTrapesium = JOptionPane.showInputDialog("Masukan Tinggi Trapesium : ");
         double TTrapesium = Double.valueOf(TingiTrapesium);
         
         //proses menghitung luas 
         double Luas = (PRusukSatu+PRusukDua)*TTrapesium/2 ;
         
         JOptionPane.showMessageDialog(null, "Jadi Luas Trapesium Adalah : " + Luas );
     }else if (PBangunDatar == 3) {
         //Menghitung Luas Lingkaran 
         //mengambil input dari user
         String JariJariLingkaran = JOptionPane.showInputDialog("Masukan Jari Jari Lingkaran : ");
         Double r = Double.valueOf(JariJariLingkaran);
         Double Phi = 3.14 ;
         
         //proses menghitung luas 
         double Luas = (Phi * Math.pow(r, 2)) ;
         
         
         JOptionPane.showMessageDialog(null, "Jadi Luas Lingkaran Adalah : " + Luas );
     }else 
         JOptionPane.showMessageDialog(null, "Menu pilihan yang anda pilih tidak ada");
        }
     catch (Exception e) {
         JOptionPane.showMessageDialog(null, "KELIRU");
        }
         
          
         
     }
    }
    


    
