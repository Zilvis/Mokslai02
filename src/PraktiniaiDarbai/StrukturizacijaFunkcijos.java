package PraktiniaiDarbai;
import java.util.Scanner;

public class StrukturizacijaFunkcijos {
    public static void main(String[] args) {
        String arTesti = "y";
        clr();
        double sk1, sk2;

        while (arTesti.equals("y") || arTesti.equals("Y")) {
            System.out.println(ANSI_YELLOW + "SKAIČIUOTUVAS" + ANSI_RESET);
            System.out.println("" +
                    "Pasirinkite norimą atlikti veiksmą iš sąrašo:\n" +
                    "1. Sudėtis\n" +
                    "2. Atimtis\n" +
                    "3. Dalyba\n" +
                    "4. Daugyba\n" +
                    "5. & Formulė\n" +
                    "6. Išeiti");
            Scanner A = new Scanner(System.in);
            int meniu = A.nextInt();

            if (meniu == 1) {
                sk1 = skanerisPirmamSkaiciui();
                sk2 = skanerisAntramSkaiciui();
                System.out.println("Atsakymas: " + sk1 + " + " + sk2 + " = " + sudetis(sk1, sk2));
                arTesti = arTesti();
            } else if (meniu == 2) {
                System.out.println(atimtis());
                arTesti = arTesti();
            } else if (meniu == 3) {
                dalyba();
                arTesti = arTesti();
            } else if (meniu == 4) {
                daugyba(skanerisPirmamSkaiciui(), skanerisAntramSkaiciui());
                arTesti = arTesti();
            } else if (meniu == 5) {
                spauzdinaFunkcija();
                arTesti = arTesti();
            } else if (meniu == 6) {
                System.out.println("Gražios dienos. Programa baigia darbą.");
                break;
            } else {
                System.err.println("Tokio pasirinkimo nėra!");
            }
        }

    }

    /**
     * Funkcija skirta atspauzdinti skaiciuojaFunkcija(); suskaiciuotos funkcijos rezultatus ir palyginti pagal nurodytus parametrus
     */
    static void spauzdinaFunkcija() {
        double sk1 = skanerisPirmamSkaiciui();
        double sk2 = skanerisAntramSkaiciui();
        for (int i = 0; i < 199 +1; i++) {
            double atsakymas = skaiciuojaFunkcija(sk1, sk2) * i;
            if (atsakymas < 100) {
                System.out.println("(" + sk1 + " + " + sk2 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + atsakymas + " < 100");
            } else if (atsakymas == 100) {
                System.out.println("(" + sk1 + " + " + sk2 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + atsakymas + " == 100");
            } else if (atsakymas > 100) {
                System.out.println("(" + sk1 + " + " + sk2 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + atsakymas + " > 100");
            }
        }
    }

    /**
     * Funkcija skaiuciuoja du skaicius
     *
     * @param sk1 pirmas skaiucius
     * @param sk2 antras skaicius
     * @return grazina skaiciu suma kuria suskaiciuojame pagal formule
     */
    static double skaiciuojaFunkcija(double sk1, double sk2) {
        double atsakymas;
        atsakymas = ((sk2 + sk1) * sk2 + (sk2 - sk1) / sk1);
        return atsakymas;
    }

    /**
     * Funkcija atlieka sudėtį tarp dviejų skaičių
     *
     * @param sk1 Pirmas skaičius
     * @param sk2 Antras skaičius
     * @return Dviejų skaičių sudėtį
     */

    //Funkcija su parametrais ir grazinanti
    static double sudetis(double sk1, double sk2) {
        double rezultatas;
        rezultatas = sk1 + sk2;
        return rezultatas;
    }

    /**
     * Funkcija naudojama atvaizduoti du kitoje atimties funkcijoje įvestus skaičius
     *
     * @param a pirmas skaičius
     * @param b antras skaičius
     */
    //Funkcija su parametrais be reiksmes grazinimo
    static void atimtis(double a, double b) {
        System.out.print(ANSI_GREEN + "Rezultatas: " + ANSI_RESET + ANSI_PURPLE + a + ANSI_RESET + " - " + ANSI_BLUE + b + ANSI_RESET + " = ");
    }

