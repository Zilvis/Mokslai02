package mokslai.t2;

import java.util.Scanner;

public class funkcijosKlasesDarbas {

    public static void main(String[] args) {
        spausdintiAntraste();
        double bazinisAtl, galutinisAtl, koeficientas;
        String arToliau;


        arToliau = "taip";
        while (arToliau.equals("Taip") || arToliau.equals("taip") || arToliau.equals("TAIP")) {

            System.out.println("Prašome įvesti pasirinkto darbuotojo bazinį atlyginimą, centų tikslumu:");

            bazinisAtl = gautiVartotojoIvestaSkaiciu();
            System.out.println("Įveskite šio mėnesio darbuotojo atlyginimo koeficientą skaičiais - \n" +
                    " norma-1;\n žemiau normos 0,5; \naukščiau normos 1,5;");
            koeficientas = gautiVartotojoIvestaSkaiciu();

            if (koeficientas == 1) {
                galutinisAtl = skaiciuoti(bazinisAtl, koeficientas);
                System.out.println("Atlyginimas yra:" + galutinisAtl + "Eur");
            } else if (koeficientas == 0.5) {
                galutinisAtl = skaiciuoti(bazinisAtl, koeficientas);
                System.out.println("Atlyginimas yra:" + galutinisAtl + "Eur");
            } else if (koeficientas == 1.5) {
                galutinisAtl = skaiciuoti(bazinisAtl, koeficientas);
                System.out.println("Atlyginimas yra:" + galutinisAtl + "Eur");
            } else {
                System.out.println(" Blogai įvestas koeficientas");
                continue;
            }
            arToliau = arTestiToliauDarba();

        }
        System.out.println("Gražios dienos");
    }

    /**
     * Spausdina programos antraste
     */
    //negrazinanti reiksmes funkcija VOID be parametru
    static void spausdintiAntraste() {

        System.out.println("Varžtų pasaulis, atlyginimo skaičiuoklė");
    }

    /**
     * atlieka dvieju kintamuju daugybos veiksma
     *
     * @param a pirmas skaicius
     * @param b antras skaicius
     * @return grazina dvieju skaiciu daugyba
     */
    //grazinanti reiksme funkcija su parametrais
    static double skaiciuoti(double a, double b) {
        return a * b;
    }

    /**
     *  Gauna įvestą vartotojo skaičių
     *  Naudojamas scanner biblioteka
     *  Gražina ivestasSkaicius
     * @return Skaičių double
     */
    // Funklcija grazinanti reiksme be parametru
    static double gautiVartotojoIvestaSkaiciu (){ //Antraste
        Scanner sk1 = new Scanner(System.in);     //Kamienas
        double ivestasSkaicius = sk1.nextDouble();
        return ivestasSkaicius;                   //Grazinimas
    }

    /**
     * Vartotojo klausiama ar nori testi toliau programa
     * @return grazina String (Tikisi Taip) jei kazkas kito uzbaigia programa
     */
    //Funkcija be parametru nieko negrazinanti
    static String arTestiToliauDarba () {
        System.out.print("Ar norite skaičiuoti sekančio darbuotojo atlyginimą?\n (Taip)");
        Scanner op = new Scanner(System.in);
        String arToliau = op.next();
        return arToliau;
    }

}
//*4. Panaudoti "Varžtų pasaulio" programoje šias funkcijas:

//1.funkcija grąžinanti reikšmę be parametrų
//2.funkcija grąžinanti reikšmę su parametrais   +
//3.funkcija negrąžinanti reikšmės be parametrų  +
//4.funkcija negrąžinanti reikšmės su parametrais
//5.funkcija su tuo pačiu pavadinimu tik skirtingu parametrų skaičiumi arba skirtingu parametrų tipu
//6. scaneris, spausdinimas, nexit in, out, if elsai, pagalvoti, systemoutprintlin gali buti vienoj