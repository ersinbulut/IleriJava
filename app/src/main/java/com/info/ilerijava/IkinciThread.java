package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class IkinciThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println("İkinci Thread : "+i);
        }
    }
}
