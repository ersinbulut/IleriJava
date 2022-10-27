package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Hesaplayici {


    public int bol(int sayi1,int sayi2) throws Exception{

        if(sayi2 == 0) throw new Exception("Sıfıra bölünemez");

        return sayi1 / sayi2;
    }
}
