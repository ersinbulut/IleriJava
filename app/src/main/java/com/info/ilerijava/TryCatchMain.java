package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class TryCatchMain {

    public static void main(String args[]){



        int x = 5;
        int y = 0;

        int [] dizi = new int [2];


        try{

            System.out.println("Sonuç : "+(x/y));
            System.out.println("İşlem tamam");
            dizi[1] = 8 ;


        } catch (ArithmeticException e){
            System.out.println("Sayılar sıfıra bölünmez");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizinin boyutunu aştınız");
        }





    }
}
