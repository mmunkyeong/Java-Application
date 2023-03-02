package org.example;

import java.util.Scanner;

public class Container {  //구조 개선
    public static Scanner sc;

    public static void init(){
        sc=new Scanner(System.in);
    }
    public static void close(){
        sc.close();
    }
    public static Scanner getScanner(){
        return sc;
    }
}
