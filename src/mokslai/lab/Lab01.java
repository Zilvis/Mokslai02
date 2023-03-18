package mokslai.lab;

import java.util.*;

public class Lab01 {
    public static void main(String[] args) {
        Scanner skIvesits = new Scanner(System.in);
        Scanner SimbolIvestis = new Scanner(System.in);
        Scanner spt = new Scanner(System.in); // patikrina ar ivesti teisingi duomenys
        Scanner spt2 = new Scanner(System.in); // Klausia ar norite isnaujo skaiciuoti

        double sk1, sk2, atsakymas;
        String simbolis, kartojimas;
        String pt;
        boolean on = true;

        String pradziosDialogas = "\n\n\nSveiki, tai skaičiuotuvas! Kokius skaičius šiandieną skaičiuosime ?";
        String error = "\n\n\nNaudojate netinkamą simbolį! Leistini simboliai: (* / + -)\nBuvote gražintas į pradžią!";
        String error2 = "\n\n\nDalyba iš nulio negalima!\nBuvote gražintas į pradžią!";
        String baigimasisDialogas3 = "\n\n\nJūsų atsakymas yra: ";
        String baigiamasisDialogas = "\n\n\nAr norite toliau tęsti skaičiavimus ? Įveskite: ( TAIP arba NE )";

        while (on) {
            //Skaiciu ir simboliu ivestis
            System.out.println(pradziosDialogas);
            System.out.print("Įveskite pirmajį skaičių: ");//TODO: Patikrinti ar iveda skaiciu ar raide
            sk1 = skIvesits.nextDouble();
            System.out.print("Įveskite antrajį skaičių: ");
            sk2 = skIvesits.nextDouble();
            System.out.println("Įveskite simbolį: " + sk1 + " (* / + -). " + sk2);
            simbolis = SimbolIvestis.next();

            //Patikrina ar ivede duomenis teisingai
            System.out.println("Ar įvedėte teisingai ?");
            System.out.println(sk1 + " " + simbolis + " " + sk2);
            System.out.println("Įveskite: ( TAIP arba NE )");
            pt = spt.next();

            // Jeigu viskas atitinka reikalavimus daro skaiciavimus
            if (pt.equals("taip") || pt.equals("TAIP")) {
                switch (simbolis) {
                    case "*":
                        atsakymas = (sk1 * sk2);
                        System.out.println(baigimasisDialogas3 + atsakymas);

                        System.out.println(baigiamasisDialogas);
                        kartojimas = spt2.next();
                        if (kartojimas.equals("ne")){
                            on = false;
                        }

                        break;
                    case "/":
                        if (sk2 == 0) {
                            System.out.println(error2);
                            break;
                        } else {
                            atsakymas = (sk1 / sk2);
                            System.out.println(baigimasisDialogas3 + atsakymas);

                            System.out.println(baigiamasisDialogas);
                            kartojimas = spt2.next();
                            if (kartojimas.equals("ne")){
                                on = false;
                            }

                            break;
                        }
                    default:
                        System.out.println(error); //Suvedus bloga simbol
                        break;
                    case "+":
                        atsakymas = (sk1 + sk2);
                        System.out.println(baigimasisDialogas3 + atsakymas);

                        System.out.println(baigiamasisDialogas);
                        kartojimas = spt2.next();
                        if (kartojimas.equals("ne")){
                            on = false;
                        }

                        break;
                    case "-":
                        atsakymas = (sk1 - sk2);
                        System.out.println(baigimasisDialogas3 + atsakymas);

                        System.out.println(baigiamasisDialogas);
                        kartojimas = spt2.next();
                        if (kartojimas.equals("ne")){
                            on = false;
                        }

                        break;
                }
            }
        }
    }
}




/*TODO:
    (* / + -)
    2 skaičius ir operacijos ženklą
    Pagal įvestą ženklą, atliekama operacija
    Dalybai naudojate tipą double
    Jeigu įvedamas kitoks ženklas, parašote, kad operacija negalima
    dalyba iš 0 negalima Po atliktų skaičiavimų, programa paklausia
    UML Diagrama

 */