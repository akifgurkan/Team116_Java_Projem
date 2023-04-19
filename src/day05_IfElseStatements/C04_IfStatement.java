package day05_IfElseStatements;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        // Verilen bir sayının 2,3,5,7,11 ve 23 sayılarından kaç tanesine kalansın böünebildiğini yazınız
        // Örneğin girilen saı 30 dediğinde outpu: 3 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz?");

        int girilenSayi = scanner.nextInt();

        int sayac=0;

        if (girilenSayi%2==0) sayac++;
        if (girilenSayi%3==0) sayac++;
        if (girilenSayi%5==0) sayac++;
        if (girilenSayi%7==0) sayac++;
        if (girilenSayi%11==0) sayac++;
        if (girilenSayi%23==0) sayac++;

        System.out.println("Girilen sayi, istenen sayılardan " + sayac + "tanesine tam bölünebilir");




    }
}
