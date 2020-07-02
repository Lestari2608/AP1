/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

/**
 *
 * @author Mr. Acer
 */
public class bintang {
   
    public static void main(String[] args) {
        // 1. pola segitiga rata kiri 
        System.out.println("1. pola segitiga rata kiri");
        for (int a = 0; a < 5; a ++){
            for (int b = 0; b <= a; b++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        // 2. pola segitiga rata kiri terbalik
        System.out.println("2. pola segitiga rata kiri terbalik");
        for (int j = 0 ; j < 5 ; j++){
            for (int c = 5 ; c > j ; c--) {
                 System.out.print("*");
            }
            System.out.println("");
        }
        // 3. pola segitiga rata kanan 
        System.out.println("3. pola segitiga rata kanan ");
        for ( int f = 1 ; f <= 5 ; f++ ){
            for (int m = 5 ; m >= f ; m--){
                System.out.print(" ");   
            }
            for (int h = 1 ; h <= f ; h++ ){
             System.out.print("*");
        }
        System.out.println();
    }
         // 4. pola segitiga rata kanan terbalik
        System.out.println("4. pola segitiga rata kanan terbalik");
        for ( int p = 1 ; p <= 5 ; p++ ){
            for (int q = 1 ; q <= p ; q++){
                System.out.print(" ");   
            }
            for (int z = 5; z >= p ; z-- ){
             System.out.print("*");
        }
        System.out.println();
    } 
        // 5. pola segitiga sama kaki 
        System.out.println("5. pola segitiga sama kaki ");
        for (int k = 1; k <= 5 ; k++){
            for (int x = 5; x >= k ; x--){
                
                System.out.print(" ");
            }
            for (int d = 1 ; d <= k; d ++){
                System.out.print("*");
            }
            for (int s = 1; s <= k-1 ;s++ ){
                System.out.print("*");
            }
            System.out.println();
        }
         // 6. pola segitiga sama kaki terbalik
        System.out.println("6. pola segitiga sama kaki terbalik");
        for (int b = 1; b <= 5 ; b++){
            for (int t = 1; t <= b ;t++ ){
                System.out.print(" ");
            }
            for (int h = 5 ; h >= b; h --){
                System.out.print("*");
            }
            for (int g = 4; g >= b ; g--){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    }

