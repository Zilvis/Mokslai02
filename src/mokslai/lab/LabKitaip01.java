package mokslai.lab;
import java.util.Scanner;

public class LabKitaip01 {
    public static void main(String[] args) {
        double sk1, sk2, atsakymas;
        boolean veikia = true;
        char veiksmas;
        String testi;
        Scanner S = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);
        Scanner S3 = new Scanner(System.in);

        while (veikia){
            System.out.print("Įveskite pirmajį skaičių: ");
            sk1 = S.nextDouble();
            System.out.print("Įveskite ženklą (* / + -) kad atliktumėt veiksmą: ");
            veiksmas = S2.next().charAt(0);
            System.out.print("Įveskite antrajį skaičių: ");
            sk2 = S.nextDouble();

            switch (veiksmas){
                case '+': atsakymas = sk1 + sk2;
                System.out.println("\nAtlikti veiksmai: ( "+sk1 + " " +veiksmas + " " + sk2 +" )");
                System.out.println("Atsakymas: "+atsakymas);
                    System.out.println("\nAr norite tęsti? : (TAIP/NE) ");
                    testi = S3.next();
                    if (!testi.equals("TAIP") && !testi.equals("taip")) {
                        veikia = false;
                    }
                    break;
                case '-': atsakymas = (sk1 - sk2);
                System.out.println("\nAtlikti veiksmai: ( "+sk1 + " " +veiksmas + " " + sk2 +" )");
                System.out.println("Atsakymas: "+atsakymas);
                    System.out.println("\nAr norite tęsti? : (TAIP/NE) ");
                    testi = S3.next();
                    if (!testi.equals("TAIP") && !testi.equals("taip")) {
                        veikia = false;
                    }
                    break;
                case '*': atsakymas = (sk1 * sk2);
                System.out.println("\nAtlikti veiksmai: ( "+sk1 + " " +veiksmas + " " + sk2 +" )");
                System.out.println("Atsakymas: "+atsakymas);
                    System.out.println("\nAr norite tęsti? : (TAIP/NE) ");
                    testi = S3.next();
                    if (!testi.equals("TAIP") && !testi.equals("taip")) {
                        veikia = false;
                    }
                    break;
                case '/': atsakymas = (sk1 / sk2);
                if (sk2 == 0){
                    System.out.println("Dalyba iš nulio negalima!");
                }else{
                    System.out.println("\nAtlikti veiksmai: ( "+sk1 + " " +veiksmas + " " + sk2 +" )");
                    System.out.println("Atsakymas: "+atsakymas);
                }
                    System.out.println("\nAr norite tęsti? : (TAIP/NE) ");
                    testi = S3.next();
                    if (!testi.equals("TAIP") && !testi.equals("taip")) {
                        veikia = false;
                    }
                    break;
                case '#': for (int i = 13; i < 26; i++) {
                    atsakymas = (sk1 * sk2 + (sk2 - sk1) / sk1 * i);
                    if (atsakymas < 6){
                        System.out.println(" Gauta suma: "+atsakymas+" | "+sk1+ " * " +sk2+ " + " + "("+sk2+ " - "+sk1+ ")"+ " / "+sk1+ " * " +i+ " = ("+atsakymas+" <"+" 6 )");
                    }else if (atsakymas == 6) {
                        System.out.println(" Gauta suma: "+atsakymas+" | "+sk1+ " * " +sk2+ " + " + "("+sk2+ " - "+sk1+ ")"+ " / "+sk1+ " * " +i+ " = ("+atsakymas+" =="+" 6 )");
                    }else if (atsakymas > 6){
                        System.out.println(" Gauta suma: "+atsakymas+" | "+sk1+ " * " +sk2+ " + " + "("+sk2+ " - "+sk1+ ")"+ " / "+sk1+ " * " +i+ " = ("+atsakymas+" >"+" 6 )");
                    }
                }
                    System.out.println("\nAr norite tęsti? : (TAIP/NE) ");
                    testi = S3.next();
                    if (!testi.equals("TAIP") && !testi.equals("taip")) {
                        veikia = false;
                    }
                    break;
                default:
                    System.out.println("Neteisingas įvestas simbolis!\nBuvote gražintas į pradžią.\n");
            }
        }
        System.out.println("Programa baigė darbą.");
    }
}