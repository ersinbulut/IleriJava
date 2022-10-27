package com.info.ilerijava;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Ogrenci {
    private int no;
    private String ad;

    public Ogrenci() {
    }

    public Ogrenci(int no, String ad) {
        this.no = no;
        this.ad = ad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void bilgiAl(String isinAdi){
        for(int i = 0;i<100;i++){
            System.out.println(isinAdi + " : "+ i);
        }
    }
}
