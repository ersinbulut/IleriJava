package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class TryCatchMetodMain {

    public static void main(String args[]){



        Hesaplayici h = new Hesaplayici();

        try {
            h.bol(3,0);
        } catch (Exception e) {
            System.out.println("");
        }


    }
}
