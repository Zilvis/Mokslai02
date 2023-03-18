package mokslai.t2;

//TODO: Padaryti visus namu darbus
//TODO: Perdaryti laboratorini darba
//TODO: Isiaiskinti viska apie saraso ID
public class MasyvaiTestas1 {
    public static void main(String[] args) {
        //Debug(A);
        int A[] = {1, -2, 3, 4, 500, -1000, -2, -3, -400000, -500};
        spauzdinaSarasoElementus(A);
        System.out.println("Masyve esantis maziausias skaicius: "+gautiMaziausiaMasyvoSkaiciu(A)+" Jo id yra: "+gautiMaziausiaMasyvoElementoId(A));
        System.out.println("Masyve esantis didzias skaicius: "+gautiDidziausiaTeigiamaSkaiciu(A)+" Jo id yra: "+gautiDidziausiaMasyvoElementoId(A));
        System.out.println("Masyve esantys lyginiai skaiciai: "  +gautiMasyvoLyginiuSkaiciuKieki(A));
        System.out.println("Masyve esantys neigiami skaiciai: "  +gautiNeigiamuSkaiciuKieki(A));
        System.out.println("Masyve esantys teigiami skaiciai: "  +gautiTeigiamuSkaiciuKieki(A));
    }

    /**
     * Spauzdina sarase esanciu visus elementus
     *
     * @param masyvas - perduodamas sarasas
     */
    static void spauzdinaSarasoElementus(int masyvas[]) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Funkcija iesko masyve esancio maziausio skaiciaus
     *
     * @param masyvas - Perduodamas masyvas
     * @return - Grazinama maziausias skaicius
     */
    static int gautiMaziausiaMasyvoSkaiciu(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (j > masyvas[i]) { // Patikrina ar masyve esantis skaicius yra maziau nei j reiksme.
                j = masyvas[i];   // Jeigu randa mazesni skaiciu uz j tada priskiria nauja skaiciu.
            }
        }
        return j;
    }
    static int gautiMaziausiaMasyvoElementoId(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (j > masyvas[i]) { // Patikrina ar masyve esantis skaicius yra maziau nei j reiksme.
                masyvas[i] = j;
            }
        }
        return j;
    }

    static int gautiDidziausiaMasyvoElementoId(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (j < masyvas[i]) { // Patikrina ar masyve esantis skaicius yra maziau nei j reiksme.
                j = j + 1;
            }
        }
        return j;
    }

    /**
     * Funkcija masyve iesko lyginiu skaiciu sumos (Kiek is viso yra lyginiu skaiciu)
     * @param masyvas - Perduodamas masyvas
     * @return - Grazinamas masyve esanciu lyginiu skaiciu kiekis.
     */
    static int gautiMasyvoLyginiuSkaiciuKieki(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] % 2 == 0){ // Pagal formule patikrina ar skaicius yra lyginis.
                j = j + 1;            // Jeigu randa skaiciu kuris yra lyginis prideda +1 prie reiksmes.
            }
        }
        return j;
    }

    /**
     * Funkcija iesko masyve neigiamu skaiciu kiekio
     * @param masyvas - perduodamas masyvas
     * @return - Grazina neigiamu skaiciu kiekis
     */
    static int gautiNeigiamuSkaiciuKieki(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] > 0){
                j = j + 1;
            }
        }
        return j;
    }

    /**
     * Funkcija iesko teigiamu skaiciu kiekio
     * @param masyvas - perduodamas masyvas
     * @return - Grazina teigiamu skaiciu kieki.
     */
    static int gautiTeigiamuSkaiciuKieki(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] < 0){
                j = j + 1;
            }
        }
        return j;
    }

    static int gautiDidziausiaTeigiamaSkaiciu(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] > 0){
                j = masyvas[i];
            }
        }
        return j;
    }

    /*
    static void Debug(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (j > masyvas[i]) {
                j = masyvas[i];
                System.out.println(j);
            }
        }
    }
     */
}
