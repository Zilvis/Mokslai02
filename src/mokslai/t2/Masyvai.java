package mokslai.t2;

public class Masyvai {
    public static void main(String[] args) {

        System.out.println("Masyve esantys skaiciai: ");
        int[] skaiciai = {3,-7,4,8,-9,27,-89,234,88,91};
        spauzdintiMasyvoElementus(skaiciai);
        spauzdinaMasyvoElementoKieki(skaiciai);
        System.out.println("Masyve esantys neigiami skaiciai: "+gautiMasyvoNeigemuElementuKieki(skaiciai));
        System.out.println("Masyvo teigiamu sklaiciu suma: "+masyvoElementuSuma(skaiciai));
        System.out.println("Masyvo teigiamu elemtu sandauga: "+masyvoElementuSandauga(skaiciai));
        System.out.print("Spauzdinamas teigiamu skaiciu elementai: ");
        spauzdintiMasyvoElementus(gautiTeigiamusMasyvoElementus(skaiciai));

    }
    static void spauzdintiMasyvoElementus (int masyvas[]){
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i]+", ");
        }
    }
    static void spauzdinaMasyvoElementoKieki (int masyvas[]){
        System.out.println("\nMasyvo elementu kiekis: "+masyvas.length);
    }
    static int gautiMasyvoNeigemuElementuKieki (int masyvas[]){
        int j = 0;
            for (int i = 0; i < masyvas.length; i++){
                if (masyvas[i] < 0) {
                    j = j + 1;
                }
            }
        return j;
    }

    static int gautiTeigiamuElemetuSkaiciu (int masyvas[]){
        int j = 0;
        for (int i = 0; i < masyvas.length; i++){
            if (masyvas[i] > 0 ){
                j = j + 1;
            }
        }
        return j;
    }
    static int masyvoElementuSuma (int masyvas[]) {
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0){
                j = masyvas[i] + j;
            }
        }
        return j;
    }
    static int masyvoElementuSandauga (int masyvas[]){
        int j = 1; //sandaugai naudojamas 1 nes nesidaugina is 0
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                j = j * masyvas[i];
            }
        }
        return j;
    }

    static int[] gautiTeigiamusMasyvoElementus (int masyvas[]) {
        int k = gautiTeigiamuElemetuSkaiciu(masyvas);
        int n = 0;
        int[] j = new int[k];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0){
                j[n] = masyvas[i];
                n=n+1;
            }
        }
        return j;
    }

}

//3. Suskaičiuoti teigiamų elementų sumą ir sandaugą*.
//4. Sukurti funkciją, grąžinančią teigiamus masyvo elementus ir juos atspausdinti*:
// int[] gautiTeigiamusMasyvoElementus(int[] masyvas) - Grazina sarasa sveiku skaiciu