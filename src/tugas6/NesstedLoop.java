/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mr. Acer
 */
public class NesstedLoop {
    public static void main(String[] args) {
        
        
        for (int a = 0; a <= 5 ;a++){
            System.out.println("looping a ke : " + a);
        
            
            for (int b = 0 ; b <= 5 ; b++ ){
                System.out.println("looping b ke : " + b);
            }
        }
    }
}
