package namuDarbai;

import java.util.*;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        String simbolis;
        float pirmasSkaicius, antrasSkaicius, atsakymas;
        Scanner skaneris = new Scanner(System.in);

        System.out.println("---Skaičiuotuvas---");
        System.out.print("Įveskite savo pirmajį skaičių: ");
        pirmasSkaicius = skaneris.nextFloat();
        System.out.print("Įveskite norimą simbolį: (+, -, *, /) ");
        simbolis = skaneris.next();
        System.out.print("Įveskite savo antrajį skaičių: ");
        antrasSkaicius = skaneris.nextFloat();

        switch (simbolis) {
            case "+" : System.out.println((atsakymas = pirmasSkaicius + antrasSkaicius) + pirmasSkaicius + " + " +antrasSkaicius+ " = " +atsakymas);
            break;
            case "-" : System.out.println((atsakymas = pirmasSkaicius - antrasSkaicius) + pirmasSkaicius + " - " +antrasSkaicius+ " = " +atsakymas);
            break;
            case "*" : System.out.println((atsakymas = pirmasSkaicius * antrasSkaicius) + pirmasSkaicius + " * " +antrasSkaicius+ " = " +atsakymas);
            break;
            case "/" : System.out.println((atsakymas = pirmasSkaicius / antrasSkaicius) + pirmasSkaicius + " / " +antrasSkaicius+ " = " +atsakymas);
            break;
            default: System.out.println("Klaidingas simbolis");
        }
    }
}