    /**
     * Atima du įrašytus skaičius kuriuos gauname iš skanerisPirmasSkaicius, skanerisAntrasSkaicius funkcijų.
     * Suskaičiuojame atsakymą kuri graziname. Funkcijoje įvestus skaičius panaudojame kitoje funkcijoje atvaizduoti.
     *
     * @return Atimties rezultatą tarp sk1 ir sk2 skaičių.
     */
    //Grazina reiksme be parametru
    static double atimtis() {
        double sk1, sk2, rezultatas;
        sk1 = skanerisPirmamSkaiciui();
        sk2 = skanerisAntramSkaiciui();
        rezultatas = sk1 - sk2;
        atimtis(sk1, sk2);
        return rezultatas;
    }

    /**
     * Atliekama dalyba funkcijos viduje tarp sk1 ir sk2.
     */
    //Funkcija nieko negrazina ir neturi parametrų
    static void dalyba() {
        double sk1 = skanerisPirmamSkaiciui();
        double sk2 = skanerisAntramSkaiciui();
        if (sk2 == 0) {
            System.err.println("Dalyba iš nulio negalima!");
        } else {
            double rezultatas = sk1 / sk2;
            System.out.println("Atsakymas: " + sk1 + " / " + sk2 + " = " + rezultatas);
        }
    }

    /**
     * Funkcijoje atliekama daugyba tarp sk1 ir sk2 skaičių.
     *
     * @param sk1 pirmas skaičius
     * @param sk2 antras skaičius
     */
    //Funkcija turi parametrus bet nieko negražina
    static void daugyba(double sk1, double sk2) {
        double rezultatas = (sk1 * sk2);
        System.out.println("Atsakymas: " + sk1 + " * " + sk2 + " = " + rezultatas);
    }

    /**
     * Skaneris naudojamas funkcijose skaičiui priskirti
     *
     * @return Gaunamas vartotojo įvestas skaičius.
     */
    static double skanerisPirmamSkaiciui() {
        System.out.print(ANSI_PURPLE + "Įveskite primajį skaičių: " + ANSI_RESET);
        Scanner A = new Scanner(System.in);
        return A.nextDouble();
    }

    /**
     * Skaneris naudojamas funkcijose skaičiui priskirti
     *
     * @return Gaunamas vartotojo įvestas skaičius.
     */
    static double skanerisAntramSkaiciui() {
        System.out.print(ANSI_BLUE + "Įveskite antrajį skaičių: " + ANSI_RESET);
        Scanner A = new Scanner(System.in);
        return A.nextDouble();
    }

    /**
     * Funkcija kuri leidžia vartotojui pasirinkti ar testi toliau darba ar užbaigti programa
     * Programa veiks tol kol vartotojas įrašys y raidę. Įrašius bet ką kito programa sustoja.
     *
     * @return Grazina įrašyta simbolį
     */
    static String arTesti() {
        String arTesti;
        System.out.println("Ar norite tęsti?: (y)");
        Scanner arTestiSkaneris = new Scanner(System.in);
        arTesti = arTestiSkaneris.next();
        if (arTesti.equals("y") || arTesti.equals("Y")) {
            clr();
        } else {
            System.out.println(ANSI_CYAN + "Gražios dienos. Programa baigia darbą." + ANSI_RESET);
        }
        return arTesti;
    }

    /**
     * clr - Tai funkcija kuri išvalo ekrana naudodama \n
     */
    static void clr() {
        for (int i = 0; i < 5; i++) {
            System.out.print("\n");
        }
    }

    //FINAL Tipas nurodo kad jis negales buti EXTENDED ir nebus galima pakeisti nurodytu parametru
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_PURPLE = "\u001B[35m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_RESET = "\u001B[0m"; // Atstato default spalva

}

