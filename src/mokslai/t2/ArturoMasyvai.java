package mokslai.t2;

public class ArturoMasyvai {
    public static void main(String[] args) {
        int[] masyvas = {1, 8, 4, 3, 5, -8, -1, -3, -2, -1};
        System.out.println("Laboratorinis darbas Nr.3");
        System.out.println("Sukuriame ir atspaudiname 10 skaiciu masyva (5 teigiami ir 5 neigiami)");
        spausdinimas(masyvas);
        System.out.println("\n Lyginiu skaiciu sumos vidurkis yra lygus: ");
        double sum = lyginiuSkaiciuSuma(masyvas);
        double kiek = lyginiuSkaiciuKiekis(masyvas);
        vidurkis(sum, kiek);
        System.out.println("Sukeiciame didziausia ir maziausia masyvo skaicius vietomis: ");
        sukeiciameSpausdiname(masyvas, didziausias(masyvas), maziausias(masyvas));
        System.out.println("\nMaziausias tarp neigiamų lyginis skaičius yra: " + maziausiasneigiamaslyginis(masyvas));

    }

    /**
     * Funkcija suranda maziausia neigiama lygini masyvo skaiciu
     *
     * @param masyvas
     * @return min
     */
    static int maziausiasneigiamaslyginis(int masyvas[]) {
        int min = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 0) {
                if (masyvas[i] % 2 == 0) {
                    if (masyvas[i] < min) {
                        min = masyvas[i];
                    }
                }
            }
        }
        return min;
    }

    /**
     * Funkcija atspaudina masyva, sukeicia didziausia ir maziausia skaiciu, ir vel atspausdina
     *
     * @param masyvas
     * @param a       - maziausias skaicius
     * @param b       - didziausias skaicius
     */
    static void sukeiciameSpausdiname(int masyvas[], int a, int b) {
        System.out.println("Masyvas prieš sukeitima :");
        spausdinimas(masyvas);
        int i = masyvas[a];
        masyvas[a] = masyvas[b];
        masyvas[b] = i;
        System.out.println("\nMasyvas po sukeitimo :");
        spausdinimas(masyvas);
    }

    /**
     * Funkcija surandanti maziausia masyvo skaiciu (vieta)
     *
     * @param skaiciai
     * @return index - maziausio skaiciaus indeksas
     */
    static int maziausias(int skaiciai[]) {
        int min = skaiciai[0];
        int index = 0;
        for (int i = 1; i < skaiciai.length; i++) {
            if (skaiciai[i] < min) {
                min = skaiciai[i];
                index = i;
            }
        }
        return index;
    }


    /**
     * FUnkcija randanti didziausia masyvo skaiciu (vieta)
     *
     * @param skaiciai
     * @return j - didziausio skaiciaus indeksas
     */
    static int didziausias(int skaiciai[]) {
        int max = skaiciai[0];
        int j = 0;
        for (int i = 1; i < skaiciai.length; i++) {
            if (skaiciai[i] > max) {
                max = skaiciai[i];
                j = i;
            }
        }
        return j;
    }

    /**
     * Funkcija apskaiciuojanti vidurki ir ji atspausdina
     * <p>
     * * @param a - lyginiu skaiciu suma
     * b - lyginiu skaiciu kiekis
     */
    static void vidurkis(double a, double b) {
        double j = a / b;
        System.out.println(j);
    }

    /**
     * Funkcija lyginiu skaiciu kiekiui apskaiciuoti
     *
     * @param skaiciai
     * @return
     */
    static int lyginiuSkaiciuKiekis(int skaiciai[]) {
        int kiek = 0;
        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] % 2 == 0) {
                kiek = kiek + 1;
            }
        }
        return kiek;
    }

    /**
     * Funkcija grazinanti masyvo lyginiu skaiciu suma
     *
     * @param skaiciai
     * @return sum
     */

    static int lyginiuSkaiciuSuma(int skaiciai[]) {
        int sum = 0;
        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] % 2 == 0) {
                sum = sum + skaiciai[i];
            }
        }
        return sum;
    }

    /**
     * Funkcija atspaudinanti masyva
     *
     * @param skaiciai
     */
    static void spausdinimas(int skaiciai[]) {
        for (int i = 0; i < skaiciai.length; i++) {
            System.out.print(skaiciai[i] + ",");
        }
    }
}

/* 1. Sukurti 10 + ir - skaičių masyvą.
2. Sukurti funkciją, skaičiuojančią lyginių masyvo elementų vidurkį (sumai ir kiekiui atskiros funkcijos (!)).
3. Sukeisti dydžiausias ir mažiausias reikšmes masyve vietomis (atskiros funkcijos min ir max radimui).
4. Sukurti funkciją, spausdinančią masyvą prieš pakeitimus ir po jų.
5. Sukurti funkciją, surandančią mažiausią skaičių tarp lyginių neigiamų masyvo elementų.
*/

