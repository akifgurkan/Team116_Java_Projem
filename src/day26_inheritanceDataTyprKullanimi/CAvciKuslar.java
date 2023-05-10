package day26_inheritanceDataTyprKullanimi;

public class CAvciKuslar extends BKuslar {


    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar avci1 = new CAvciKuslar();
        System.out.println(avci1.beslenme);
        System.out.println(avci1.gaga);
        System.out.println(avci1.cogalma);
        System.out.println(avci1.kanat);
        System.out.println(avci1.hareket);
        System.out.println(avci1.pence);

        CAvciKuslar avciKuslarkusgiller = new CAvciKuslar();
        CAvciKuslar avciHayvangiller = new CAvciKuslar();

    }
}
