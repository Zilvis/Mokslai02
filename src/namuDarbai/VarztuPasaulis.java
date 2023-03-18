package namuDarbai;
import java.util.*;
public class VarztuPasaulis {
    static boolean on = true;
    static Scanner sc3 = new Scanner(System.in); //Boolean
    public static void main(String[] args) {
        String kompanijosPavadinimas = "UAB Varztų Pasaulis";
        int kompanijaIkurta = 2022, darbuotojuSkaicius = 5,menu;
        double bazinisAtlyginimas, daugiklis, galutinisAtlyginimas;


        Scanner sc1 = new Scanner(System.in); //menu int
        Scanner sc2 = new Scanner(System.in); //double skaiciavimams


        while (on) {
            logo();
            System.out.print("\n    Pasirinkite norimą atlikti darbą\n");
            System.out.print( "" +
                    "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                    "|   ❶ ♯ Bazinis atlyginimas ir daugikliai\n" +
                    "|   ❷ € Algų skaičiuoklė\n" +
                    "|   ❸ ⥁ Automatinis algų apskaičiavimas\n" +
                    "|   ❹ \uD83D\uDCCB Statistika\n" +
                    "|   ❺ ❌Išeiti\n" +
                    "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
            menu = sc1.nextInt();
            if (menu == 1){
                clr();
                bazinisAtlyginimas = 1000;
                System.out.println("\nBazinis "+kompanijosPavadinimas+" atlyginimas: "+bazinisAtlyginimas+" EUR\n");
                System.out.println("Daugikliai:\nNeįvykdytas normatyvas: 0.5x \nĮvykdytas normatyvas: 1x\nViršytas normatyvas: 1.5x");
                on();
            }else if (menu ==2){
                clr();
                System.out.println("        ALGŲ SKAIČIUOKLĖ");
                System.out.print("Įveskite darbuotojo bazinį atlyginimą: ");
                bazinisAtlyginimas = sc2.nextDouble();
                normaMenu();
                daugiklis = sc2.nextDouble();
                if(daugiklis == 1){
                    galutinisAtlyginimas = norma(bazinisAtlyginimas,0.5);
                    System.out.println("Darbuotojas nepasiekė minimalaus normatyvo!\nPagal jūsų pateiktus duomenis atlyginimas yra: "+galutinisAtlyginimas+ " EUR");
                    on();

                }else if(daugiklis == 2){
                    galutinisAtlyginimas = norma(bazinisAtlyginimas,1);
                    System.out.println("Darbuotojas pasiekė nustatyta normatuvą!\nPagal jūsų pateiktus duomenis atlyginimas yra: "+galutinisAtlyginimas+ " EUR");
                    on();
                }else if(daugiklis == 3){
                    galutinisAtlyginimas = norma(bazinisAtlyginimas,1.5);
                    System.out.println("Darbuotojas viršijo normatvą!\nPagal jūsų pateiktus duomenis atlyginimas yra: "+galutinisAtlyginimas+ " EUR");
                    on();
                }
            }else if (menu == 3){
                automatinisAlgosSkaicimas(darbuotojuSkaicius);
            }else if (menu ==4){
                imonesStatistika(kompanijosPavadinimas,darbuotojuSkaicius,kompanijaIkurta);
            }else if (menu ==5){
                System.out.println("Ačiu, viso gero.");
                on = false;
            }else{
                System.out.println("Tokio pasirinkimo nėra!");
                on();
            }
        }
    }

    /**
     * Automatiskai apskaiciuoja darbuotoju atlyginima,
     * atsitiktiniu budu gaunama alga nuo 1000 iki 3000
     * @param darbuotojuSkaicius nustatomas zmoniu skaicius
     */
    static void automatinisAlgosSkaicimas (int darbuotojuSkaicius){
        clr();
        System.out.println("Automatinis algu skaiciuotuvas:");
        for (int i =1; i<darbuotojuSkaicius+1; i++){
            double randAlga = random(1000,3000);
            double randKof = random();
            vardai();
            System.out.println(" | Bazine alga: "+randAlga+" | Daugiklis: "+randKof+"x = "+(randAlga * randKof)+ " EUR");
        }
        on();
    }

    /**
     * Isveda i ekrana imones statistika pavadinima ir darbuotoju skaiciu
     * @param kompanijosPavadinimas nusakomas imones pavadinimas
     * @param darbuotojuSkaicius nusakomas imones darbuotoju skaicius
     * @param kompanijaIkurta nurodo kada kompanija ikurta
     */
    //Funkcija negrazinanti reiksmes su parametrais
    static void imonesStatistika (String kompanijosPavadinimas,int darbuotojuSkaicius,int kompanijaIkurta){
        clr();
        System.out.println("" +
                "           ╔═══════════════╗\n" +
                "           |   STATISTIKA  |\n" +
                "           ╚═══════════════╝\n" +
                "       Pavadinimas: "+kompanijosPavadinimas +"\n"+
                "       Kompanija veikia nuo: "+kompanijaIkurta+ "\n"+
                "       Dirbatys darbuoltojai: "+darbuotojuSkaicius+"\n" +
                "       Kompanijos našumas: 70%\n" + //TODO: Pabaigti
                "       Grynasis pelnas: 200.000 EUR");  //TODO: pabaigti
        on();
    }

    /**
     * Skaiciuojamas atlyginimas dauginant baziniAtlyginima su daugikliu (kofeciantu)
     * @param bazinisAtlyginimas Pradinis atlyginimas nustatomas firmos
     * @param daugiklis Nustatomas pagal pasiekimus (atliktus normatyvus)
     * @return Grazina galutini atlyginima
     */
    static double norma (double bazinisAtlyginimas, double daugiklis){
        return bazinisAtlyginimas * daugiklis;
    }

    /**
     * Skaiciuoja atsitiktini skaiciu kuris panaudojamas imituoti duomenu baze baziniai algai gauti
     * @param nuo Nustatomos ribos
     * @param iki Nustatomos ribos
     * @return gaunama atsitiktine bazine alga
     */
    static double random (double nuo, double iki){
        return Math.floor(Math.random() * (nuo - iki + 1) + iki);
    }

    /**
     * Skaiciuoja atsitiktini skaiciu kurie panaudojami gauti atsitiktini koficianta (normatyva)
     * kurio pagalba dauginama bazine alga. Imituojama duomenu baze
     * @return gaunama atsitiktis kofeciantas (Daugiklis)
     */
    static double random (){
        Random rand = new Random();
        return rand.nextDouble()+0.5;
    }

    /**
     * Atvaizduoja meniu
     */
    static void normaMenu (){
        System.out.print("Pasirinkite daugiklį: \n" +
                "1. Nepasiektas normatyvas 0.5x \n" +
                "2. Pasiektas normatyvas   1x   \n" +
                "3. Viršytas normatyvas    1.5x   \n");
    }

    /**
     * Atvaizduoja logo
     */
    static void logo (){
        System.out.println("" +
                "       .--.\n" +
                "      /  //\\,.,.,.,.,.,.,.,.,.\n" +
                "      | // |/ / / / / / / / / >\n" +
                "      \\//  / ' ' ' ' ' ' ' ' '\n" +
                "       `--'  ");
    }

    /**
     * Atsitiktine tvarka generuoja index id ir pagal id atrenka varda
     */
    static void vardai (){
        String[] vardai = {"Matas  ", "Nojus  ", "Lukas  ", "Dovydas","Kajus  ","Emilija","Gabija ","Ugnė   ","Urtė   ","Austėja"};
        Random random = new Random();
        int index = random.nextInt(vardai.length);
        System.out.print(vardai[index]);
    }

    /**
     *  Išvalo ekraną
     *
     */
    static void clr (){
        for(int i = 0; i < 30; i++)
        {
            System.out.println("\n");
        }
    }

    /**
     * Leidžia pasirinkti ar išeiti ar tęsti toliau
     * Įvędus Y arba y programa tęsia darbą
     * Įvedus bet ką kito programa sustoja
     */
    static void on (){
        System.out.println("\nTęsti? (y)");
        String testi = sc3.next();
        if (testi.equals("y") || testi.equals("Y")){
            clr();
        }else{
            System.out.println("Ačiu, viso gero.");
            on = false;
        }
    }

}

/*
    Panaudoti "Varžtų pasaulio" programoje šias funkcijas (kitą kartą galėsime aptarti kaip sekėsi, palyginti skirtingus variantus):
    - funkcija grąžinanti reikšmę be parametrų
    - funkcija grąžinanti reikšmę su parametrais
    funkcija negrąžinanti reikšmės be parametrų
    funkcija negrąžinanti reikšmės su parametrais
    -funkcija su tuo pačiu pavadinimu tik skirtingu parametrų skaičiumi arba skirtingu parametrų tipu


 */