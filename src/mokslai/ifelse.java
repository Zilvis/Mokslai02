package mokslai;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        float sk = 9;
        String simbolis;

        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite skaičių: ");
        sk = skaneris.nextFloat();

        Scanner skaneris2 = new Scanner(System.in);
        System.out.println("Įveskite simbolį: ");
        simbolis = skaneris2.nextLine();
        //System.out.println(simbolis); //Debug

        for (float i = 1; i < 10; i++) {
            float daugyba;
            float dalyba;

            if (simbolis.equals("/")) { //eilutes lyginti tik per funkcija equals
                dalyba = (sk / i);
                if (dalyba < 50) {
                    System.out.println(sk + " / " + i + " = " + dalyba + " <50");
                } else if (dalyba == 50) {
                    System.out.println(sk + " / " + i + " = " + dalyba + " == 50");
                } else if (dalyba > 50) {
                    System.out.println(sk + " / " + i + " = " + dalyba + " > 50");
                }
            } else {
                daugyba = (i * sk);
                if (daugyba < 50) {
                    System.out.println(sk + " * " + i + " = " + daugyba + " <50");
                } else if (daugyba == 50) {
                    System.out.println(sk + " * " + i + " = " + daugyba + " == 50");
                } else if (daugyba > 50) {
                    System.out.println(sk + " * " + i + " = " + daugyba + " > 50");
                }
        } // salygos su simbolio nustatymo pabaiga
    } //for pabaiga
} // funkcijos main end
} //baigesi klase
