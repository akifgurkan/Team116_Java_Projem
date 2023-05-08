package day24_inheritance;

public class FCorolla extends EToyota {
    FCorolla(){
        System.out.println("Corolla constructor çalıştı");
    }
    String str="corolla";
    String modelCorolla = "Corolla";

    public static void main(String[] args) {

        FCorolla corolla = new FCorolla();
        System.out.println(corolla.modelCorolla);
        System.out.println(corolla.marka);
        System.out.println(corolla.motor);
        System.out.println(corolla.str);


    }


}
/*Bir obje oluşturulduğunda
*
*
* */