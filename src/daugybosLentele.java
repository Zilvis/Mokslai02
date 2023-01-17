import java.util.*;
public class daugybosLentele {
    public static void main(String[] args) {
        Scanner skaneris = new Scanner(System.in);
        float pirmasSkaicius;
        float antrasSkaicius;
        float atsakymas;
        System.out.print("Įveskite pirmajį skaičių: ");
        pirmasSkaicius = skaneris.nextFloat();
        System.out.print("Įveskite antrajį skaičių");
        antrasSkaicius = skaneris.nextFloat();
        atsakymas = (pirmasSkaicius * antrasSkaicius);
        System.out.println(pirmasSkaicius);
        System.out.println(antrasSkaicius);
        System.out.println(pirmasSkaicius+ " * " +antrasSkaicius+ " = " +atsakymas);
    }
}
