package mokslai.t1;
import java.util.Scanner;
public class WhileIki100 {
    public static void main(String[] args) {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite dauginamą skaičių: ");
        int sk = skaneris.nextInt();
        int i = 1;
        int suma = 0;
        int kartai = 0;
        while (suma < 100) {
            suma = i * sk; kartai++;
            i++;
            System.out.println(i + " * " + sk + " = " + suma);
        }
        System.out.println("Sudauginti reikėjo " +kartai+ " Kartu(-us)");
    }
}
//dalinant du sveikus skaicius ir norint gauti double reikia atlikti konvertavima       atsakymas = (double) 2 / 5;

