package day19_staticKeyword_passByValue;

public class C04_staticOlmayanBlock {
    public static void main(String[] args) {
        System.out.println("main method calisti");
        C04_staticOlmayanBlock obj1 = new C04_staticOlmayanBlock();
        C04_staticOlmayanBlock obj2 = new C04_staticOlmayanBlock();
        C04_staticOlmayanBlock obj3 = new C04_staticOlmayanBlock();

    }

    static {
        System.out.println("static blok calisti");
    }

    {
        /*
            static olmayan kod bloklari objelere baglidir
            her obje olusturuldugunda statik olmayan blok tekrar calisir
            static blok ise sadece 1 kere class ilk calismaya basladiginda calisir
            obje olusturuldugunda constructor icinde yapmak istemediginiz
            ama obje icin ihtiyac duydugunuz bir islem varsa
            static olmayan blok kullanilabilir
         */
        System.out.println("static olmayan kod blogu calisti");
    }
}