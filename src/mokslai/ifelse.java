package mokslai;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        int sk = 9;
        String simbolis;

        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite skaičių: ");
        sk = skaneris.nextInt();

        Scanner skaneris2 = new Scanner(System.in);
        System.out.println("Įveskite simbolį: ");
        simbolis = skaneris2.nextLine();
        //System.out.println(simbolis); //Debug

        for (int i = 1; i < 10; i++) {
            int atsakymas = 0;
            atsakymas = i * sk;
            if (simbolis.equals("/")) { //eilutes lyginti tik per funkcija equals
                System.out.println("Atliksime dalybos veiksmus:");
                if (simbolis.equals("/") && atsakymas < 50) {
                    System.out.println(sk + " / " + i + " = " +atsakymas+ " <50");
                }else if (simbolis.equals("/") && atsakymas == 50) {
                    System.out.println(sk + " / " + i + " = " +atsakymas+" == 50");
                }else if (simbolis.equals("/") && atsakymas > 50) {
                    System.out.println(sk + " / " + i + " = " +atsakymas+ " > 50");
                }
                System.out.println("Atliksime daugybos veiksmus:");
            } else if (simbolis.equals("*") && atsakymas < 50) {
                System.out.println(sk + " * " + i + " = " +atsakymas+ " <50");
            }else if (simbolis.equals("*") && atsakymas == 50) {
                System.out.println(sk + " * " + i + " = " +atsakymas+" == 50");
            }else if (simbolis.equals("*") && atsakymas > 50) {
                System.out.println(sk + " * " + i + " = " +atsakymas+ " > 50");
            }
            else { //Visais kitais atvejais
                System.out.println("Neteisingas simbolis");
                break; // sutabdo koda kad viena karta atvaizduotu !
            }
        }
    }
}
