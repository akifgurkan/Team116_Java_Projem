package day07_switchString_Manipulations;

public class C07_Contains {
    public static void main(String[] args) {
        String str="Java ögren offer al";

// str de a harfi var mı?

        System.out.println(str.contains("a"));//true
        System.out.println(str.contains("x"));//false

        //sadece harf mi aranır
        System.out.println(str.contains("Offer"));//false
        System.out.println(str.contains("offer"));//true

        //char aratabilir miyiz
        System.out.println(str.contains("e"));//true



    }
}
