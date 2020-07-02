/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Mr. Acer
 */
public class looping1 {
    public static void main(String[] args) {
        int j = 0;
        int k = 100;
        
       // 1. menampilkan 0 hingga 100
        System.out.println("menampilkan 0 hingga 100 ");
        while (j<=100 ){
            System.out.println("j = " + j);
            j++;
    }
        //2. menampilkan 100 hingga 0
        System.out.println(" menampilkan 100 hingga 0");
        while (k>=0 ) {
            System.out.println("k = " + k);
            k--;
        }
            
         //3. menampilkan bilangan ganjil genap 
            //antara 0 hingga 100
        System.out.println("menampilkan bilangan ganjil");
        int b = 0;
        while (b >= 0 && b <= 100 ){
            if ( b % 2 == 1 ){
                System.out.println("b =" + b);   
            }
        b++;
        }
         System.out.println("menampilkan bilangan genap");
         int f = 0;
         while (f >= 0 && f<= 100){
             if (f % 2 == 0){
                 System.out.println("f = "+ f);
             }
        f++;
         }
         
         //4. tampilkan bilangan kelipatan 5
            //antara 0 hingga 100
         System.out.println("menampilkan bilangan kelipatan 5 antara 0 sampai 100");
         int d = 0;
         while (d >= 0 && d <= 100 ){
             System.out.println("d = " + d);
             d = d + 5;
         }
         //5. menampilkan bilangan kelipatan pangkat 2
            //antara 0 hingga 100
        System.out.println("menampilkan bilangan kelipatan pangkat 2 antara 0 sampai 100");
        int s = 0;
        while (s >= 0 && s<= 10) {
           int kpangkat2; 
           kpangkat2 = (int) Math.pow(s,2);
            System.out.println("kpangkat 2 = " + kpangkat2);
            s++;
           
        }
        }
    }

