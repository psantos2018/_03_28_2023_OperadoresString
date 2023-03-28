package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Asignacion de variables
        int a = 10;
//        a=a+5;
        a+=5;
        System.out.println(a);
        int b = 10;
        b-=5;
        System.out.println(b);
        int d = 10;
        d++;
        System.out.println(d);
        //Pre-incremento y post-incremento
        int c=10;

        //restore variables
        int e = 10;
        int f = 5;
        e+=++f;
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = 5;
        g+=--h;
        System.out.println(g);
        System.out.println(h);


    }
}