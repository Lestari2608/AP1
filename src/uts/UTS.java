/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import javax.swing.JOptionPane;

/**
 *
 * @author Mr. Acer
 */
public class UTS {
    public static void main(String[] args) {
        try {
          //menampilkan menu pilihan presiden menggunakan joption pane 
        String Pilihanpresiden = JOptionPane.showInputDialog("Selamat Datang Di  pemilihan presiden \n 1.pak wiwi \n 2. pak wowo \n 3. golput \n 4. hasil \n \n \n \n responden ke =  \n pak wiwi = \n pak wowo = \n golput = ");
        
        int ppres = Integer.parseInt(Pilihanpresiden);
        
        int responden = 0; 
        while (responden >=0 && responden <= 4){
            System.out.println("responden " + responden );
            int pakwiwi = 0 ;
        while (pakwiwi >= 0 && pakwiwi <= 3){
            System.out.println("pak wiwi " + pakwiwi);
            int pakwowo = 0;
        while (pakwowo >=0 && pakwowo <= 3){
            System.out.println("pak wowo " + pakwowo);
            int golput = 0;
        while (golput >=0 && golput <= 3){
            System.out.println("golput " + golput);
        }
        }
        }   
        } 
        catch (Exception e) {
                JOptionPane.showMessageDialog(null, "KELIRU");
                }
        }
   
   
    }
}




        
    
    
    
    

        
   
