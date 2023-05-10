package day26_inheritanceDataTyprKullanimi;

public class FAvciKuslar extends EKuslar{
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");
    }
    public static void main(String[] args) {
        FAvciKuslar avciKus1 = new FAvciKuslar();
        avciKus1.cogalma();
        avciKus1.beslenme();
        avciKus1.kanat();
        avciKus1.omur();
        avciKus1.gaga();
        avciKus1.hareket();
        avciKus1.pence();
        avciKus1.solunum();


       EKuslar avciKusgiller = new FAvciKuslar();
        avciKus1.cogalma();
        avciKus1.beslenme();
        avciKus1.kanat();
        avciKus1.omur();
        avciKus1.gaga();
        avciKus1.hareket();
        avciKus1.pence();
        avciKus1.solunum();


        DHayvan acciHayvangiller = new FAvciKuslar();
    }
}
