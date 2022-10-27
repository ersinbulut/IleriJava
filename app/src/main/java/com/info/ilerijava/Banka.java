package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Banka {
    private int bakiye;

    public Banka() {
    }

    public Banka(int bakiye) {
        this.bakiye = bakiye;
    }

    public synchronized void paraCek(String isim,int tutar){

        if(tutar > bakiye){
            System.out.println(isim + ": Hesapta para kalmadı");
        }else{
            bakiye = bakiye - tutar;
            System.out.println(isim + ": Hesapta kalan para "+bakiye);
        }


    }
}
