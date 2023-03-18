package mokslai.t1;
import java.util.Scanner;
public class whilePamoka {
    public static void main(String[] args) {
        int sk = 10;
        System.out.println("Daugybos lentele");
        String veiksmas = "Iveskte skaiciu: ";
        Scanner S = new Scanner(System.in);

        //TOL-KOL
        /* While (salyga) KartojamasSakinys: Naudojamas kaip reiksme ar skaicius yra nezinomas.
           1. Tikrinama reiskinio Salyga reiksme. Jei Salyga tenkinama, skaiciuojamas KartojamasSakinys, jei - ne tai 3 punktas.
           2.Eiti i 1 zingsni.
           3. Vykdomas sakinys, esantis zemiau ciklo kamieno.
         */
        int i = 1; // Vykdome viena karta todel priskiriame pries while cikla
        while (i < 10) {
            int atsakymas = i * sk;
            if (atsakymas < 50) {
                System.out.println(sk + " * " + i + " = " + atsakymas + " <50");
            } else if (atsakymas == 50) {
                System.out.println(sk + " * " + i + " = " + atsakymas + " ==50");
            } else if (atsakymas > 50) {
                System.out.println(sk + " * " + i + " = " + atsakymas + " >50");
            }
            i++;
        }
        //NUO - IKI
        /* Naudojimas kaip skaicius ar reiksme yra zinoma:
        R1 - Inicializavimo reiskinys,
        R2 - Vykdymo Reiskinys (salyga)
        R3 - kitimo reiskinys
        1. Skaiciuojamas R1
        2. Tikrinama R2 reiksme. Jei yra tiesa (true) vykdomas KartojamasSakinys, jei melas (false), tai - 5 punktas.
        3. Skaiciuojamas R3.
        4. Eiti i 2 zingsni.
        5. Vykdomas sakinys , esantis zemiau ciklo kamieno.

         for (R1, R2, R3) }
            KartojamasSakinys - Ber koks JAVA ciklas
           {
           Vykdomas sakinys False atveju (5 punktas)
        */
        for (int b = 1; b < 10; b++) {
            int atsakymas = b * sk;
            if (atsakymas < 50) {
                System.out.println(sk + " * " + b + " = " + atsakymas + " <50");
            } else if (atsakymas == 50) {
                System.out.println(sk + " * " + b + " = " + atsakymas + " ==50");
            } else if (atsakymas > 50) {
                System.out.println(sk + " * " + b + " = " + atsakymas + " >50");
            }
        }
    }
}
