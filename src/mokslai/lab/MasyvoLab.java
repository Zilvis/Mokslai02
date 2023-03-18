package mokslai.lab;
/*
Reikalavimai:Papildyti laboratorinį darbą nauju funkcionalumu.
Sukurti funkciją, surandančią mažiausią skaičių tarp lyginių neigiamų masyvo elementų.
 */

public class MasyvoLab {
    public static void main(String[] args) {
        int A[] = {10, 2, 4, 92, 65, -3, -7, -18, -55, -9};

        System.out.println("Masyvo teigiamu skaiciu kiekis: " + gautiLyginiuMasyvoElementuKieki(A));
        System.out.println("Masyvo skaiciu suma: " + gautiMasyvoSkaiciuSuma(A));
        System.out.println("Masyvo teigiamu skaiciu vidurkis: " + gautiMasyvoTeigiamuSkaiciuVidurki(A));
        System.out.println("Masyvo maziausia reiksme: " + gautiMaziausiaMasyvoElementa(A));
        System.out.println("Masyvo didziausia reiksme: " + gautiDidziausiaMasyvoElementa(A));
        System.out.print("Masyvo skaiciai:      ");
        spauzdintiMasyvoElementus(A);
        spauzdinaMasyvaPriesIrPoPakeitimu(A);
        System.out.println("");
        int []B = gautiNeigiamusLyginiusSkaicius(A);
        System.out.println("Masyvo mažiausias lyginis elementas: " + gautiMaziausiaMasyvoLyginiElementa(B));

    }

    static void spauzdintiMasyvoElementus(int masyvas[]) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
        System.out.print("\n");
    }

    static int gautiMasyvoTeigiamuSkaiciuVidurki(int masyvas[]) {
        int suma = gautiMasyvoSkaiciuSuma(masyvas);
        int kiekis = gautiLyginiuMasyvoElementuKieki(masyvas);
        int j = suma / kiekis;
        return j;
    }

    static int gautiLyginiuMasyvoElementuKieki(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0) {
                j = j + 1;
            }
        }
        return j;
    }

    static int gautiNeigiamuElemetuSkaiciu (int masyvas[]){
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] > 0 ){
                j = j + 1;
            }
        }
        return j;
    }

    static int[] gautiNeigiamusLyginiusSkaicius(int[] masyvas) {
        int k = gautiNeigiamuElemetuSkaiciu(masyvas);
        int n = 0;
        int[] j = new int[k];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 0){
                j[n] = masyvas[i];
                n=n+1;
            }
        }
        return j;
    }

    static int gautiMasyvoSkaiciuSuma(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                j = masyvas[i] + j;
            }
        }
        return j;
    }

    static int gautiMaziausiaMasyvoElementa(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < j) {
                j = masyvas[i];
            }
        }
        return j;
    }
    static int gautiMaziausiaMasyvoLyginiElementa(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < j && masyvas[i] % 2 == 0) {
                j = masyvas[i];
            }
        }
        return j;
    }

    static int gautiMaziausiaMasyvoElementaId(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < j) {
                j = i;
            }
        }
        return j;
    }

    static int gautiDidziausioMasyvoElementaId(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > j) {
                j = i;
            }
        }
        return j;
    }

    static int gautiDidziausiaMasyvoElementa(int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > j) {
                j = masyvas[i];
            }
        }
        return j;
    }

    static void spauzdinaMasyvaPriesIrPoPakeitimu(int masyvas[]) {
        int min = gautiMaziausiaMasyvoElementaId(masyvas);
        int max = gautiDidziausioMasyvoElementaId(masyvas);
        int laikinas = masyvas[min];
        masyvas[min] = masyvas[max];
        masyvas[max] = laikinas;
        System.out.print("Masyvas po pakeitimu: ");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
    }
}
