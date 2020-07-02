/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import com.sun.corba.se.impl.io.ValueHandlerImpl;

/**
 *
 * @author Mr. Acer
 */
public class looping3 {

    public static void main(String[] args) {

        
        //4. tampilkan bilangan kelipatan 5
        //antara 0 hingga 100
        //5. tampilkan bilangan kelipatan pangkat 2
        //antara 0 hingga 100
        //1. tampilkan bilangan 0 hingga 100
        System.out.println("menampilkan bilangan 0 hingga 100");
        for (int k = 0; k <= 100; k++){
            System.out.println("k = " + k);
        }
        //2. menampilkan bilangan 100 hingga 0
        System.out.println("menampilkan bilangan 100 hingga 0");
        for (int j = 100 ; j >= 0 ; j--){
            System.out.println( "j = " + j);
        }
        //3. menampilkan angka ganjil genap antara 0 hingga 100
        System.out.println("menampilkan bilanga genap");
        for (int m=0; m <= 100 ;m += 2 ){
            System.out.println(m  +" " );
        }
        System.out.println("menampilkan bilangan ganjil");
        for (int n = 1;n <= 100;n +=2 ){
            System.out.println(n +"");
        }
        //4. menampilkan bilangan kelipatan 5 antara o hingga 100
        System.out.println("menampilkan bilangan kelipatan 5 antara 0 hingga 100");
        for (int g = 0; g <= 100; g = g + 5 ){
            System.out.println("g = " + g);
        }
        //5. menampilkan bilangan kelipatan pangkat 2 antara 0 hingga 100
        System.out.println("menampilkan bilangan kelipan pangkat 2 antara 0 hingga 100");
        for (int w = 0; w <= 10; w = w + 2 ){
        int kpangkat2;
        kpangkat2 = (int) Math.pow(w, 2);
            System.out.println("kpangkat2 = "+ kpangkat2);
    }
}
}

