package day19_staticKeyword_passByValue;

public class C03_staticBlock {
    static {
        System.out.println("en üst static block ilk çalıştı ");

    }//2. static

    public static void main(String[] args) {
        System.out.println("main methot çalıştı");

    }//main

    static {
        System.out.println("static block ilk çalıştı ");

    }//static

    static {
        System.out.println("2. static block ilk çalıştı ");

    }//2. static

}
