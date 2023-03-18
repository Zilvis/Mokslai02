package mano;
import java.util.Scanner;

public class ManoSwitch {
    public static void main(String[] args) {
        boolean tiesa = false;
        String day;
        Scanner skaneris = new Scanner(System.in);

        while (true) {
            if (tiesa) {
                break;
            }
            System.out.println("Įveskite savatės dieną (nuo pirmadienio iki sekmadienio): ");
            day = skaneris.next();
            switch (day) {
                case "pirmadienis":
                case "pektadienis":
                case "antradienis":
                case "treciadienis":
                case "ketvirtadienis":
                case "sestadienis":
                    System.out.println("Jūs įvedėte " + day + ", geros dienos.");
                    tiesa = true; break;
                case "sekmadienis":
                    System.out.println("Jūs įvedėte " + day + ". Ar einate į bažnyčią: TAIP/NE ?");
                    day = skaneris.next();
                    if (day.equals("TAIP") || day.equals("taip")) {
                        System.out.println("Kelintą valandą mišios?");
                        day = skaneris.next();
                        System.out.println("Ačiū" + " užsukisiu ir aš į " +day+ " valandos mišias.");
                        tiesa = true; break;
                    } else if (day.equals("NE") || day.equals("ne")) {
                        System.out.println("Geros dienos. Kad tave velnias pagautų");
                        tiesa = true; break;
                    }

                default:
                    System.out.println("Tokios dienos savaitėje nėra...");
                    break;
            }
        }
    }
}


//TODO:
// Sukurti programą, kuri paprašytų vartotojo įvesti savaitės dieną (nuo pirmadienio iki sekmadienio).
//Įvedus dieną, turime išvesti vartotojui į ekraną, kokia diena buvo įvesta (pvz.: jūs įvedėte trečiadienį).
//Jeigu vartotojas įvedė sekmadienį, paklausti ar jis eis į bažnyčią?
// Jeigu eis į bažnyčią, paklausti kelintai valandai mišių, jeigu ne- palinkėti ramaus sekmadienio.
