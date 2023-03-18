package mokslai.t2;
// Funkcijos kurias kvieciame lokaliai yra penkiu tipu
// void tai nieko negrazinanti funkcija
/*-
    - funkcija grąžinanti reikšmę be parametrų
    - funkcija grąžinanti reikšmę su parametrais
    - funkcija negrąžinanti reikšmės be parametrų
    - funkcija negrąžinanti reikšmės su parametrais
    funkcija su tuo pačiu pavadinimu tik skirtingu parametrų skaičiumi arba skirtingu parametrų tipu
 */
/*
    Funkcija susideda is:
     -Kreipinio
     -Antrastes kuria sudaro Static arba void tai grazinanti arba ne ir argumentu kuriuose nurodome tam tikrus kintamuosius
     -Kamieno kuriamia darome skaiciavimus arba atliekame tam tikras funkcijas
     -Grazinamos reiksmes kuria graziname atlike veiksmus kamiene
 */
public class Funkcijos {

    public static void main(String[] args) {
        double a = 3.2, b = 8.6; //a b reiksmes
        double c = sudeti(a, b); //Kreipiames i funkcija su parametrais

        System.out.println("Tai yra grazinanti funkcija su parametrais. Grazinta reiksme yra: "+c);
        negrazinanti();
        System.out.println("Tai yra grazinanti funkcija be parametru. Grazinta reiksme yra: "+c);
        negrazinantiReiksmesSuParametrais(104,29);
    }

    /**
     * Grazinanti funkcija su parametrais
     * @param a 3.2
     * @param b 8.6
     * @return graziname c reiksme atlike sudeti
     */
    static double sudeti(double a, double b) {//funkcijos antraste
        double c = a + b;                       //Funkcijos kamienas
        return c;
    }

    /**
     * Funkcija negrazinanti reiksmes. Atspauzdina teksta
     */
    static void negrazinanti (){
        System.out.println("Cia yra negrazinamos funkjcijos pavyzdys be parametru");
    }

    /**
     * Tai yra funkcija grazinanti reiksme bet be parametru
     *
     * @return grazina c reiksme kuria apskaiciuoja pas save su nurodytais kintamaisiais
     */
    static int grazinantiBeparametru(){
        int a = 200;
        int b = 300;
        int c = a + b;
        return c;
    }
    //Funkcija negrazinanti reiksmes su parametrais
    static void negrazinantiReiksmesSuParametrais (int a,int b){
       int x = (a-b);
        System.out.println("Neesu tikras ar tai geras pavyzdys bet sita klase nieko negrazina bet yra su parametrais kuriuos galime irasyti "+x);
    }
}
