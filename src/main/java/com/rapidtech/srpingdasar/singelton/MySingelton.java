package com.rapidtech.srpingdasar.singelton;

public class MySingelton {
    private static MySingelton singelton = new MySingelton();

    private MySingelton(){
        System.out.println("objek dibuat..");
    }
    public static MySingelton getInstance(){
        return singelton;
    }
}
