package mokslai;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        int sk = 9;
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite skaičių: ");
        sk = skaneris.nextInt();
        for (int i = 1; i < 10; i++) {
            int atsakymas = i * sk;
            if (atsakymas < 50) {
                System.out.println(sk + "*" + i + " = " + atsakymas+ " <50");
            }else if (atsakymas == 50) {
                System.out.println(sk + "*" + i + " = " + atsakymas+" == 50");
            }else {
                System.out.println(sk + "*" + i + " = " + atsakymas+ " > 50");
            }
        }
    }
}
