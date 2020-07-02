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
public class looping2 {
    public static void main(String[] args) {
        int k = 0 ;
        int j = 100 ;
        //1. menampilakan 0 hingga 100
        System.out.println("menampilkan angka 0 hingga 100");
          do{
            System.out.println("k = " + k);
            k++;
          } while ( k >= 0 && k <=100  );
          
        // 2. memanpilkan angka 100 hingga 0
          System.out.println("menampilkan angka 100 hingga 0");
          do{
            System.out.println("j = " + j);
            j--;
          }
          while (j >= 0 && j <= 100);
          
        // 3. menampilkan bilangan ganjil genap antara 0 hingga 100
          System.out.println("menampilkan bilangan ganjil");
        int y = 0;
          do{
            if (y % 2 == 1){
                System.out.println("y = "+ y);
            }
            y++;
            }
          while (y > 0 && y < 100);
          
          System.out.println("menampilkan bilangan genap ");
          int z = 0;
          do{
              if (z % 2 == 0){
                  System.out.println("z = " + z);
            }
            z++;
          }
          while (z > 0 && z < 100);
          
        // 4. menampilkan bilangan kelipatan 5 antara 0 hingga 100
          System.out.println("menampilkan bilangan kelipatan 5 antara 0 hingga 100");
          int q = 0;
          do{
              System.out.println("q = " + q);
           q = q + 5;
          }
          while (q >= 0 && q <= 100);
              
          // 5. menampilkan bilangan kelipatan pangkat 2 antara 0 hingga 100
          System.out.println(" menampilkan bilangan kelipatan pangkat 2 antara 0 hingga 100");
          int x = 0;
          do {
              int kpangkat2; 
           kpangkat2 = (int) Math.pow(x,2);
            System.out.println("kpangkat 2 = " + kpangkat2);
            x++;
          }
          while (x >= 0 && x<= 10);
          
          }
    }



    