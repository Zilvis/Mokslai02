package mano;
import java.util.*;
public class ManoSwitch {
    public static void main(String[] args) {
        String diena = "penktadienis";
        String komentaras = "tai ne ta diena kurios ieškojome";
        Scanner skaneris = new Scanner(System.in);

        System.out.println("Savaitės dienų testavimas");
        System.out.println("Kokia diena dirbančiam žmogui yra pati geriausia: ");
        diena = skaneris.nextLine();

        switch (diena) {
            case "pirmadienis" : System.out.println("Pirmadienis" +komentaras);
            break;
            case "antradienis": System.out.println("Antradienis" +komentaras);
            break;
            case "treciadienis": System.out.println("Trečiadienis" +komentaras);
            break;
            case "ketvirtadienis": System.out.println("Ketvirtadienis" +komentaras);
            break;
            case "penktadienis": System.out.println("Taip penktadienis yra geriausia savaitės diena!");
            break;
            case "sestadienis": System.out.println("Sestadienis" +komentaras);
            break;
            case "sekmadienis": System.out.println("Sekmadienis " +komentaras);
            break;
            default: System.out.println(diena+ " nepanasu i savaitės dienos pavadinimą!");
        }
    }
}
