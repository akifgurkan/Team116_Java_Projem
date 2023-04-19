package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /* Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla isminizi, soyisminizi ve yaşınızı giriniz?");

        String isim= scanner.nextLine();
        String soyisim = scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);



    }
}
