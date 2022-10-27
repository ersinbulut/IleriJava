package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class ThreadNesneMain {

    public static void main(String args[]){

        Ogrenci o = new Ogrenci(23,"Kemal");

        BenimThread is1 = new BenimThread("ilk iş",o);

        is1.start();

        BenimThread is2 = new BenimThread("ikinci iş",o);

        is2.start();


    }


    static class BenimThread extends Thread{

        private String isinAdi;
        private Ogrenci o;

        public BenimThread(String isinAdi,Ogrenci o){
            this.isinAdi = isinAdi;
            this.o = o;
        }

        @Override
        public void run() {

            o.bilgiAl(isinAdi);

        }
    }



}
